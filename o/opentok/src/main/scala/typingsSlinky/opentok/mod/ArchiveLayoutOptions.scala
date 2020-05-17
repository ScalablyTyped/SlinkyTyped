package typingsSlinky.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.opentok.mod.PredefinedArchiveLayoutOptions
  - typingsSlinky.opentok.mod.CustomArchiveLayoutOptions
*/
trait ArchiveLayoutOptions extends js.Object

object ArchiveLayoutOptions {
  @scala.inline
  implicit def apply(value: CustomArchiveLayoutOptions): ArchiveLayoutOptions = value.asInstanceOf[ArchiveLayoutOptions]
  @scala.inline
  implicit def apply(value: PredefinedArchiveLayoutOptions): ArchiveLayoutOptions = value.asInstanceOf[ArchiveLayoutOptions]
}

