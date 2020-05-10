package typingsSlinky.markdownIt.stateInlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenMata extends js.Object {
  var delimiters: js.Array[Delimiter] = js.native
}

object TokenMata {
  @scala.inline
  def apply(delimiters: js.Array[Delimiter]): TokenMata = {
    val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenMata]
  }
  @scala.inline
  implicit class TokenMataOps[Self <: TokenMata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiters(value: js.Array[Delimiter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

