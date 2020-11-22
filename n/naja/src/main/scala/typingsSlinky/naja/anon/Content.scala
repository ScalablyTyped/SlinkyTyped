package typingsSlinky.naja.anon

import typingsSlinky.naja.snippetHandlerMod.SnippetUpdateOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends js.Object {
  
  var content: String = js.native
  
  var fromCache: Boolean = js.native
  
  def operation(snippet: org.scalajs.dom.raw.Element, content: String): Unit = js.native
  @JSName("operation")
  var operation_Original: SnippetUpdateOperation = js.native
  
  var options: typingsSlinky.naja.najaMod.Options = js.native
  
  var snippet: org.scalajs.dom.raw.Element = js.native
}
