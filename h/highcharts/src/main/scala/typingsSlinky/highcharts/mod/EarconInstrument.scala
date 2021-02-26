package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define an Instrument and the options for playing it.
  */
@js.native
trait EarconInstrument extends StObject {
  
  /**
    * An instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.Instrument = js.native
  
  /**
    * The options to pass to Instrument.play.
    */
  var playOptions: typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject = js.native
}
object EarconInstrument {
  
  @scala.inline
  def apply(
    instrument: String | typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.Instrument,
    playOptions: typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject
  ): EarconInstrument = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], playOptions = playOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconInstrument]
  }
  
  @scala.inline
  implicit class EarconInstrumentMutableBuilder[Self <: EarconInstrument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstrument(value: String | typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.Instrument): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayOptions(
      value: typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject
    ): Self = StObject.set(x, "playOptions", value.asInstanceOf[js.Any])
  }
}
