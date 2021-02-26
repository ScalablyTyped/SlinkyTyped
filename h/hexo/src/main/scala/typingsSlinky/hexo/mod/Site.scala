package typingsSlinky.hexo.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hexo.mod.Locals.Category
import typingsSlinky.hexo.mod.Locals.Page
import typingsSlinky.hexo.mod.Locals.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Site extends StObject {
  
  var categories: Model[Category] = js.native
  
  var data: StringDictionary[js.Any] = js.native
  
  var pages: Model[Page] = js.native
  
  var posts: Model[typingsSlinky.hexo.mod.Locals.Post] = js.native
  
  var tags: Model[Tag] = js.native
}
object Site {
  
  @scala.inline
  def apply(
    categories: Model[Category],
    data: StringDictionary[js.Any],
    pages: Model[Page],
    posts: Model[typingsSlinky.hexo.mod.Locals.Post],
    tags: Model[Tag]
  ): Site = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit class SiteMutableBuilder[Self <: Site] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: Model[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Model[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosts(value: Model[typingsSlinky.hexo.mod.Locals.Post]): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Model[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
