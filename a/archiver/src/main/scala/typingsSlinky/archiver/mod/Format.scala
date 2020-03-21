package typingsSlinky.archiver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.archiver.archiverStrings.zip
  - typingsSlinky.archiver.archiverStrings.tar
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tar: typingsSlinky.archiver.archiverStrings.tar = this.cast("tar")
  @scala.inline
  def zip: typingsSlinky.archiver.archiverStrings.zip = this.cast("zip")
}

