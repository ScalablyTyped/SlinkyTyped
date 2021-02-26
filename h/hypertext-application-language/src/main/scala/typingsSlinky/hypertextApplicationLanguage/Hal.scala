package typingsSlinky.hypertextApplicationLanguage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hal {
  
  /**
    * Describe a HAL Link object
    *
    * https://tools.ietf.org/html/draft-kelly-json-hal-06#section-5
    */
  @js.native
  trait Link extends StObject {
    
    var deprecation: js.UndefOr[String] = js.native
    
    var href: String = js.native
    
    var hreflang: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var profile: js.UndefOr[String] = js.native
    
    var templated: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Link {
    
    @scala.inline
    def apply(href: String): Link = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecation(value: String): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setTemplated(value: Boolean): Self = StObject.set(x, "templated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatedUndefined: Self = StObject.set(x, "templated", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
