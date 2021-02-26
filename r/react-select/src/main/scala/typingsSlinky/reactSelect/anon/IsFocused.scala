package typingsSlinky.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsFocused extends StObject {
  
  var isFocused: Boolean = js.native
  
  var size: Double = js.native
}
object IsFocused {
  
  @scala.inline
  def apply(isFocused: Boolean, size: Double): IsFocused = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFocused]
  }
  
  @scala.inline
  implicit class IsFocusedMutableBuilder[Self <: IsFocused] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
