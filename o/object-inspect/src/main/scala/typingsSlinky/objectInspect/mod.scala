package typingsSlinky.objectInspect

import typingsSlinky.objectInspect.objectInspectStrings.Charactertabulation
import typingsSlinky.objectInspect.objectInspectStrings.double
import typingsSlinky.objectInspect.objectInspectStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Return a string `s` with the string representation of `obj` up to a depth of `opts.depth`.
    *
    * @param obj Object to inspect
    * @param opts Inspection options. Default: `{}`.
    * @return String representation of `obj`
    */
  @JSImport("object-inspect", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any): String = js.native
  @JSImport("object-inspect", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, opts: Options): String = js.native
  
  /**
    * Inspection options
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * When true, a custom inspect method function will be invoked. Default true.
      */
    var customInspect: js.UndefOr[Boolean] = js.native
    
    /**
      * Maximum depth of the inspection. Default: `5`.
      */
    var depth: js.UndefOr[Double] = js.native
    
    /**
      * Must be "\t", null, or a positive integer. Default null.
      */
    var indent: js.UndefOr[Double | Charactertabulation | Null] = js.native
    
    /**
      * Must be 0, a positive integer, Infinity, or null, if present. Default Infinity.
      */
    var maxStringLength: js.UndefOr[Double | Null] = js.native
    
    /**
      * Must be "single" or "double", if present.
      */
    var quoteStyle: js.UndefOr[single | double] = js.native
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
      def setCustomInspect(value: Boolean): Self = StObject.set(x, "customInspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomInspectUndefined: Self = StObject.set(x, "customInspect", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setIndent(value: Double | Charactertabulation): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentNull: Self = StObject.set(x, "indent", null)
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setMaxStringLength(value: Double): Self = StObject.set(x, "maxStringLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStringLengthNull: Self = StObject.set(x, "maxStringLength", null)
      
      @scala.inline
      def setMaxStringLengthUndefined: Self = StObject.set(x, "maxStringLength", js.undefined)
      
      @scala.inline
      def setQuoteStyle(value: single | double): Self = StObject.set(x, "quoteStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteStyleUndefined: Self = StObject.set(x, "quoteStyle", js.undefined)
    }
  }
}
