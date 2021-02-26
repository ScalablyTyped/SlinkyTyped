package typingsSlinky.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefParams extends ErrorParameters {
  
  var ref: String = js.native
}
object RefParams {
  
  @scala.inline
  def apply(ref: String): RefParams = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefParams]
  }
  
  @scala.inline
  implicit class RefParamsMutableBuilder[Self <: RefParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
