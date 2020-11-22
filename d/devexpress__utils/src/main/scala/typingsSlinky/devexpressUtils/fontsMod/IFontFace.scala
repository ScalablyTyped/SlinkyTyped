package typingsSlinky.devexpressUtils.fontsMod

import typingsSlinky.devexpressUtils.devexpressUtilsStrings.error
import typingsSlinky.devexpressUtils.devexpressUtilsStrings.loaded
import typingsSlinky.devexpressUtils.devexpressUtilsStrings.loading
import typingsSlinky.devexpressUtils.devexpressUtilsStrings.unloaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFontFace extends IFontFaceDescriptors {
  
  var family: String = js.native
  
  val status: unloaded | loading | loaded | error = js.native
}
object IFontFace {
  
  @scala.inline
  def apply(family: String, status: unloaded | loading | loaded | error): IFontFace = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontFace]
  }
  
  @scala.inline
  implicit class IFontFaceOps[Self <: IFontFace] (val x: Self) extends AnyVal {
    
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: unloaded | loading | loaded | error): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
