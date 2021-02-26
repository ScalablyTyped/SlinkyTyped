package typingsSlinky.opentracing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod {
  
  @JSImport("opentracing/lib/reference", JSImport.Default)
  @js.native
  class default protected () extends Reference {
    /**
      * Initialize a new Reference instance.
      *
      * @param {string} type - the Reference type constant (e.g.,
      *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
      * @param {SpanContext} referencedContext - the SpanContext being referred
      *        to. As a convenience, a Span instance may be passed in instead
      *        (in which case its .context() is used here).
      */
    def this(`type`: String, referencedContext: typingsSlinky.opentracing.spanContextMod.default) = this()
    def this(`type`: String, referencedContext: typingsSlinky.opentracing.spanMod.default) = this()
  }
  
  @js.native
  trait Reference extends StObject {
    
    var _referencedContext: typingsSlinky.opentracing.spanContextMod.default = js.native
    
    var _type: String = js.native
    
    /**
      * @return {SpanContext} The SpanContext being referred to (e.g., the
      *         parent in a REFERENCE_CHILD_OF Reference).
      */
    def referencedContext(): typingsSlinky.opentracing.spanContextMod.default = js.native
    
    /**
      * @return {string} The Reference type (e.g., REFERENCE_CHILD_OF or
      *         REFERENCE_FOLLOWS_FROM).
      */
    def `type`(): String = js.native
  }
  object Reference {
    
    @scala.inline
    def apply(
      _referencedContext: typingsSlinky.opentracing.spanContextMod.default,
      _type: String,
      referencedContext: () => typingsSlinky.opentracing.spanContextMod.default,
      `type`: () => String
    ): Reference = {
      val __obj = js.Dynamic.literal(_referencedContext = _referencedContext.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], referencedContext = js.Any.fromFunction0(referencedContext))
      __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
      __obj.asInstanceOf[Reference]
    }
    
    @scala.inline
    implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReferencedContext(value: () => typingsSlinky.opentracing.spanContextMod.default): Self = StObject.set(x, "referencedContext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: () => String): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_referencedContext(value: typingsSlinky.opentracing.spanContextMod.default): Self = StObject.set(x, "_referencedContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    }
  }
}
