package typingsSlinky.expoConfigureSplashScreen.anon

import typingsSlinky.colorString.mod.Color
import typingsSlinky.expoConfigureSplashScreen.constantsMod.SplashScreenStatusBarStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorStyle extends js.Object {
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var style: js.UndefOr[SplashScreenStatusBarStyleType] = js.native
}
object BackgroundColorStyle {
  
  @scala.inline
  def apply(): BackgroundColorStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorStyle]
  }
  
  @scala.inline
  implicit class BackgroundColorStyleOps[Self <: BackgroundColorStyle] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setStyle(value: SplashScreenStatusBarStyleType): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
