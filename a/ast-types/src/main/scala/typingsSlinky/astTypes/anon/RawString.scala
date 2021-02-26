package typingsSlinky.astTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawString extends StObject {
  
  var raw: String = js.native
  
  var rawValue: String = js.native
}
object RawString {
  
  @scala.inline
  def apply(raw: String, rawValue: String): RawString = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawString]
  }
  
  @scala.inline
  implicit class RawStringMutableBuilder[Self <: RawString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
  }
}
