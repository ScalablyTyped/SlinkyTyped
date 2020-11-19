package typingsSlinky.antDesignReactNative.imageRollMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageRollTexts extends js.Object {
  
  var cancelText: js.UndefOr[ReactElement] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
}
object ImageRollTexts {
  
  @scala.inline
  def apply(): ImageRollTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageRollTexts]
  }
  
  @scala.inline
  implicit class ImageRollTextsOps[Self <: ImageRollTexts] (val x: Self) extends AnyVal {
    
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
    def setCancelTextReactElement(value: ReactElement): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelText(value: ReactElement): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
