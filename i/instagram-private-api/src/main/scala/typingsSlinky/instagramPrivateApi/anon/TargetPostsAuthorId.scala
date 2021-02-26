package typingsSlinky.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPostsAuthorId extends StObject {
  
  var targetPostsAuthorId: js.UndefOr[String] = js.native
  
  var targetReelAuthorId: js.UndefOr[String] = js.native
}
object TargetPostsAuthorId {
  
  @scala.inline
  def apply(): TargetPostsAuthorId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPostsAuthorId]
  }
  
  @scala.inline
  implicit class TargetPostsAuthorIdMutableBuilder[Self <: TargetPostsAuthorId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetPostsAuthorId(value: String): Self = StObject.set(x, "targetPostsAuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPostsAuthorIdUndefined: Self = StObject.set(x, "targetPostsAuthorId", js.undefined)
    
    @scala.inline
    def setTargetReelAuthorId(value: String): Self = StObject.set(x, "targetReelAuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReelAuthorIdUndefined: Self = StObject.set(x, "targetReelAuthorId", js.undefined)
  }
}
