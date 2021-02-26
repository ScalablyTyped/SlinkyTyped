package typingsSlinky.algoliasearchHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchForFacetValues {
  
  @js.native
  trait Hit extends StObject {
    
    var count: Double = js.native
    
    var highlighted: String = js.native
    
    var isRefined: Boolean = js.native
    
    var value: String = js.native
  }
  object Hit {
    
    @scala.inline
    def apply(count: Double, highlighted: String, isRefined: Boolean, value: String): Hit = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hit]
    }
    
    @scala.inline
    implicit class HitMutableBuilder[Self <: Hit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlighted(value: String): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRefined(value: Boolean): Self = StObject.set(x, "isRefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var facetHits: js.Array[Hit] = js.native
    
    var processingTimeMS: Double = js.native
  }
  object Result {
    
    @scala.inline
    def apply(facetHits: js.Array[Hit], processingTimeMS: Double): Result = {
      val __obj = js.Dynamic.literal(facetHits = facetHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFacetHits(value: js.Array[Hit]): Self = StObject.set(x, "facetHits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacetHitsVarargs(value: Hit*): Self = StObject.set(x, "facetHits", js.Array(value :_*))
      
      @scala.inline
      def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
    }
  }
}
