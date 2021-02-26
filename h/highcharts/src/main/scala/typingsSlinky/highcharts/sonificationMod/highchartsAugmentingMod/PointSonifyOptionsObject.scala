package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for sonifying a point.
  */
@js.native
trait PointSonifyOptionsObject extends StObject {
  
  /**
    * Optionally provide the minimum/maximum values for the points. If this
    * is not supplied, it is calculated from the points in the chart on
    * demand. This option is supplied in the following format, as a map of
    * point data properties to objects with min/max values: (see online
    * documentation for example)
    */
  var dataExtremes: js.UndefOr[js.Object] = js.native
  
  /**
    * The instrument definitions for this point.
    */
  var instruments: js.Array[PointInstrumentObject] = js.native
  
  /**
    * Callback called when the sonification has finished.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
}
object PointSonifyOptionsObject {
  
  @scala.inline
  def apply(instruments: js.Array[PointInstrumentObject]): PointSonifyOptionsObject = {
    val __obj = js.Dynamic.literal(instruments = instruments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointSonifyOptionsObject]
  }
  
  @scala.inline
  implicit class PointSonifyOptionsObjectMutableBuilder[Self <: PointSonifyOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataExtremes(value: js.Object): Self = StObject.set(x, "dataExtremes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExtremesUndefined: Self = StObject.set(x, "dataExtremes", js.undefined)
    
    @scala.inline
    def setInstruments(value: js.Array[PointInstrumentObject]): Self = StObject.set(x, "instruments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentsVarargs(value: PointInstrumentObject*): Self = StObject.set(x, "instruments", js.Array(value :_*))
    
    @scala.inline
    def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
  }
}
