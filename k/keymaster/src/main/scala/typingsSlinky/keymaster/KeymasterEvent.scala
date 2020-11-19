package typingsSlinky.keymaster

import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeymasterEvent extends js.Object {
  
  var key: String = js.native
  
  def method(keyboardEvent: KeyboardEvent, keymasterEvent: KeymasterEvent): Unit = js.native
  @JSName("method")
  var method_Original: KeyHandler = js.native
  
  var mods: js.Array[Double] = js.native
  
  var scope: String = js.native
  
  var shortcut: String = js.native
}
