package typingsSlinky.rrule

import typingsSlinky.rrule.rruleNumbers.`365`
import typingsSlinky.rrule.rruleNumbers.`366`
import typingsSlinky.rrule.typesMod.ParsedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yearinfoMod {
  
  @JSImport("rrule/dist/esm/src/iterinfo/yearinfo", "rebuildYear")
  @js.native
  def rebuildYear(year: Double, options: ParsedOptions): YearInfo = js.native
  
  @js.native
  trait YearInfo extends StObject {
    
    var mdaymask: js.Array[Double] = js.native
    
    var mmask: js.Array[Double] = js.native
    
    var mrange: js.Array[Double] = js.native
    
    var nextyearlen: `365` | `366` = js.native
    
    var nmdaymask: js.Array[Double] = js.native
    
    var wdaymask: js.Array[Double] = js.native
    
    var wnomask: js.Array[Double] | Null = js.native
    
    var yearlen: `365` | `366` = js.native
    
    var yearordinal: Double = js.native
    
    var yearweekday: Double = js.native
  }
  object YearInfo {
    
    @scala.inline
    def apply(
      mdaymask: js.Array[Double],
      mmask: js.Array[Double],
      mrange: js.Array[Double],
      nextyearlen: `365` | `366`,
      nmdaymask: js.Array[Double],
      wdaymask: js.Array[Double],
      yearlen: `365` | `366`,
      yearordinal: Double,
      yearweekday: Double
    ): YearInfo = {
      val __obj = js.Dynamic.literal(mdaymask = mdaymask.asInstanceOf[js.Any], mmask = mmask.asInstanceOf[js.Any], mrange = mrange.asInstanceOf[js.Any], nextyearlen = nextyearlen.asInstanceOf[js.Any], nmdaymask = nmdaymask.asInstanceOf[js.Any], wdaymask = wdaymask.asInstanceOf[js.Any], yearlen = yearlen.asInstanceOf[js.Any], yearordinal = yearordinal.asInstanceOf[js.Any], yearweekday = yearweekday.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearInfo]
    }
    
    @scala.inline
    implicit class YearInfoMutableBuilder[Self <: YearInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMdaymask(value: js.Array[Double]): Self = StObject.set(x, "mdaymask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdaymaskVarargs(value: Double*): Self = StObject.set(x, "mdaymask", js.Array(value :_*))
      
      @scala.inline
      def setMmask(value: js.Array[Double]): Self = StObject.set(x, "mmask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMmaskVarargs(value: Double*): Self = StObject.set(x, "mmask", js.Array(value :_*))
      
      @scala.inline
      def setMrange(value: js.Array[Double]): Self = StObject.set(x, "mrange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMrangeVarargs(value: Double*): Self = StObject.set(x, "mrange", js.Array(value :_*))
      
      @scala.inline
      def setNextyearlen(value: `365` | `366`): Self = StObject.set(x, "nextyearlen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNmdaymask(value: js.Array[Double]): Self = StObject.set(x, "nmdaymask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNmdaymaskVarargs(value: Double*): Self = StObject.set(x, "nmdaymask", js.Array(value :_*))
      
      @scala.inline
      def setWdaymask(value: js.Array[Double]): Self = StObject.set(x, "wdaymask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWdaymaskVarargs(value: Double*): Self = StObject.set(x, "wdaymask", js.Array(value :_*))
      
      @scala.inline
      def setWnomask(value: js.Array[Double]): Self = StObject.set(x, "wnomask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWnomaskNull: Self = StObject.set(x, "wnomask", null)
      
      @scala.inline
      def setWnomaskVarargs(value: Double*): Self = StObject.set(x, "wnomask", js.Array(value :_*))
      
      @scala.inline
      def setYearlen(value: `365` | `366`): Self = StObject.set(x, "yearlen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearordinal(value: Double): Self = StObject.set(x, "yearordinal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearweekday(value: Double): Self = StObject.set(x, "yearweekday", value.asInstanceOf[js.Any])
    }
  }
}
