package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stemmer extends js.Object {
  def attach(): Unit = js.native
  def stem(token: String): String = js.native
  def tokenizeAndStem(text: String): js.Array[String] = js.native
}

object Stemmer {
  @scala.inline
  def apply(attach: () => Unit, stem: String => String, tokenizeAndStem: String => js.Array[String]): Stemmer = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), stem = js.Any.fromFunction1(stem), tokenizeAndStem = js.Any.fromFunction1(tokenizeAndStem))
    __obj.asInstanceOf[Stemmer]
  }
  @scala.inline
  implicit class StemmerOps[Self <: Stemmer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStem(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTokenizeAndStem(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizeAndStem")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

