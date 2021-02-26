package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportCatalogToGlueRequest extends StObject {
  
  /**
    * The ID of the catalog to import. Currently, this should be the AWS account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
}
object ImportCatalogToGlueRequest {
  
  @scala.inline
  def apply(): ImportCatalogToGlueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportCatalogToGlueRequest]
  }
  
  @scala.inline
  implicit class ImportCatalogToGlueRequestMutableBuilder[Self <: ImportCatalogToGlueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
  }
}
