package typingsSlinky.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wordlist extends js.Object {
  var locale: String = js.native
  def getWord(index: Double): String = js.native
  def getWordIndex(word: String): Double = js.native
  def join(words: js.Array[String]): String = js.native
  def split(mnemonic: String): js.Array[String] = js.native
}

object Wordlist {
  @scala.inline
  def apply(
    getWord: Double => String,
    getWordIndex: String => Double,
    join: js.Array[String] => String,
    locale: String,
    split: String => js.Array[String]
  ): Wordlist = {
    val __obj = js.Dynamic.literal(getWord = js.Any.fromFunction1(getWord), getWordIndex = js.Any.fromFunction1(getWordIndex), join = js.Any.fromFunction1(join), locale = locale.asInstanceOf[js.Any], split = js.Any.fromFunction1(split))
    __obj.asInstanceOf[Wordlist]
  }
  @scala.inline
  implicit class WordlistOps[Self <: Wordlist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetWord(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWordIndex(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWordIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJoin(value: js.Array[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplit(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

