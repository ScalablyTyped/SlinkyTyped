package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interconnects extends js.Object {
  /**
    * The interconnects.
    */
  var interconnects: js.UndefOr[InterconnectList] = js.native
}

object Interconnects {
  @scala.inline
  def apply(): Interconnects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interconnects]
  }
  @scala.inline
  implicit class InterconnectsOps[Self <: Interconnects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterconnects(value: InterconnectList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterconnects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnects")(js.undefined)
        ret
    }
  }
  
}

