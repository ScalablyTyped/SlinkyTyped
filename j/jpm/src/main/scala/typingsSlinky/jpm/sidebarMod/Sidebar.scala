package typingsSlinky.jpm.sidebarMod

import typingsSlinky.jpm.FFAddonSDK.BrowserWindow
import typingsSlinky.jpm.anon.Id
import typingsSlinky.jpm.jpmStrings.attach
import typingsSlinky.jpm.jpmStrings.detach
import typingsSlinky.jpm.jpmStrings.hide
import typingsSlinky.jpm.jpmStrings.ready
import typingsSlinky.jpm.jpmStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sidebar extends js.Object {
  
  def dispose(): Unit = js.native
  
  def hide(): Unit = js.native
  def hide(window: BrowserWindow): Unit = js.native
  
  var id: String = js.native
  
  @JSName("on")
  def on_attach(event: attach, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("on")
  def on_detach(event: detach, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("on")
  def on_hide(event: hide, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("on")
  def on_ready(event: ready, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("on")
  def on_show(event: show, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  
  @JSName("once")
  def once_attach(event: attach, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("once")
  def once_detach(event: detach, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("once")
  def once_hide(event: hide, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("once")
  def once_ready(event: ready, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("once")
  def once_show(event: show, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_attach(event: attach, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_detach(event: detach, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_hide(event: hide, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_ready(event: ready, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_show(event: show, handler: js.Function): Unit = js.native
  
  def show(): Unit = js.native
  def show(window: BrowserWindow): Unit = js.native
  
  var title: String = js.native
  
  var url: String = js.native
}
@JSImport("sdk/ui/sidebar", "Sidebar")
@js.native
object Sidebar extends js.Object {
  
  def apply(options: Id): Sidebar = js.native
}
