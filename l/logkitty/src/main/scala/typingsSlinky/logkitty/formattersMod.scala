package typingsSlinky.logkitty

import typingsSlinky.logkitty.errorsMod.CodeError
import typingsSlinky.logkitty.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logkitty/build/formatters", JSImport.Namespace)
@js.native
object formattersMod extends js.Object {
  def formatEntry(entry: Entry): String = js.native
  def formatError(error: CodeError): String = js.native
  def formatError(error: js.Error): String = js.native
}

