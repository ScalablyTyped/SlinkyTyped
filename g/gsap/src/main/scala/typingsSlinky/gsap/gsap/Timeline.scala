package typingsSlinky.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gsap.gsap.SimpleTimeline
  - typingsSlinky.gsap.gsap.TimelineLite
  - typingsSlinky.gsap.gsap.TimelineMax
*/
trait Timeline extends js.Object

object Timeline {
  @scala.inline
  implicit def apply(value: SimpleTimeline): Timeline = value.asInstanceOf[Timeline]
  @scala.inline
  implicit def apply(value: TimelineLite): Timeline = value.asInstanceOf[Timeline]
  @scala.inline
  implicit def apply(value: TimelineMax): Timeline = value.asInstanceOf[Timeline]
}

