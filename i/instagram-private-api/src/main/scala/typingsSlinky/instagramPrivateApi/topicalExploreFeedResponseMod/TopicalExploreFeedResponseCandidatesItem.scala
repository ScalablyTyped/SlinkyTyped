package typingsSlinky.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseCandidatesItem extends js.Object {
  
  var estimated_scans_sizes: js.UndefOr[js.Array[Double]] = js.native
  
  var height: Double = js.native
  
  var scans_profile: js.UndefOr[String] = js.native
  
  var url: String = js.native
  
  var width: Double = js.native
}
object TopicalExploreFeedResponseCandidatesItem {
  
  @scala.inline
  def apply(height: Double, url: String, width: Double): TopicalExploreFeedResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseCandidatesItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseCandidatesItemOps[Self <: TopicalExploreFeedResponseCandidatesItem] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimated_scans_sizesVarargs(value: Double*): Self = this.set("estimated_scans_sizes", js.Array(value :_*))
    
    @scala.inline
    def setEstimated_scans_sizes(value: js.Array[Double]): Self = this.set("estimated_scans_sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimated_scans_sizes: Self = this.set("estimated_scans_sizes", js.undefined)
    
    @scala.inline
    def setScans_profile(value: String): Self = this.set("scans_profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScans_profile: Self = this.set("scans_profile", js.undefined)
  }
}
