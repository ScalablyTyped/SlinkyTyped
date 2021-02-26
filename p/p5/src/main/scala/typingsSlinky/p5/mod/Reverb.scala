package typingsSlinky.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reverb extends Effect {
  
  /**
    *   Connect a source to the reverb, and assign reverb
    *   parameters.
    *   @param src p5.sound / Web Audio object with a
    *   sound output.
    *   @param [seconds] Duration of the reverb, in
    *   seconds. Min: 0, Max: 10. Defaults to 3.
    *   @param [decayRate] Percentage of decay with each
    *   echo. Min: 0, Max: 100. Defaults to 2.
    *   @param [reverse] Play the reverb backwards or
    *   forwards.
    */
  def process(src: js.Object): Unit = js.native
  def process(
    src: js.Object,
    seconds: js.UndefOr[scala.Nothing],
    decayRate: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Unit = js.native
  def process(src: js.Object, seconds: js.UndefOr[scala.Nothing], decayRate: Double): Unit = js.native
  def process(src: js.Object, seconds: js.UndefOr[scala.Nothing], decayRate: Double, reverse: Boolean): Unit = js.native
  def process(src: js.Object, seconds: Double): Unit = js.native
  def process(src: js.Object, seconds: Double, decayRate: js.UndefOr[scala.Nothing], reverse: Boolean): Unit = js.native
  def process(src: js.Object, seconds: Double, decayRate: Double): Unit = js.native
  def process(src: js.Object, seconds: Double, decayRate: Double, reverse: Boolean): Unit = js.native
  
  /**
    *   Set the reverb settings. Similar to .process(),
    *   but without assigning a new input.
    *   @param [seconds] Duration of the reverb, in
    *   seconds. Min: 0, Max: 10. Defaults to 3.
    *   @param [decayRate] Percentage of decay with each
    *   echo. Min: 0, Max: 100. Defaults to 2.
    *   @param [reverse] Play the reverb backwards or
    *   forwards.
    */
  def set(): Unit = js.native
  def set(seconds: js.UndefOr[scala.Nothing], decayRate: js.UndefOr[scala.Nothing], reverse: Boolean): Unit = js.native
  def set(seconds: js.UndefOr[scala.Nothing], decayRate: Double): Unit = js.native
  def set(seconds: js.UndefOr[scala.Nothing], decayRate: Double, reverse: Boolean): Unit = js.native
  def set(seconds: Double): Unit = js.native
  def set(seconds: Double, decayRate: js.UndefOr[scala.Nothing], reverse: Boolean): Unit = js.native
  def set(seconds: Double, decayRate: Double): Unit = js.native
  def set(seconds: Double, decayRate: Double, reverse: Boolean): Unit = js.native
}
