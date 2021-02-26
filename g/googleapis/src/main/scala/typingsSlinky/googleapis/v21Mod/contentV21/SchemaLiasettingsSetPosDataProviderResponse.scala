package typingsSlinky.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiasettingsSetPosDataProviderResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsSetPosDataProviderResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaLiasettingsSetPosDataProviderResponse {
  
  @scala.inline
  def apply(): SchemaLiasettingsSetPosDataProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsSetPosDataProviderResponse]
  }
  
  @scala.inline
  implicit class SchemaLiasettingsSetPosDataProviderResponseMutableBuilder[Self <: SchemaLiasettingsSetPosDataProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
