package typingsSlinky.antvDataSet

import typingsSlinky.antvDataSet.antvDataSetStrings.frequency
import typingsSlinky.antvDataSet.antvDataSetStrings.id
import typingsSlinky.antvDataSet.antvDataSetStrings.weigth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcMod {
  
  @js.native
  trait Options extends StObject {
    
    var id: js.UndefOr[js.Function1[/* node */ js.Any, _]] = js.native
    
    var marginRatio: js.UndefOr[Double] = js.native
    
    var sortBy: js.UndefOr[
        id | weigth | frequency | Null | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])
      ] = js.native
    
    var source: js.UndefOr[js.Function1[/* edge */ js.Any, _]] = js.native
    
    var sourceWeight: js.UndefOr[js.Function1[/* edge */ js.Any, Double]] = js.native
    
    var target: js.UndefOr[js.Function1[/* edge */ js.Any, _]] = js.native
    
    var targetWeight: js.UndefOr[js.Function1[/* edge */ js.Any, Double]] = js.native
    
    var thickness: js.UndefOr[Double] = js.native
    
    var weight: js.UndefOr[Boolean] = js.native
    
    var y: js.UndefOr[Double] = js.native
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
      def setId(value: /* node */ js.Any => _): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      @scala.inline
      def setSortBy(value: id | weigth | frequency | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortByFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "sortBy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortByNull: Self = StObject.set(x, "sortBy", null)
      
      @scala.inline
      def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      @scala.inline
      def setSource(value: /* edge */ js.Any => _): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSourceWeight(value: /* edge */ js.Any => Double): Self = StObject.set(x, "sourceWeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceWeightUndefined: Self = StObject.set(x, "sourceWeight", js.undefined)
      
      @scala.inline
      def setTarget(value: /* edge */ js.Any => _): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetWeight(value: /* edge */ js.Any => Double): Self = StObject.set(x, "targetWeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTargetWeightUndefined: Self = StObject.set(x, "targetWeight", js.undefined)
      
      @scala.inline
      def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      @scala.inline
      def setWeight(value: Boolean): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
