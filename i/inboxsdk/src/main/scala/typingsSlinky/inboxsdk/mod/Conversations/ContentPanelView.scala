package typingsSlinky.inboxsdk.mod.Conversations

import typingsSlinky.inboxsdk.inboxsdkStrings.activate
import typingsSlinky.inboxsdk.inboxsdkStrings.deactivate
import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentPanelView extends StObject {
  
  /**
    * Undocumented method, no guarantee it will always work.
    */
  def close(): Unit = js.native
  
  var destroyed: Boolean = js.native
  
  def isActive(): Boolean = js.native
  
  @JSName("on")
  def on_activate(name: activate, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_deactivate(name: deactivate, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  
  def open(): Unit = js.native
  
  def remove(): Unit = js.native
}
