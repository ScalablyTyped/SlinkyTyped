package typingsSlinky.commandLineUsage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Section object. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.commandLineUsage.mod.Content
  - typingsSlinky.commandLineUsage.mod.OptionList
*/
trait Section extends js.Object

object Section {
  @scala.inline
  implicit def apply(value: Content): Section = value.asInstanceOf[Section]
  @scala.inline
  implicit def apply(value: OptionList): Section = value.asInstanceOf[Section]
}

