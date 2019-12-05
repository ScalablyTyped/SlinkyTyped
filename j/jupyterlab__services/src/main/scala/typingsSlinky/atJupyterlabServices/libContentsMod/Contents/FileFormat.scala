package typingsSlinky.atJupyterlabServices.libContentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contents file format.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.json
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.text
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.base64
*/
trait FileFormat extends js.Object

object FileFormat {
  @scala.inline
  def base64: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def json: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.json = this.cast("json")
  @scala.inline
  def text: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.text = this.cast("text")
}

