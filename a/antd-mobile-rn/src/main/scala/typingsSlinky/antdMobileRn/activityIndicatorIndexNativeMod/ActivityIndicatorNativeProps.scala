package typingsSlinky.antdMobileRn.activityIndicatorIndexNativeMod

import typingsSlinky.antdMobileRn.activityIndicatorPropsTypeMod.ActivityIndicatorPropTypes
import typingsSlinky.antdMobileRn.styleIndexDotnativeMod.IActivityIndicatorStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityIndicatorNativeProps extends ActivityIndicatorPropTypes {
  
  var color: js.UndefOr[String] = js.native
  
  var styles: js.UndefOr[IActivityIndicatorStyle] = js.native
}
object ActivityIndicatorNativeProps {
  
  @scala.inline
  def apply(): ActivityIndicatorNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityIndicatorNativeProps]
  }
  
  @scala.inline
  implicit class ActivityIndicatorNativePropsOps[Self <: ActivityIndicatorNativeProps] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setStyles(value: IActivityIndicatorStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
