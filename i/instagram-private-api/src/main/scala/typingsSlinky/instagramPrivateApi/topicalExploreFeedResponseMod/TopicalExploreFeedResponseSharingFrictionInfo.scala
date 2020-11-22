package typingsSlinky.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseSharingFrictionInfo extends js.Object {
  
  var bloks_app_url: Null = js.native
  
  var should_have_sharing_friction: Boolean = js.native
}
object TopicalExploreFeedResponseSharingFrictionInfo {
  
  @scala.inline
  def apply(bloks_app_url: Null, should_have_sharing_friction: Boolean): TopicalExploreFeedResponseSharingFrictionInfo = {
    val __obj = js.Dynamic.literal(bloks_app_url = bloks_app_url.asInstanceOf[js.Any], should_have_sharing_friction = should_have_sharing_friction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseSharingFrictionInfo]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseSharingFrictionInfoOps[Self <: TopicalExploreFeedResponseSharingFrictionInfo] (val x: Self) extends AnyVal {
    
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
    def setBloks_app_url(value: Null): Self = this.set("bloks_app_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShould_have_sharing_friction(value: Boolean): Self = this.set("should_have_sharing_friction", value.asInstanceOf[js.Any])
  }
}
