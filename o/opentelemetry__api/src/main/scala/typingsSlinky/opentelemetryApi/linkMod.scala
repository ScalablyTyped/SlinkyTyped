package typingsSlinky.opentelemetryApi

import typingsSlinky.opentelemetryApi.attributesMod.Attributes
import typingsSlinky.opentelemetryApi.linkContextMod.LinkContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @js.native
  trait Link extends StObject {
    
    /** A set of {@link Attributes} on the link. */
    var attributes: js.UndefOr[Attributes] = js.native
    
    /** The {@link LinkContext} of a linked span. */
    var context: LinkContext = js.native
  }
  object Link {
    
    @scala.inline
    def apply(context: LinkContext): Link = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setContext(value: LinkContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
