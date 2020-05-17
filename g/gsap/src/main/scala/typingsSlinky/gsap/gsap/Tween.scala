package typingsSlinky.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gsap.gsap.TweenLite
  - typingsSlinky.gsap.gsap.TweenMax
*/
trait Tween extends js.Object

object Tween {
  @scala.inline
  implicit def apply(value: TweenLite): Tween = value.asInstanceOf[Tween]
  @scala.inline
  implicit def apply(value: TweenMax): Tween = value.asInstanceOf[Tween]
}

