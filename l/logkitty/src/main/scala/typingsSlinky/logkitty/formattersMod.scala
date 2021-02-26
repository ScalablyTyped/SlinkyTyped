package typingsSlinky.logkitty

import typingsSlinky.logkitty.errorsMod.CodeError
import typingsSlinky.logkitty.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattersMod {
  
  @JSImport("logkitty/build/formatters", "formatEntry")
  @js.native
  def formatEntry(entry: Entry): String = js.native
  
  @JSImport("logkitty/build/formatters", "formatError")
  @js.native
  def formatError(error: js.Error): String = js.native
  @JSImport("logkitty/build/formatters", "formatError")
  @js.native
  def formatError(error: CodeError): String = js.native
}
