package typingsSlinky.gsap.global.gsap

import typingsSlinky.gsap.gsap.RoughEaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.RoughEase")
@js.native
class RoughEase protected ()
  extends typingsSlinky.gsap.gsap.RoughEase {
  def this(vars: RoughEaseConfig) = this()
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.RoughEase")
@js.native
object RoughEase extends js.Object {
  var ease: typingsSlinky.gsap.gsap.RoughEase = js.native
}

