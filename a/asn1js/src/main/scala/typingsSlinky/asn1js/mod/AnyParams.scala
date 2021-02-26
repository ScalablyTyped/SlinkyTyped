package typingsSlinky.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyParams extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var optional: js.UndefOr[scala.Boolean] = js.native
}
object AnyParams {
  
  @scala.inline
  def apply(): AnyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnyParams]
  }
  
  @scala.inline
  implicit class AnyParamsMutableBuilder[Self <: AnyParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
