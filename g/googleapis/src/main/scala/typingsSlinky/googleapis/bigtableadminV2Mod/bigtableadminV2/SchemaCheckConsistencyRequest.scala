package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for
  * google.bigtable.admin.v2.BigtableTableAdmin.CheckConsistency
  */
@js.native
trait SchemaCheckConsistencyRequest extends StObject {
  
  /**
    * The token created using GenerateConsistencyToken for the Table.
    */
  var consistencyToken: js.UndefOr[String] = js.native
}
object SchemaCheckConsistencyRequest {
  
  @scala.inline
  def apply(): SchemaCheckConsistencyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckConsistencyRequest]
  }
  
  @scala.inline
  implicit class SchemaCheckConsistencyRequestMutableBuilder[Self <: SchemaCheckConsistencyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistencyToken(value: String): Self = StObject.set(x, "consistencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistencyTokenUndefined: Self = StObject.set(x, "consistencyToken", js.undefined)
  }
}
