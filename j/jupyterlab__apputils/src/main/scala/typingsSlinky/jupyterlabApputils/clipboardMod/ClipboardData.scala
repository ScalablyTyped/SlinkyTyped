package typingsSlinky.jupyterlabApputils.clipboardMod

import typingsSlinky.phosphorCoreutils.mod.MimeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.phosphorCoreutils.mod.MimeData
*/
trait ClipboardData extends js.Object

object ClipboardData {
  @scala.inline
  implicit def apply(value: MimeData): ClipboardData = value.asInstanceOf[ClipboardData]
  @scala.inline
  implicit def apply(value: String): ClipboardData = value.asInstanceOf[ClipboardData]
}

