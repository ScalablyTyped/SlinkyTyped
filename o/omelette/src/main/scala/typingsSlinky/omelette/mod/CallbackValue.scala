package typingsSlinky.omelette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackValue extends js.Object {
  
  var before: String = js.native
  
  var fragment: Double = js.native
  
  var line: String = js.native
  
  def reply(value: Choices): Unit = js.native
  @JSName("reply")
  var reply_Original: ReplyFn[Choices] = js.native
}
