package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for an Earcon.
  */
@js.native
trait EarconOptionsObject extends StObject {
  
  /**
    * The unique ID of the Earcon. Generated if not supplied.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The instruments and their options defining this earcon.
    */
  var instruments: js.Array[EarconInstrument] = js.native
  
  /**
    * Callback function to call when earcon has finished playing.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
  
  /**
    * Global panning of all instruments. Overrides all panning on
    * individual instruments. Can be a number between -1 and 1.
    */
  var pan: js.UndefOr[Double] = js.native
  
  /**
    * Master volume for all instruments. Volume settings on individual
    * instruments can still be used for relative volume between the
    * instruments. This setting does not affect volumes set by functions in
    * individual instruments. Can be a number between 0 and 1. Defaults to
    * 1.
    */
  var volume: js.UndefOr[Double] = js.native
}
object EarconOptionsObject {
  
  @scala.inline
  def apply(instruments: js.Array[EarconInstrument]): EarconOptionsObject = {
    val __obj = js.Dynamic.literal(instruments = instruments.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconOptionsObject]
  }
  
  @scala.inline
  implicit class EarconOptionsObjectMutableBuilder[Self <: EarconOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInstruments(value: js.Array[EarconInstrument]): Self = StObject.set(x, "instruments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentsVarargs(value: EarconInstrument*): Self = StObject.set(x, "instruments", js.Array(value :_*))
    
    @scala.inline
    def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
