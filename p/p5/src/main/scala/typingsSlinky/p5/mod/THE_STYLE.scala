package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.p5.mod.NORMAL
  - typingsSlinky.p5.mod.ITALIC
  - typingsSlinky.p5.mod.BOLD
  - typingsSlinky.p5.mod.BOLDITALIC
*/
trait THE_STYLE extends js.Object

object THE_STYLE {
  @scala.inline
  implicit def apply(value: BOLD): THE_STYLE = value.asInstanceOf[THE_STYLE]
  @scala.inline
  implicit def apply(value: BOLDITALIC): THE_STYLE = value.asInstanceOf[THE_STYLE]
  @scala.inline
  implicit def apply(value: ITALIC): THE_STYLE = value.asInstanceOf[THE_STYLE]
  @scala.inline
  implicit def apply(value: NORMAL): THE_STYLE = value.asInstanceOf[THE_STYLE]
}

