package typingsSlinky.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contents file format.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.json
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.text
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.base64
*/
trait FileFormat extends js.Object

object FileFormat {
  @scala.inline
  def base64: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def json: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.json = this.cast("json")
  @scala.inline
  def text: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.text = this.cast("text")
}

