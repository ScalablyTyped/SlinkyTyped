package typingsSlinky.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseInItem extends js.Object {
  
  var duration_in_video_in_sec: js.UndefOr[Null] = js.native
  
  var position: js.Array[Double | String] = js.native
  
  var product: js.UndefOr[TopicalExploreFeedResponseProduct] = js.native
  
  var start_time_in_video_in_sec: js.UndefOr[Null] = js.native
  
  var user: js.UndefOr[TopicalExploreFeedResponseUser] = js.native
}
object TopicalExploreFeedResponseInItem {
  
  @scala.inline
  def apply(position: js.Array[Double | String]): TopicalExploreFeedResponseInItem = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseInItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseInItemOps[Self <: TopicalExploreFeedResponseInItem] (val x: Self) extends AnyVal {
    
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
    def setPositionVarargs(value: (Double | String)*): Self = this.set("position", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: js.Array[Double | String]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: TopicalExploreFeedResponseProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setUser(value: TopicalExploreFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
