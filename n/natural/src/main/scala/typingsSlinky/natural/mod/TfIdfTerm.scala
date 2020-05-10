package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfIdfTerm extends js.Object {
  var term: String = js.native
  var tfidf: Double = js.native
}

object TfIdfTerm {
  @scala.inline
  def apply(term: String, tfidf: Double): TfIdfTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any], tfidf = tfidf.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfIdfTerm]
  }
  @scala.inline
  implicit class TfIdfTermOps[Self <: TfIdfTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfidf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfidf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

