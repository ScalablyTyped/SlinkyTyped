package typingsSlinky.linguiMacro.mod

import typingsSlinky.linguiCore.i18nMod.MessageDescriptor
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lingui/macro", "t")
@js.native
object t extends js.Object {
  
  def apply(id: String): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, MessageDescriptor] = js.native
  def apply(strings: TemplateStringsArray, values: js.Any*): MessageDescriptor = js.native
}
