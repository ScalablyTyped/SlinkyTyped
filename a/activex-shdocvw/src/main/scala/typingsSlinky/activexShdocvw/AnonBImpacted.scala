package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBImpacted extends js.Object {
  val bImpacted: Boolean = js.native
}

object AnonBImpacted {
  @scala.inline
  def apply(bImpacted: Boolean): AnonBImpacted = {
    val __obj = js.Dynamic.literal(bImpacted = bImpacted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBImpacted]
  }
  @scala.inline
  implicit class AnonBImpactedOps[Self <: AnonBImpacted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBImpacted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bImpacted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

