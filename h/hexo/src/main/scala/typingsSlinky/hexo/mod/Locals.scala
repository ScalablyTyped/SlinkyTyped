package typingsSlinky.hexo.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hexo.hexoStrings.categories
import typingsSlinky.hexo.hexoStrings.pages
import typingsSlinky.hexo.hexoStrings.posts
import typingsSlinky.hexo.hexoStrings.tags
import typingsSlinky.hexo.mod.Locals.Category
import typingsSlinky.hexo.mod.Locals.Page
import typingsSlinky.hexo.mod.Locals.Tag
import typingsSlinky.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locals extends StObject {
  
  /**
    * Get a Variable
    */
  def get(`type`: String): js.Any = js.native
  @JSName("get")
  def get_categories(`type`: categories): Model[Category] = js.native
  @JSName("get")
  def get_pages(`type`: pages): Model[Page] = js.native
  @JSName("get")
  def get_posts(`type`: posts): Model[typingsSlinky.hexo.mod.Locals.Post] = js.native
  @JSName("get")
  def get_tags(`type`: tags): Model[Tag] = js.native
  
  /**
    * Invalidate the cache
    */
  def invalidate(): this.type = js.native
  
  /**
    * Remove a Variable
    */
  def remove(`type`: String): this.type = js.native
  
  /**
    * Set a Variable
    */
  def set(`type`: String, fn: js.Function0[_]): this.type = js.native
  
  /**
    * Get All Variable
    */
  def toObject(): js.Any = js.native
}
object Locals {
  
  @js.native
  trait Category extends Tag {
    
    var parent: String = js.native
  }
  object Category {
    
    @scala.inline
    def apply(
      length: Double,
      name: String,
      parent: String,
      path: String,
      permalink: String,
      posts: Model[typingsSlinky.hexo.mod.Locals.Post],
      slug: String
    ): Category = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Page
    extends /* key */ StringDictionary[js.Any] {
    
    var comments: Boolean = js.native
    
    var content: String = js.native
    
    var date: Moment = js.native
    
    var excerpt: js.UndefOr[String] = js.native
    
    var full_source: String = js.native
    
    var layout: String = js.native
    
    var link: js.UndefOr[String] = js.native
    
    var more: js.UndefOr[String] = js.native
    
    var next: js.UndefOr[Null | Page] = js.native
    
    var path: String = js.native
    
    var permalink: String = js.native
    
    var photos: js.UndefOr[js.Array[String]] = js.native
    
    var prev: js.UndefOr[Null | Page] = js.native
    
    var raw: js.UndefOr[String] = js.native
    
    var source: String = js.native
    
    var title: String = js.native
    
    var updated: js.UndefOr[Moment] = js.native
  }
  object Page {
    
    @scala.inline
    def apply(
      comments: Boolean,
      content: String,
      date: Moment,
      full_source: String,
      layout: String,
      path: String,
      permalink: String,
      source: String,
      title: String
    ): Page = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], full_source = full_source.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    @scala.inline
    implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcerpt(value: String): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcerptUndefined: Self = StObject.set(x, "excerpt", js.undefined)
      
      @scala.inline
      def setFull_source(value: String): Self = StObject.set(x, "full_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setMore(value: String): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreUndefined: Self = StObject.set(x, "more", js.undefined)
      
      @scala.inline
      def setNext(value: Page): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: js.Array[String]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
      
      @scala.inline
      def setPhotosVarargs(value: String*): Self = StObject.set(x, "photos", js.Array(value :_*))
      
      @scala.inline
      def setPrev(value: Page): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevNull: Self = StObject.set(x, "prev", null)
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: Moment): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    }
  }
  
  @js.native
  trait Post extends Page {
    
    var categories: js.UndefOr[js.Array[String]] = js.native
    
    var published: js.UndefOr[Boolean] = js.native
    
    var tags: js.Array[String] = js.native
  }
  object Post {
    
    @scala.inline
    def apply(
      comments: Boolean,
      content: String,
      date: Moment,
      full_source: String,
      layout: String,
      path: String,
      permalink: String,
      source: String,
      tags: js.Array[String],
      title: String
    ): typingsSlinky.hexo.mod.Locals.Post = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], full_source = full_source.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.hexo.mod.Locals.Post]
    }
    
    @scala.inline
    implicit class PostMutableBuilder[Self <: typingsSlinky.hexo.mod.Locals.Post] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      @scala.inline
      def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var permalink: String = js.native
    
    var posts: Model[typingsSlinky.hexo.mod.Locals.Post] = js.native
    
    var slug: String = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(
      length: Double,
      name: String,
      path: String,
      permalink: String,
      posts: Model[typingsSlinky.hexo.mod.Locals.Post],
      slug: String
    ): Tag = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosts(value: Model[typingsSlinky.hexo.mod.Locals.Post]): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
}
