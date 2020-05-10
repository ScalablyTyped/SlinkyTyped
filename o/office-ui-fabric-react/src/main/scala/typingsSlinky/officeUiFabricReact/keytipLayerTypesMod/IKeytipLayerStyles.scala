package typingsSlinky.officeUiFabricReact.keytipLayerTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipLayerStyles extends js.Object {
  var innerContent: IStyle = js.native
}

object IKeytipLayerStyles {
  @scala.inline
  def apply(): IKeytipLayerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeytipLayerStyles]
  }
  @scala.inline
  implicit class IKeytipLayerStylesOps[Self <: IKeytipLayerStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInnerContent(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContent")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContent")(null)
        ret
    }
  }
  
}

