package typingsSlinky.azureSb

import typingsSlinky.azureSb.mod.Azure.ServiceBus.DateString
import typingsSlinky.azureSb.mod.Azure.ServiceBus.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Author extends StObject {
    
    var ContentRootElement: String = js.native
    
    var author: js.UndefOr[Name] = js.native
    
    var id: String = js.native
    
    var link: String = js.native
    
    var published: DateString = js.native
    
    var title: String = js.native
    
    var updated: DateString = js.native
  }
  object Author {
    
    @scala.inline
    def apply(
      ContentRootElement: String,
      id: String,
      link: String,
      published: DateString,
      title: String,
      updated: DateString
    ): Author = {
      val __obj = js.Dynamic.literal(ContentRootElement = ContentRootElement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Author]
    }
    
    @scala.inline
    implicit class AuthorMutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: Name): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setContentRootElement(value: String): Self = StObject.set(x, "ContentRootElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublished(value: DateString): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: DateString): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Body extends StObject {
    
    var body: String = js.native
    
    var expiry: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
  }
  object Body {
    
    @scala.inline
    def apply(body: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Code extends StObject {
    
    var Code: String = js.native
    
    var Detail: String = js.native
  }
  object Code {
    
    @scala.inline
    def apply(Code: String, Detail: String): Code = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContentRootElement extends StObject {
    
    var ContentRootElement: String = js.native
  }
  object ContentRootElement {
    
    @scala.inline
    def apply(ContentRootElement: String): ContentRootElement = {
      val __obj = js.Dynamic.literal(ContentRootElement = ContentRootElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentRootElement]
    }
    
    @scala.inline
    implicit class ContentRootElementMutableBuilder[Self <: ContentRootElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRootElement(value: String): Self = StObject.set(x, "ContentRootElement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var Error: Code = js.native
  }
  object Error {
    
    @scala.inline
    def apply(Error: Code): Error = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Code): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Etag extends StObject {
    
    var etag: js.Any = js.native
  }
  object Etag {
    
    @scala.inline
    def apply(etag: js.Any): Etag = {
      val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Etag]
    }
    
    @scala.inline
    implicit class EtagMutableBuilder[Self <: Etag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEtag(value: js.Any): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Headers extends StObject {
    
    var headers: Dictionary[String] = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(headers: Dictionary[String]): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Dictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HeadersObject extends StObject {
    
    var headers: js.Object = js.native
  }
  object HeadersObject {
    
    @scala.inline
    def apply(headers: js.Object): HeadersObject = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadersObject]
    }
    
    @scala.inline
    implicit class HeadersObjectMutableBuilder[Self <: HeadersObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
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
  trait PushChannel extends StObject {
    
    var pushChannel: String = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
    
    var templates: js.UndefOr[js.Any] = js.native
  }
  object PushChannel {
    
    @scala.inline
    def apply(pushChannel: String): PushChannel = {
      val __obj = js.Dynamic.literal(pushChannel = pushChannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushChannel]
    }
    
    @scala.inline
    implicit class PushChannelMutableBuilder[Self <: PushChannel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPushChannel(value: String): Self = StObject.set(x, "pushChannel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTemplates(value: js.Any): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    }
  }
  
  @js.native
  trait SignRequest extends StObject {
    
    def signRequest(webResource: js.Any, callback: js.Function0[Unit]): Unit = js.native
  }
  object SignRequest {
    
    @scala.inline
    def apply(signRequest: (js.Any, js.Function0[Unit]) => Unit): SignRequest = {
      val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2(signRequest))
      __obj.asInstanceOf[SignRequest]
    }
    
    @scala.inline
    implicit class SignRequestMutableBuilder[Self <: SignRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignRequest(value: (js.Any, js.Function0[Unit]) => Unit): Self = StObject.set(x, "signRequest", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: Id = js.native
  }
  object _empty {
    
    @scala.inline
    def apply(_underscore: Id): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit class _emptyMutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_underscore(value: Id): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    }
  }
}
