package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.p5.mod.VIDEO
  - typingsSlinky.p5.mod.AUDIO
*/
trait TYPE extends js.Object

object TYPE {
  @scala.inline
  implicit def apply(value: AUDIO): TYPE = value.asInstanceOf[TYPE]
  @scala.inline
  implicit def apply(value: VIDEO): TYPE = value.asInstanceOf[TYPE]
}

