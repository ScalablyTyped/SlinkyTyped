package typingsSlinky.atJupyterlabServices.libContentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contents file type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.notebook
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.file
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.directory
*/
trait ContentType extends js.Object

object ContentType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.directory = this.cast("directory")
  @scala.inline
  def file: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.file = this.cast("file")
  @scala.inline
  def notebook: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.notebook = this.cast("notebook")
}

