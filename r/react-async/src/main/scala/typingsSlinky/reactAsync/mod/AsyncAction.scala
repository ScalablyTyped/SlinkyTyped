package typingsSlinky.reactAsync.mod

import typingsSlinky.reactAsync.anon.Dictmeta
import typingsSlinky.reactAsync.reactAsyncBooleans.`true`
import typingsSlinky.reactAsync.reactAsyncStrings.cancel
import typingsSlinky.reactAsync.reactAsyncStrings.fulfill
import typingsSlinky.reactAsync.reactAsyncStrings.reject
import typingsSlinky.reactAsync.reactAsyncStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAsync.mod.Start
  - typingsSlinky.reactAsync.mod.Cancel
  - typingsSlinky.reactAsync.mod.Fulfill[T]
  - typingsSlinky.reactAsync.mod.Reject
*/
trait AsyncAction[T] extends js.Object
object AsyncAction {
  
  @scala.inline
  def Start[T](meta: Dictmeta, payload: () => js.Promise[Unit], `type`: String with start): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
  
  @scala.inline
  def Cancel[T](meta: Dictmeta, `type`: String with cancel): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
  
  @scala.inline
  def Fulfill[T](meta: Dictmeta, payload: T, `type`: String with fulfill): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
  
  @scala.inline
  def Reject[T](error: `true`, meta: Dictmeta, payload: js.Error, `type`: String with reject): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
}
