package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplicitParam extends js.Object {
  var explicit: Boolean = js.native
}

object ExplicitParam {
  @scala.inline
  def apply(explicit: Boolean): ExplicitParam = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitParam]
  }
  @scala.inline
  implicit class ExplicitParamOps[Self <: ExplicitParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplicit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

