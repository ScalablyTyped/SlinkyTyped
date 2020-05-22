package typingsSlinky.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "Back")
@js.native
class Back ()
  extends typingsSlinky.gsap.gsap.Back {
  /* CompleteClass */
  override def config(overshoot: Double): typingsSlinky.gsap.gsap.Elastic = js.native
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSImport("gsap", "Back")
@js.native
object Back extends js.Object {
  var easeIn: typingsSlinky.gsap.gsap.Back = js.native
  var easeInOut: typingsSlinky.gsap.gsap.Back = js.native
  var easeOut: typingsSlinky.gsap.gsap.Back = js.native
}

