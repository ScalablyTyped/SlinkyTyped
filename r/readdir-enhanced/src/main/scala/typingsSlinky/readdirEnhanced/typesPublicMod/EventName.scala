package typingsSlinky.readdirEnhanced.typesPublicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.readdirEnhanced.readdirEnhancedStrings.error
  - typingsSlinky.readdirEnhanced.readdirEnhancedStrings.file
  - typingsSlinky.readdirEnhanced.readdirEnhancedStrings.directory
  - typingsSlinky.readdirEnhanced.readdirEnhancedStrings.symlink
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typingsSlinky.readdirEnhanced.readdirEnhancedStrings.directory = this.cast("directory")
  @scala.inline
  def error: typingsSlinky.readdirEnhanced.readdirEnhancedStrings.error = this.cast("error")
  @scala.inline
  def file: typingsSlinky.readdirEnhanced.readdirEnhancedStrings.file = this.cast("file")
  @scala.inline
  def symlink: typingsSlinky.readdirEnhanced.readdirEnhancedStrings.symlink = this.cast("symlink")
}

