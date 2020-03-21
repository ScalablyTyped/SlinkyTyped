package typingsSlinky.phaser

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.phaser.spine.Animation
import typingsSlinky.phaser.spine.ArrayLike
import typingsSlinky.phaser.spine.Timeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAnimation
  extends Instantiable3[
      /* name */ String, 
      /* timelines */ js.Array[Timeline], 
      /* duration */ Double, 
      Animation
    ] {
  def binarySearch(values: ArrayLike[Double], target: Double): Double = js.native
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
}

