package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.libsodiumWrappers.libsodiumWrappersStrings.text
  - typingsSlinky.libsodiumWrappers.libsodiumWrappersStrings.hex
  - typingsSlinky.libsodiumWrappers.libsodiumWrappersStrings.base64
*/
trait StringOutputFormat extends js.Object

object StringOutputFormat {
  @scala.inline
  def base64: typingsSlinky.libsodiumWrappers.libsodiumWrappersStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsSlinky.libsodiumWrappers.libsodiumWrappersStrings.hex = this.cast("hex")
  @scala.inline
  def text: typingsSlinky.libsodiumWrappers.libsodiumWrappersStrings.text = this.cast("text")
}

