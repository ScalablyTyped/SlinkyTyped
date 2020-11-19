package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportCatalogToGlueRequest extends js.Object {
  
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
  implicit class ImportCatalogToGlueRequestOps[Self <: ImportCatalogToGlueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
}
