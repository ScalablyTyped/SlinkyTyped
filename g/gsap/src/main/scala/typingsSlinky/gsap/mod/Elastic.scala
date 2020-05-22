package typingsSlinky.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "Elastic")
@js.native
class Elastic ()
  extends typingsSlinky.gsap.gsap.Elastic {
  /* CompleteClass */
  override def config(amplitude: Double, period: Double): typingsSlinky.gsap.gsap.Elastic = js.native
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSImport("gsap", "Elastic")
@js.native
object Elastic extends js.Object {
  var easeIn: typingsSlinky.gsap.gsap.Elastic = js.native
  var easeInOut: typingsSlinky.gsap.gsap.Elastic = js.native
  var easeOut: typingsSlinky.gsap.gsap.Elastic = js.native
}

