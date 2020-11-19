package typingsSlinky.angularCompiler.serializerMod

import typingsSlinky.angularCompiler.anon.I18nNodesByMsgId
import typingsSlinky.angularCompiler.i18nAstMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/i18n/serializers/serializer", "Serializer")
@js.native
abstract class Serializer () extends js.Object {
  
  def createNameMapper(message: Message): PlaceholderMapper | Null = js.native
  
  def digest(message: Message): String = js.native
  
  def load(content: String, url: String): I18nNodesByMsgId = js.native
  
  def write(messages: js.Array[Message]): String = js.native
  def write(messages: js.Array[Message], locale: String): String = js.native
}
