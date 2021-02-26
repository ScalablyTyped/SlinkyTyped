package typingsSlinky.reactNativeRssParser

import typingsSlinky.reactNativeRssParser.anon.Authors
import typingsSlinky.reactNativeRssParser.anon.Block
import typingsSlinky.reactNativeRssParser.anon.Description
import typingsSlinky.reactNativeRssParser.anon.Length
import typingsSlinky.reactNativeRssParser.anon.Name
import typingsSlinky.reactNativeRssParser.anon.Rel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-rss-parser", "parse")
  @js.native
  def parse(feedUrl: String): js.Promise[Feed] = js.native
  
  @js.native
  trait Feed extends StObject {
    
    var authors: js.Array[Maybe[Name]] = js.native
    
    var categories: js.Array[Maybe[Name]] = js.native
    
    var copyright: Maybe[String] = js.native
    
    var description: String = js.native
    
    var image: Description = js.native
    
    var items: js.Array[FeedItem] = js.native
    
    var itunes: Block = js.native
    
    var language: String = js.native
    
    var lastPublished: String = js.native
    
    var lastUpdated: String = js.native
    
    var links: js.Array[Rel] = js.native
    
    var title: String = js.native
    
    var `type`: String = js.native
  }
  object Feed {
    
    @scala.inline
    def apply(
      authors: js.Array[Maybe[Name]],
      categories: js.Array[Maybe[Name]],
      description: String,
      image: Description,
      items: js.Array[FeedItem],
      itunes: Block,
      language: String,
      lastPublished: String,
      lastUpdated: String,
      links: js.Array[Rel],
      title: String,
      `type`: String
    ): Feed = {
      val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], itunes = itunes.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastPublished = lastPublished.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feed]
    }
    
    @scala.inline
    implicit class FeedMutableBuilder[Self <: Feed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthors(value: js.Array[Maybe[Name]]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorsVarargs(value: Maybe[Name]*): Self = StObject.set(x, "authors", js.Array(value :_*))
      
      @scala.inline
      def setCategories(value: js.Array[Maybe[Name]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesVarargs(value: Maybe[Name]*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setCopyright(value: Maybe[String]): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: Description): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[FeedItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: FeedItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setItunes(value: Block): Self = StObject.set(x, "itunes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPublished(value: String): Self = StObject.set(x, "lastPublished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinks(value: js.Array[Rel]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksVarargs(value: Rel*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeedItem extends StObject {
    
    var authors: js.Array[Maybe[Name]] = js.native
    
    var categories: js.Array[Maybe[Name]] = js.native
    
    var content: String = js.native
    
    var description: String = js.native
    
    var enclosures: js.Array[Length] = js.native
    
    var id: String = js.native
    
    var itunes: Authors = js.native
    
    var links: js.Array[Rel] = js.native
    
    var published: String = js.native
    
    var title: String = js.native
  }
  object FeedItem {
    
    @scala.inline
    def apply(
      authors: js.Array[Maybe[Name]],
      categories: js.Array[Maybe[Name]],
      content: String,
      description: String,
      enclosures: js.Array[Length],
      id: String,
      itunes: Authors,
      links: js.Array[Rel],
      published: String,
      title: String
    ): FeedItem = {
      val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itunes = itunes.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedItem]
    }
    
    @scala.inline
    implicit class FeedItemMutableBuilder[Self <: FeedItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthors(value: js.Array[Maybe[Name]]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorsVarargs(value: Maybe[Name]*): Self = StObject.set(x, "authors", js.Array(value :_*))
      
      @scala.inline
      def setCategories(value: js.Array[Maybe[Name]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesVarargs(value: Maybe[Name]*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnclosures(value: js.Array[Length]): Self = StObject.set(x, "enclosures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnclosuresVarargs(value: Length*): Self = StObject.set(x, "enclosures", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunes(value: Authors): Self = StObject.set(x, "itunes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinks(value: js.Array[Rel]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksVarargs(value: Rel*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Maybe[T] = js.UndefOr[T]
}
