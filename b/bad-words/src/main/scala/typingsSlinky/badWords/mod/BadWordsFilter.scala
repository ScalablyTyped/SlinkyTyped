package typingsSlinky.badWords.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadWordsFilter extends js.Object {
  def addWords(words: String*): Unit = js.native
  def clean(text: String): String = js.native
  def isProfane(text: String): Boolean = js.native
  def removeWords(words: String*): Unit = js.native
  def replaceWord(text: String): String = js.native
}

object BadWordsFilter {
  @scala.inline
  def apply(
    addWords: /* repeated */ String => Unit,
    clean: String => String,
    isProfane: String => Boolean,
    removeWords: /* repeated */ String => Unit,
    replaceWord: String => String
  ): BadWordsFilter = {
    val __obj = js.Dynamic.literal(addWords = js.Any.fromFunction1(addWords), clean = js.Any.fromFunction1(clean), isProfane = js.Any.fromFunction1(isProfane), removeWords = js.Any.fromFunction1(removeWords), replaceWord = js.Any.fromFunction1(replaceWord))
    __obj.asInstanceOf[BadWordsFilter]
  }
  @scala.inline
  implicit class BadWordsFilterOps[Self <: BadWordsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddWords(value: /* repeated */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClean(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsProfane(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProfane")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveWords(value: /* repeated */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceWord(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWord")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

