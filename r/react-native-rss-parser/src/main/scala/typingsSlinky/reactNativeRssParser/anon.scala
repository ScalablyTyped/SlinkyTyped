package typingsSlinky.reactNativeRssParser

import typingsSlinky.reactNativeRssParser.mod.Maybe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Authors extends StObject {
    
    var authors: Maybe[js.Array[Name]] = js.native
    
    var block: Maybe[String] = js.native
    
    var duration: String = js.native
    
    var explicit: String = js.native
    
    var image: Maybe[String] = js.native
    
    var isClosedCaptioned: Maybe[String] = js.native
    
    var order: Maybe[String] = js.native
    
    var subtitle: String = js.native
    
    var summary: Maybe[String] = js.native
  }
  object Authors {
    
    @scala.inline
    def apply(duration: String, explicit: String, subtitle: String): Authors = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authors]
    }
    
    @scala.inline
    implicit class AuthorsMutableBuilder[Self <: Authors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthors(value: Maybe[js.Array[Name]]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
      
      @scala.inline
      def setAuthorsVarargs(value: Name*): Self = StObject.set(x, "authors", js.Array(value :_*))
      
      @scala.inline
      def setBlock(value: Maybe[String]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicit(value: String): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: Maybe[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setIsClosedCaptioned(value: Maybe[String]): Self = StObject.set(x, "isClosedCaptioned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClosedCaptionedUndefined: Self = StObject.set(x, "isClosedCaptioned", js.undefined)
      
      @scala.inline
      def setOrder(value: Maybe[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummary(value: Maybe[String]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  @js.native
  trait Block extends StObject {
    
    var authors: js.Array[Name] = js.native
    
    var block: Maybe[String] = js.native
    
    var categories: js.Array[SubCategories] = js.native
    
    var complete: Maybe[String] = js.native
    
    var explicit: String = js.native
    
    var image: String = js.native
    
    var newFeedUrl: Maybe[String] = js.native
    
    var owner: Email = js.native
    
    var subtitle: Maybe[String] = js.native
    
    var summary: String = js.native
  }
  object Block {
    
    @scala.inline
    def apply(
      authors: js.Array[Name],
      categories: js.Array[SubCategories],
      explicit: String,
      image: String,
      owner: Email,
      summary: String
    ): Block = {
      val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthors(value: js.Array[Name]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorsVarargs(value: Name*): Self = StObject.set(x, "authors", js.Array(value :_*))
      
      @scala.inline
      def setBlock(value: Maybe[String]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setCategories(value: js.Array[SubCategories]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesVarargs(value: SubCategories*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setComplete(value: Maybe[String]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setExplicit(value: String): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewFeedUrl(value: Maybe[String]): Self = StObject.set(x, "newFeedUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewFeedUrlUndefined: Self = StObject.set(x, "newFeedUrl", js.undefined)
      
      @scala.inline
      def setOwner(value: Email): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle(value: Maybe[String]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Description extends StObject {
    
    var description: Maybe[String] = js.native
    
    var height: Maybe[String] = js.native
    
    var title: String = js.native
    
    var url: String = js.native
    
    var width: Maybe[String] = js.native
  }
  object Description {
    
    @scala.inline
    def apply(title: String, url: String): Description = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Maybe[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHeight(value: Maybe[String]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Maybe[String]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Email extends StObject {
    
    var email: String = js.native
    
    var name: String = js.native
  }
  object Email {
    
    @scala.inline
    def apply(email: String, name: String): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Length extends StObject {
    
    var length: String = js.native
    
    var mimeType: String = js.native
    
    var url: String = js.native
  }
  object Length {
    
    @scala.inline
    def apply(length: String, mimeType: String, url: String): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rel extends StObject {
    
    var rel: String = js.native
    
    var url: String = js.native
  }
  object Rel {
    
    @scala.inline
    def apply(rel: String, url: String): Rel = {
      val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rel]
    }
    
    @scala.inline
    implicit class RelMutableBuilder[Self <: Rel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubCategories extends StObject {
    
    var name: String = js.native
    
    var subCategories: js.Array[Maybe[Name]] = js.native
  }
  object SubCategories {
    
    @scala.inline
    def apply(name: String, subCategories: js.Array[Maybe[Name]]): SubCategories = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subCategories = subCategories.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubCategories]
    }
    
    @scala.inline
    implicit class SubCategoriesMutableBuilder[Self <: SubCategories] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubCategories(value: js.Array[Maybe[Name]]): Self = StObject.set(x, "subCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubCategoriesVarargs(value: Maybe[Name]*): Self = StObject.set(x, "subCategories", js.Array(value :_*))
    }
  }
}
