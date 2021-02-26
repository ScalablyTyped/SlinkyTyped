package typingsSlinky.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about an auditable service.
  */
@js.native
trait SchemaAuditableService extends StObject {
  
  /**
    * Public name of the service. For example, the service name for Cloud IAM
    * is &#39;iam.googleapis.com&#39;.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaAuditableService {
  
  @scala.inline
  def apply(): SchemaAuditableService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditableService]
  }
  
  @scala.inline
  implicit class SchemaAuditableServiceMutableBuilder[Self <: SchemaAuditableService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
