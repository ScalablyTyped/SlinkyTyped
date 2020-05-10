package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lexicon extends js.Object {
  var defaultCategory: String = js.native
  def parseLexicon(data: String): Unit = js.native
  def tagWord(word: String): js.Array[String] = js.native
}

object Lexicon {
  @scala.inline
  def apply(defaultCategory: String, parseLexicon: String => Unit, tagWord: String => js.Array[String]): Lexicon = {
    val __obj = js.Dynamic.literal(defaultCategory = defaultCategory.asInstanceOf[js.Any], parseLexicon = js.Any.fromFunction1(parseLexicon), tagWord = js.Any.fromFunction1(tagWord))
    __obj.asInstanceOf[Lexicon]
  }
  @scala.inline
  implicit class LexiconOps[Self <: Lexicon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseLexicon(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseLexicon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTagWord(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagWord")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

