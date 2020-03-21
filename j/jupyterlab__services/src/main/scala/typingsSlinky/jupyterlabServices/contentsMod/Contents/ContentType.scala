package typingsSlinky.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contents file type.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.notebook
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.file
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.directory
*/
trait ContentType extends js.Object

object ContentType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.directory = this.cast("directory")
  @scala.inline
  def file: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.file = this.cast("file")
  @scala.inline
  def notebook: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.notebook = this.cast("notebook")
}

