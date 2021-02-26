package typingsSlinky.hexo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexPage extends StObject {
  
  var current: js.UndefOr[Double] = js.native
  
  var current_url: js.UndefOr[String] = js.native
  
  var next: js.UndefOr[Double] = js.native
  
  var next_link: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var per_page: js.UndefOr[Double] = js.native
  
  var posts: js.UndefOr[js.Object] = js.native
  
  var prev: js.UndefOr[Double] = js.native
  
  var prev_link: js.UndefOr[String] = js.native
  
  var total: js.UndefOr[Double] = js.native
}
object IndexPage {
  
  @scala.inline
  def apply(): IndexPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexPage]
  }
  
  @scala.inline
  implicit class IndexPageMutableBuilder[Self <: IndexPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setCurrent_url(value: String): Self = StObject.set(x, "current_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_urlUndefined: Self = StObject.set(x, "current_url", js.undefined)
    
    @scala.inline
    def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setNext_link(value: String): Self = StObject.set(x, "next_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_linkUndefined: Self = StObject.set(x, "next_link", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setPosts(value: js.Object): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostsUndefined: Self = StObject.set(x, "posts", js.undefined)
    
    @scala.inline
    def setPrev(value: Double): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    @scala.inline
    def setPrev_link(value: String): Self = StObject.set(x, "prev_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev_linkUndefined: Self = StObject.set(x, "prev_link", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
