package typingsSlinky.phaser.global.Phaser.Math

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Math.CeilTo")
@js.native
object CeilTo extends js.Object {
  
  /**
    * Ceils to some place comparative to a `base`, default is 10 for decimal place.
    * 
    * The `place` is represented by the power applied to `base` to get that place.
    * @param value The value to round.
    * @param place The place to round to. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  def apply(value: Double): Double = js.native
  def apply(value: Double, place: js.UndefOr[scala.Nothing], base: integer): Double = js.native
  def apply(value: Double, place: Double): Double = js.native
  def apply(value: Double, place: Double, base: integer): Double = js.native
}
