package typingsSlinky.antdMobile.activityIndicatorPropsTypeMod

import typingsSlinky.antdMobile.antdMobileStrings.large
import typingsSlinky.antdMobile.antdMobileStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityIndicatorPropTypes extends js.Object {
  
  var animating: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[large | small] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var toast: js.UndefOr[Boolean] = js.native
}
object ActivityIndicatorPropTypes {
  
  @scala.inline
  def apply(): ActivityIndicatorPropTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityIndicatorPropTypes]
  }
  
  @scala.inline
  implicit class ActivityIndicatorPropTypesOps[Self <: ActivityIndicatorPropTypes] (val x: Self) extends AnyVal {
    
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
    def setAnimating(value: Boolean): Self = this.set("animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimating: Self = this.set("animating", js.undefined)
    
    @scala.inline
    def setSize(value: large | small): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setToast(value: Boolean): Self = this.set("toast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToast: Self = this.set("toast", js.undefined)
  }
}
