package typingsSlinky.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Borderless extends StObject {
  
  var activeOpacity: Double = js.native
  
  var borderless: Boolean = js.native
}
object Borderless {
  
  @scala.inline
  def apply(activeOpacity: Double, borderless: Boolean): Borderless = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any], borderless = borderless.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borderless]
  }
  
  @scala.inline
  implicit class BorderlessMutableBuilder[Self <: Borderless] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
  }
}
