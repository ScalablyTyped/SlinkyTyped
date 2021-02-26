package typingsSlinky.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Convert[U] extends StObject {
  
  var convert: Boolean = js.native
  
  var error: U = js.native
}
object Convert {
  
  @scala.inline
  def apply[U](convert: Boolean, error: U): Convert[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Convert[U]]
  }
  
  @scala.inline
  implicit class ConvertMutableBuilder[Self <: Convert[_], U] (val x: Self with Convert[U]) extends AnyVal {
    
    @scala.inline
    def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: U): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
