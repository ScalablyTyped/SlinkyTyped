package typingsSlinky.psi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Category extends StObject {
    
    var category: String = js.native
    
    var distributions: js.Array[Max] = js.native
    
    var percentile: Double = js.native
  }
  object Category {
    
    @scala.inline
    def apply(category: String, distributions: js.Array[Max], percentile: Double): Category = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any], percentile = percentile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributions(value: js.Array[Max]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributionsVarargs(value: Max*): Self = StObject.set(x, "distributions", js.Array(value :_*))
      
      @scala.inline
      def setPercentile(value: Double): Self = StObject.set(x, "percentile", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Max extends StObject {
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var proportion: Double = js.native
  }
  object Max {
    
    @scala.inline
    def apply(max: Double, min: Double, proportion: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], proportion = proportion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProportion(value: Double): Self = StObject.set(x, "proportion", value.asInstanceOf[js.Any])
    }
  }
}
