package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponsePageInfo extends StObject {
  
  var end_cursor: String = js.native
  
  var has_next_page: Boolean = js.native
}
object PostsInsightsFeedResponsePageInfo {
  
  @scala.inline
  def apply(end_cursor: String, has_next_page: Boolean): PostsInsightsFeedResponsePageInfo = {
    val __obj = js.Dynamic.literal(end_cursor = end_cursor.asInstanceOf[js.Any], has_next_page = has_next_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponsePageInfo]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponsePageInfoMutableBuilder[Self <: PostsInsightsFeedResponsePageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd_cursor(value: String): Self = StObject.set(x, "end_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_next_page(value: Boolean): Self = StObject.set(x, "has_next_page", value.asInstanceOf[js.Any])
  }
}
