package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppearTransition extends js.Object {
  
  var appearTransition: Boolean = js.native
  
  var percent: Double = js.native
  
  var position: String = js.native
  
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
  
  var unfilled: Boolean = js.native
}
object AppearTransition {
  
  @scala.inline
  def apply(
    appearTransition: Boolean,
    percent: Double,
    position: String,
    styles: StringDictionary[RegisteredStyle[_]],
    unfilled: Boolean
  ): AppearTransition = {
    val __obj = js.Dynamic.literal(appearTransition = appearTransition.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], unfilled = unfilled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearTransition]
  }
  
  @scala.inline
  implicit class AppearTransitionOps[Self <: AppearTransition] (val x: Self) extends AnyVal {
    
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
    def setAppearTransition(value: Boolean): Self = this.set("appearTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[_]]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfilled(value: Boolean): Self = this.set("unfilled", value.asInstanceOf[js.Any])
  }
}
