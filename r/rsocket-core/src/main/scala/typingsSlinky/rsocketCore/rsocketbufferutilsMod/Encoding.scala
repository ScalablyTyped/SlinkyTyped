package typingsSlinky.rsocketCore.rsocketbufferutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rsocketCore.rsocketCoreStrings.ascii
  - typingsSlinky.rsocketCore.rsocketCoreStrings.base64
  - typingsSlinky.rsocketCore.rsocketCoreStrings.hex
  - typingsSlinky.rsocketCore.rsocketCoreStrings.utf8
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typingsSlinky.rsocketCore.rsocketCoreStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typingsSlinky.rsocketCore.rsocketCoreStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsSlinky.rsocketCore.rsocketCoreStrings.hex = this.cast("hex")
  @scala.inline
  def utf8: typingsSlinky.rsocketCore.rsocketCoreStrings.utf8 = this.cast("utf8")
}

