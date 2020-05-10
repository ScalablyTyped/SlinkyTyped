package typingsSlinky.officeUiFabricReact.calloutCoverExampleMod

import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutCoverExampleState extends js.Object {
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  var isCalloutVisible: js.UndefOr[Boolean] = js.native
}

object ICalloutCoverExampleState {
  @scala.inline
  def apply(): ICalloutCoverExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutCoverExampleState]
  }
  @scala.inline
  implicit class ICalloutCoverExampleStateOps[Self <: ICalloutCoverExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectionalHint(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(js.undefined)
        ret
    }
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

