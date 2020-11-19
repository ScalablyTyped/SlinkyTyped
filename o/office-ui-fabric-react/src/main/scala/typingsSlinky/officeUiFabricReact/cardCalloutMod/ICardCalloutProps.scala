package typingsSlinky.officeUiFabricReact.cardCalloutMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.baseCardTypesMod.IBaseCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardCalloutProps
  extends IBaseCardProps[js.Object, js.Object, js.Object] {
  
  var content: js.UndefOr[ReactElement] = js.native
  
  var finalHeight: js.UndefOr[Double] = js.native
}
object ICardCalloutProps {
  
  @scala.inline
  def apply(): ICardCalloutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardCalloutProps]
  }
  
  @scala.inline
  implicit class ICardCalloutPropsOps[Self <: ICardCalloutProps] (val x: Self) extends AnyVal {
    
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
    def setContent(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFinalHeight(value: Double): Self = this.set("finalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalHeight: Self = this.set("finalHeight", js.undefined)
  }
}
