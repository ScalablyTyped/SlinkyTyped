package typingsSlinky.appBuilderLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.appBuilderLib.appBuilderLibStrings.store
  - typingsSlinky.appBuilderLib.appBuilderLibStrings.normal
  - typingsSlinky.appBuilderLib.appBuilderLibStrings.maximum
*/
trait CompressionLevel extends js.Object

object CompressionLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def maximum: typingsSlinky.appBuilderLib.appBuilderLibStrings.maximum = this.cast("maximum")
  @scala.inline
  def normal: typingsSlinky.appBuilderLib.appBuilderLibStrings.normal = this.cast("normal")
  @scala.inline
  def store: typingsSlinky.appBuilderLib.appBuilderLibStrings.store = this.cast("store")
}

