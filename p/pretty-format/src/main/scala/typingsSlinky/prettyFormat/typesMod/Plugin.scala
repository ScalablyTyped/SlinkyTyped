package typingsSlinky.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.prettyFormat.typesMod.NewPlugin
  - typingsSlinky.prettyFormat.typesMod.OldPlugin
*/
trait Plugin extends js.Object

object Plugin {
  @scala.inline
  implicit def apply(value: NewPlugin): Plugin = value.asInstanceOf[Plugin]
  @scala.inline
  implicit def apply(value: OldPlugin): Plugin = value.asInstanceOf[Plugin]
}

