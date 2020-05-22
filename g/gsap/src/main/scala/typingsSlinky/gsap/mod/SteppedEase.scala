package typingsSlinky.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "SteppedEase")
@js.native
class SteppedEase protected ()
  extends typingsSlinky.gsap.gsap.SteppedEase {
  def this(staps: Double) = this()
  /* CompleteClass */
  override def config(steps: Double): typingsSlinky.gsap.gsap.SteppedEase = js.native
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

