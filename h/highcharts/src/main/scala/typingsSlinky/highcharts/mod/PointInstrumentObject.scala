package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instrument definition for a point, specifying the instrument to play
  * and how to play it.
  */
@js.native
trait PointInstrumentObject extends StObject {
  
  /**
    * An Instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.Instrument = js.native
  
  /**
    * Mapping of instrument parameters for this instrument.
    */
  var instrumentMapping: typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentMappingObject = js.native
  
  /**
    * Options for this instrument.
    */
  var instrumentOptions: js.UndefOr[
    typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentOptionsObject
  ] = js.native
  
  /**
    * Callback to call when the instrument has stopped playing.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
}
object PointInstrumentObject {
  
  @scala.inline
  def apply(
    instrument: String | typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.Instrument,
    instrumentMapping: typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentMappingObject
  ): PointInstrumentObject = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], instrumentMapping = instrumentMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInstrumentObject]
  }
  
  @scala.inline
  implicit class PointInstrumentObjectMutableBuilder[Self <: PointInstrumentObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstrument(value: String | typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.Instrument): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentMapping(
      value: typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentMappingObject
    ): Self = StObject.set(x, "instrumentMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentOptions(
      value: typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentOptionsObject
    ): Self = StObject.set(x, "instrumentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentOptionsUndefined: Self = StObject.set(x, "instrumentOptions", js.undefined)
    
    @scala.inline
    def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
  }
}
