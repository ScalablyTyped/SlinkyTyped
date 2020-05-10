package typingsSlinky.officeUiFabricReact.keytipLayerBaseMod

import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipLayerState extends js.Object {
  var inKeytipMode: Boolean = js.native
  var keytips: js.Array[IKeytipProps] = js.native
  var visibleKeytips: js.Array[IKeytipProps] = js.native
}

object IKeytipLayerState {
  @scala.inline
  def apply(inKeytipMode: Boolean, keytips: js.Array[IKeytipProps], visibleKeytips: js.Array[IKeytipProps]): IKeytipLayerState = {
    val __obj = js.Dynamic.literal(inKeytipMode = inKeytipMode.asInstanceOf[js.Any], keytips = keytips.asInstanceOf[js.Any], visibleKeytips = visibleKeytips.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipLayerState]
  }
  @scala.inline
  implicit class IKeytipLayerStateOps[Self <: IKeytipLayerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInKeytipMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inKeytipMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeytips(value: js.Array[IKeytipProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleKeytips(value: js.Array[IKeytipProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleKeytips")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

