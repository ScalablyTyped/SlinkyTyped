package typingsSlinky.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "Quint")
@js.native
class Quint ()
  extends typingsSlinky.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSImport("gsap", "Quint")
@js.native
object Quint extends js.Object {
  var easeIn: typingsSlinky.gsap.gsap.Quint = js.native
  var easeInOut: typingsSlinky.gsap.gsap.Quint = js.native
  var easeOut: typingsSlinky.gsap.gsap.Quint = js.native
}

