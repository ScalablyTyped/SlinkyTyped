package typingsSlinky.gsap.global.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Cubic")
@js.native
class Cubic ()
  extends typingsSlinky.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.Cubic")
@js.native
object Cubic extends js.Object {
  var easeIn: typingsSlinky.gsap.gsap.Cubic = js.native
  var easeInOut: typingsSlinky.gsap.gsap.Cubic = js.native
  var easeOut: typingsSlinky.gsap.gsap.Cubic = js.native
}

