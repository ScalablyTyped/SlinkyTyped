package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonClick extends StObject {
  
  def buttonClick(): Unit = js.native
  
  var buttonType: String = js.native
  
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
}
object ButtonClick {
  
  @scala.inline
  def apply(buttonClick: () => Unit, buttonType: String, styles: StringDictionary[RegisteredStyle[_]]): ButtonClick = {
    val __obj = js.Dynamic.literal(buttonClick = js.Any.fromFunction0(buttonClick), buttonType = buttonType.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonClick]
  }
  
  @scala.inline
  implicit class ButtonClickMutableBuilder[Self <: ButtonClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonClick(value: () => Unit): Self = StObject.set(x, "buttonClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[_]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
