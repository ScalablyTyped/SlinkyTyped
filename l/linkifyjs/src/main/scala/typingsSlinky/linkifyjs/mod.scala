package typingsSlinky.linkifyjs

import typingsSlinky.linkifyjs.anon.PartialRecordLinkEntityTy
import typingsSlinky.linkifyjs.anon.PartialRecordLinkEntityTyEmail
import typingsSlinky.linkifyjs.anon.PartialRecordLinkEntityTyHashtag
import typingsSlinky.linkifyjs.anon.PartialRecordLinkEntityTyMention
import typingsSlinky.linkifyjs.anon.PartialRecordLinkEntityTyUrl
import typingsSlinky.linkifyjs.anon.VArray
import typingsSlinky.linkifyjs.linkifyjsStrings.ftp
import typingsSlinky.linkifyjs.linkifyjsStrings.ftps
import typingsSlinky.linkifyjs.linkifyjsStrings.http
import typingsSlinky.linkifyjs.linkifyjsStrings.https
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("linkifyjs", "find")
  @js.native
  def find(str: String): js.Array[FindResultHash] = js.native
  @JSImport("linkifyjs", "find")
  @js.native
  def find(str: String, `type`: LinkEntityType): js.Array[FindResultHash] = js.native
  
  @JSImport("linkifyjs", "test")
  @js.native
  def test(str: String): Boolean = js.native
  @JSImport("linkifyjs", "test")
  @js.native
  def test(str: String, `type`: LinkEntityType): Boolean = js.native
  
  @JSImport("linkifyjs", "tokenize")
  @js.native
  def tokenize(str: String): js.Array[VArray] = js.native
  
  @js.native
  trait FindResultHash extends StObject {
    
    /**
      * Should be the value of this links `href` attribute.
      */
    var href: String = js.native
    
    /**
      * The type of entity found.
      */
    var `type`: LinkEntityType = js.native
    
    /**
      * The original entity substring.
      */
    var value: String = js.native
  }
  object FindResultHash {
    
    @scala.inline
    def apply(href: String, `type`: LinkEntityType, value: String): FindResultHash = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindResultHash]
    }
    
    @scala.inline
    implicit class FindResultHashMutableBuilder[Self <: FindResultHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: LinkEntityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.linkifyjs.linkifyjsStrings.url
    - typingsSlinky.linkifyjs.linkifyjsStrings.email
    - typingsSlinky.linkifyjs.linkifyjsStrings.hashtag
    - typingsSlinky.linkifyjs.linkifyjsStrings.mention
  */
  trait LinkEntityType extends StObject
  object LinkEntityType {
    
    @scala.inline
    def email: typingsSlinky.linkifyjs.linkifyjsStrings.email = "email".asInstanceOf[typingsSlinky.linkifyjs.linkifyjsStrings.email]
    
    @scala.inline
    def hashtag: typingsSlinky.linkifyjs.linkifyjsStrings.hashtag = "hashtag".asInstanceOf[typingsSlinky.linkifyjs.linkifyjsStrings.hashtag]
    
    @scala.inline
    def mention: typingsSlinky.linkifyjs.linkifyjsStrings.mention = "mention".asInstanceOf[typingsSlinky.linkifyjs.linkifyjsStrings.mention]
    
    @scala.inline
    def url: typingsSlinky.linkifyjs.linkifyjsStrings.url = "url".asInstanceOf[typingsSlinky.linkifyjs.linkifyjsStrings.url]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Object of attributes to add to each new link. Note: the class and target
      * attributes have dedicated options.
      *
      * Also accepts a function that takes the unformatted href, the link type
      * (e.g., 'url', 'email', etc.) and returns the object.
      *
      * @default null
      */
    var attributes: js.UndefOr[
        (Record[String, String]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, Record[String, String]]) | Null
      ] = js.native
    
    /**
      * class attribute to use for newly created links.
      *
      * Accepts a function that takes the unformatted href value and link type
      * (e.g., 'url', 'email', etc.) and returns the string.
      *
      * Accepts an object where each key is the link type and each value is the
      * string or function to use for that type.
      */
    var className: js.UndefOr[
        String | PartialRecordLinkEntityTy | (js.Function2[/* href */ String, /* type */ LinkEntityType, String])
      ] = js.native
    
    /**
      * Protocol that should be used in href attributes for URLs without a
      * protocol (e.g., github.com).
      *
      * @default 'http'
      */
    var defaultProtocol: js.UndefOr[http | https | ftp | ftps | String] = js.native
    
    /**
      * Format the text displayed by a linkified entity. e.g., truncate a long URL.
      *
      * Accepts an object where each key is the link type (e.g., 'url', 'email', etc.),
      * and each value is the formatting function to use for that type.
      *
      * @default null
      */
    var format: js.UndefOr[
        (js.Function2[/* value */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail | Null
      ] = js.native
    
    /**
      * Similar to format, except the result of this function will be used as the
      * href attribute of the new link.
      *
      * This is useful when finding hashtags, where you don’t necessarily
      * want the default to be a link to a named anchor.
      *
      * Accepts an object where each key is the link type (e.g., 'url', 'email', etc.),
      * and each value is the formatting function to use for that type.
      *
      * @default null
      */
    var formatHref: js.UndefOr[
        (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail | Null
      ] = js.native
    
    /**
      * If `true`, \n line breaks will automatically be converted to `<br>` tags.
      *
      * @default false
      */
    var nl2br: js.UndefOr[Boolean] = js.native
    
    /**
      * The tag name to use for each link.
      * For cases where you can’t use anchor tags.
      *
      * Accepts a function that takes the unformatted href,
      * the link type (e.g., 'url', 'email', etc.) and returns the tag name.
      *
      * Accepts an object where each key is the link type,
      * and each value is the tag name to use for that type.
      *
      * @default a
      */
    var tagName: js.UndefOr[
        String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyHashtag
      ] = js.native
    
    /**
      * target attribute for generated link.
      *
      * Accepts a function that takes the unformatted href,
      * the link type (e.g., 'url', 'email', etc.) and returns the target
      *
      * Accepts an object where each key is the link type,
      * and each value is the target to use for that type.
      *
      * @default { url: '_blank' }
      */
    var target: js.UndefOr[
        String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyMention
      ] = js.native
    
    /**
      * validate
      * - Type: Boolean | Function (String value, String type) | Object
      * - Default: null
      *
      * If option resolves to false, the given value will not show up as a link.
      *
      * Accepts a function that takes a discovered link,
      * and the link type (e.g., 'url', 'email', etc.),
      * and returns true if the link should be converted into an anchor tag,
      * and false otherwise.
      *
      * Accepts an object where each key is the link type and each value is the
      * the validation option to use for that type
      *
      * @default null
      */
    var validate: js.UndefOr[
        Boolean | (js.Function2[/* href */ String, /* type */ LinkEntityType, Boolean]) | PartialRecordLinkEntityTyUrl | Null
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(
        value: (Record[String, String]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, Record[String, String]])
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesFunction2(value: (/* href */ String, /* type */ LinkEntityType) => Record[String, String]): Self = StObject.set(x, "attributes", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAttributesNull: Self = StObject.set(x, "attributes", null)
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setClassName(
        value: String | PartialRecordLinkEntityTy | (js.Function2[/* href */ String, /* type */ LinkEntityType, String])
      ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = StObject.set(x, "className", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultProtocol(value: http | https | ftp | ftps | String): Self = StObject.set(x, "defaultProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultProtocolUndefined: Self = StObject.set(x, "defaultProtocol", js.undefined)
      
      @scala.inline
      def setFormat(
        value: (js.Function2[/* value */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction2(value: (/* value */ String, /* type */ LinkEntityType) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatHref(
        value: (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail
      ): Self = StObject.set(x, "formatHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatHrefFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = StObject.set(x, "formatHref", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatHrefNull: Self = StObject.set(x, "formatHref", null)
      
      @scala.inline
      def setFormatHrefUndefined: Self = StObject.set(x, "formatHref", js.undefined)
      
      @scala.inline
      def setFormatNull: Self = StObject.set(x, "format", null)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setNl2br(value: Boolean): Self = StObject.set(x, "nl2br", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNl2brUndefined: Self = StObject.set(x, "nl2br", js.undefined)
      
      @scala.inline
      def setTagName(
        value: String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyHashtag
      ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = StObject.set(x, "tagName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setTarget(
        value: String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyMention
      ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = StObject.set(x, "target", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setValidate(
        value: Boolean | (js.Function2[/* href */ String, /* type */ LinkEntityType, Boolean]) | PartialRecordLinkEntityTyUrl
      ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFunction2(value: (/* href */ String, /* type */ LinkEntityType) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidateNull: Self = StObject.set(x, "validate", null)
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
