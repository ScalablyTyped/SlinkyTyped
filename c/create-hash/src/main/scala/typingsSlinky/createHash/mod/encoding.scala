package typingsSlinky.createHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.createHash.createHashStrings.utf8
  - typingsSlinky.createHash.createHashStrings.hex
  - typingsSlinky.createHash.createHashStrings.base64
*/
trait encoding extends js.Object

object encoding {
  @scala.inline
  def base64: typingsSlinky.createHash.createHashStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsSlinky.createHash.createHashStrings.hex = this.cast("hex")
  @scala.inline
  def utf8: typingsSlinky.createHash.createHashStrings.utf8 = this.cast("utf8")
}

