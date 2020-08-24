package typingsSlinky.logkitty.apiMod

import typingsSlinky.logkitty.errorsMod.CodeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logkitty/build/api", "formatError")
@js.native
object formatError extends js.Object {
  def apply(error: CodeError): String = js.native
  def apply(error: js.Error): String = js.native
}

