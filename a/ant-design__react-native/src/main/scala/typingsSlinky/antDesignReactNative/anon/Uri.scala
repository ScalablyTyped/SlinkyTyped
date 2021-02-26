package typingsSlinky.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uri extends StObject {
  
  var uri: js.Any = js.native
}
object Uri {
  
  @scala.inline
  def apply(uri: js.Any): Uri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
  
  @scala.inline
  implicit class UriMutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: js.Any): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
