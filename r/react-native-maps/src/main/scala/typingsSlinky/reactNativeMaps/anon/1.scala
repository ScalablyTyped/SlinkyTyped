package typingsSlinky.reactNativeMaps.anon

import typingsSlinky.reactNativeMaps.reactNativeMapsStrings.`callout-inside-press`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var action: `callout-inside-press` = js.native
}
object `1` {
  
  @scala.inline
  def apply(action: `callout-inside-press`): `1` = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: `callout-inside-press`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
