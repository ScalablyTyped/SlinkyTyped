package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1CatalogInlineSource extends js.Object {
  
  /** Optional. A list of catalog items to update/create. Recommended max of 10k items. */
  var catalogItems: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1CatalogItem]] = js.native
}
object GoogleCloudRecommendationengineV1beta1CatalogInlineSource {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1CatalogInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1CatalogInlineSource]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1CatalogInlineSourceOps[Self <: GoogleCloudRecommendationengineV1beta1CatalogInlineSource] (val x: Self) extends AnyVal {
    
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
    def setCatalogItemsVarargs(value: GoogleCloudRecommendationengineV1beta1CatalogItem*): Self = this.set("catalogItems", js.Array(value :_*))
    
    @scala.inline
    def setCatalogItems(value: js.Array[GoogleCloudRecommendationengineV1beta1CatalogItem]): Self = this.set("catalogItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogItems: Self = this.set("catalogItems", js.undefined)
  }
}
