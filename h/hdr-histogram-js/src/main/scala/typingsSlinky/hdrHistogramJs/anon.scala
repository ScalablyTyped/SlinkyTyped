package typingsSlinky.hdrHistogramJs

import typingsSlinky.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait HistogramConstr extends StObject {
    
    var histogramConstr: HistogramConstructor = js.native
  }
  object HistogramConstr {
    
    @scala.inline
    def apply(histogramConstr: HistogramConstructor): HistogramConstr = {
      val __obj = js.Dynamic.literal(histogramConstr = histogramConstr.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistogramConstr]
    }
    
    @scala.inline
    implicit class HistogramConstrMutableBuilder[Self <: HistogramConstr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHistogramConstr(value: HistogramConstructor): Self = StObject.set(x, "histogramConstr", value.asInstanceOf[js.Any])
    }
  }
}
