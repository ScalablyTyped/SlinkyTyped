package typingsSlinky.officeUiFabricReact.keytipLayerTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInnerContent(value: IStyle): Self = this.set("innerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerContent: Self = this.set("innerContent", js.undefined)
    
    @scala.inline
    def setInnerContentNull: Self = this.set("innerContent", null)
  }
}
