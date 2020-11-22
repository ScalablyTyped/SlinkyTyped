package typingsSlinky.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1ExportTaxonomiesResponse extends js.Object {
  
  /** List of taxonomies and policy tags in a tree structure. */
  var taxonomies: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1SerializedTaxonomy]] = js.native
}
object GoogleCloudDatacatalogV1beta1ExportTaxonomiesResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ExportTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ExportTaxonomiesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ExportTaxonomiesResponseOps[Self <: GoogleCloudDatacatalogV1beta1ExportTaxonomiesResponse] (val x: Self) extends AnyVal {
    
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
    def setTaxonomiesVarargs(value: GoogleCloudDatacatalogV1beta1SerializedTaxonomy*): Self = this.set("taxonomies", js.Array(value :_*))
    
    @scala.inline
    def setTaxonomies(value: js.Array[GoogleCloudDatacatalogV1beta1SerializedTaxonomy]): Self = this.set("taxonomies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxonomies: Self = this.set("taxonomies", js.undefined)
  }
}
