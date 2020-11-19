package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Instrument class. Instrument objects represent an instrument capable
  * of playing a certain pitch for a specified duration.
  */
@js.native
trait Instrument extends js.Object {
  
  /**
    * Return a copy of an instrument. Only one instrument instance can play
    * at a time, so use this to get a new copy of the instrument that can
    * play alongside it. The new instrument copy will receive a new ID
    * unless one is supplied in options.
    *
    * @param options
    *        Options to merge in for the copy.
    *
    * @return A new Instrument instance with the same options.
    */
  def copy(): typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.Instrument = js.native
  def copy(options: typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.InstrumentOptionsObject): typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.Instrument = js.native
  
  /**
    * Mute an instrument that is playing. If the instrument is not
    * currently playing, this function does nothing.
    */
  def mute(): Unit = js.native
  
  /**
    * Play the instrument according to options.
    *
    * @param options
    *        Options for the playback of the instrument.
    */
  def play(
    options: typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject
  ): Unit = js.native
  
  /**
    * Stop the instrument playing.
    *
    * @param immediately
    *        Whether to do the stop immediately or fade out.
    *
    * @param onStopped
    *        Callback function to be called when the stop is completed.
    *
    * @param callbackData
    *        Data to send to the onEnd callback functions.
    */
  def stop(immediately: Boolean): Unit = js.native
  def stop(immediately: Boolean, onStopped: js.UndefOr[scala.Nothing], callbackData: js.Any): Unit = js.native
  def stop(immediately: Boolean, onStopped: js.Function): Unit = js.native
  def stop(immediately: Boolean, onStopped: js.Function, callbackData: js.Any): Unit = js.native
}
