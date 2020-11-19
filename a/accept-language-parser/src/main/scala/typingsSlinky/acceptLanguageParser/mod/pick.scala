package typingsSlinky.acceptLanguageParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("accept-language-parser", "pick")
@js.native
object pick extends js.Object {
  
  def apply[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: String): T | Null = js.native
  def apply[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: String, options: PickOptions): T | Null = js.native
  def apply[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language]): T | Null = js.native
  def apply[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language], options: PickOptions): T | Null = js.native
}
