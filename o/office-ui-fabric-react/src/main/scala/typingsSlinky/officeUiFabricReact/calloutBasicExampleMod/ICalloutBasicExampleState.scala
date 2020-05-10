package typingsSlinky.officeUiFabricReact.calloutBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutBasicExampleState extends js.Object {
  var isCalloutVisible: js.UndefOr[Boolean] = js.native
}

object ICalloutBasicExampleState {
  @scala.inline
  def apply(): ICalloutBasicExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutBasicExampleState]
  }
  @scala.inline
  implicit class ICalloutBasicExampleStateOps[Self <: ICalloutBasicExampleState] (val x: Self) extends AnyVal {
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

