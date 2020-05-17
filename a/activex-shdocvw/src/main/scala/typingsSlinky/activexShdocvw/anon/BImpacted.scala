package typingsSlinky.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BImpacted extends js.Object {
  val bImpacted: Boolean = js.native
}

object BImpacted {
  @scala.inline
  def apply(bImpacted: Boolean): BImpacted = {
    val __obj = js.Dynamic.literal(bImpacted = bImpacted.asInstanceOf[js.Any])
    __obj.asInstanceOf[BImpacted]
  }
  @scala.inline
  implicit class BImpactedOps[Self <: BImpacted] (val x: Self) extends AnyVal {
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

