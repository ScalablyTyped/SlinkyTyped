package typingsSlinky.gestalt.mod

import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.gestaltStrings.circle
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.rectangle
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastProps extends js.Object {
  
  var button: js.UndefOr[ReactElement] = js.native
  
  var color: js.UndefOr[darkGray | red] = js.native
  
  var text: js.UndefOr[String | ReactElement] = js.native
  
  var thumbnail: js.UndefOr[ReactElement] = js.native
  
  var thumbnailShape: js.UndefOr[circle | rectangle | square] = js.native
}
object ToastProps {
  
  @scala.inline
  def apply(): ToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastProps]
  }
  
  @scala.inline
  implicit class ToastPropsOps[Self <: ToastProps] (val x: Self) extends AnyVal {
    
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
    def setButtonReactElement(value: ReactElement): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: ReactElement): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setColor(value: darkGray | red): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setTextReactElement(value: ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String | ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setThumbnailReactElement(value: ReactElement): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: ReactElement): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setThumbnailShape(value: circle | rectangle | square): Self = this.set("thumbnailShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailShape: Self = this.set("thumbnailShape", js.undefined)
  }
}
