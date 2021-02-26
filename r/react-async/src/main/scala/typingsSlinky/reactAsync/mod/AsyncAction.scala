package typingsSlinky.reactAsync.mod

import typingsSlinky.reactAsync.anon.Dictmeta
import typingsSlinky.reactAsync.reactAsyncBooleans.`true`
import typingsSlinky.reactAsync.reactAsyncStrings.cancel
import typingsSlinky.reactAsync.reactAsyncStrings.fulfill
import typingsSlinky.reactAsync.reactAsyncStrings.reject
import typingsSlinky.reactAsync.reactAsyncStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAsync.mod.Start
  - typingsSlinky.reactAsync.mod.Cancel
  - typingsSlinky.reactAsync.mod.Fulfill[T]
  - typingsSlinky.reactAsync.mod.Reject
*/
trait AsyncAction[T] extends StObject
object AsyncAction {
  
  @scala.inline
  def Cancel(meta: Dictmeta, `type`: String with cancel): typingsSlinky.reactAsync.mod.Cancel = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactAsync.mod.Cancel]
  }
  
  @scala.inline
  def Fulfill[T](meta: Dictmeta, payload: T, `type`: String with fulfill): typingsSlinky.reactAsync.mod.Fulfill[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactAsync.mod.Fulfill[T]]
  }
  
  @scala.inline
  def Reject(error: `true`, meta: Dictmeta, payload: js.Error, `type`: String with reject): typingsSlinky.reactAsync.mod.Reject = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactAsync.mod.Reject]
  }
  
  @scala.inline
  def Start(meta: Dictmeta, payload: () => js.Promise[Unit], `type`: String with start): typingsSlinky.reactAsync.mod.Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactAsync.mod.Start]
  }
}
