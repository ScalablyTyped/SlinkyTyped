package typingsSlinky.officeUiFabricReact.calloutStatusExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStatusCalloutExampleState extends js.Object {
  var isCalloutVisible: js.UndefOr[Boolean] = js.native
}

object IStatusCalloutExampleState {
  @scala.inline
  def apply(): IStatusCalloutExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatusCalloutExampleState]
  }
  @scala.inline
  implicit class IStatusCalloutExampleStateOps[Self <: IStatusCalloutExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCalloutVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalloutVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCalloutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalloutVisible")(js.undefined)
        ret
    }
  }
  
}

