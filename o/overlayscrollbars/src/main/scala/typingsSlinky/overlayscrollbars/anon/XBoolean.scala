package typingsSlinky.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XBoolean extends StObject {
  
  var x: Boolean = js.native
  
  var y: Boolean = js.native
}
object XBoolean {
  
  @scala.inline
  def apply(x: Boolean, y: Boolean): XBoolean = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XBoolean]
  }
  
  @scala.inline
  implicit class XBooleanMutableBuilder[Self <: XBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
