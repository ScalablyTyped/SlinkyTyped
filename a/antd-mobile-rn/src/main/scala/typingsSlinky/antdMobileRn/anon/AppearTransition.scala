package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppearTransition extends StObject {
  
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
  implicit class AppearTransitionMutableBuilder[Self <: AppearTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppearTransition(value: Boolean): Self = StObject.set(x, "appearTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[_]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfilled(value: Boolean): Self = StObject.set(x, "unfilled", value.asInstanceOf[js.Any])
  }
}
