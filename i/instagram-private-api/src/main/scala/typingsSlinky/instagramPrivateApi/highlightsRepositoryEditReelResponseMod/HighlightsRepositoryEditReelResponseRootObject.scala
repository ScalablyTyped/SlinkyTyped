package typingsSlinky.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseRootObject extends js.Object {
  
  var reel: HighlightsRepositoryEditReelResponseReel = js.native
  
  var status: String = js.native
}
object HighlightsRepositoryEditReelResponseRootObject {
  
  @scala.inline
  def apply(reel: HighlightsRepositoryEditReelResponseReel, status: String): HighlightsRepositoryEditReelResponseRootObject = {
    val __obj = js.Dynamic.literal(reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseRootObject]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseRootObjectOps[Self <: HighlightsRepositoryEditReelResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setReel(value: HighlightsRepositoryEditReelResponseReel): Self = this.set("reel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
