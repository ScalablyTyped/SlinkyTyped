package typingsSlinky.jpm

import typingsSlinky.jpm.FFAddonSDK.BrowserWindow
import typingsSlinky.jpm.FFAddonSDK.Port
import typingsSlinky.jpm.anon.Id
import typingsSlinky.jpm.jpmStrings.attach
import typingsSlinky.jpm.jpmStrings.detach
import typingsSlinky.jpm.jpmStrings.hide
import typingsSlinky.jpm.jpmStrings.ready
import typingsSlinky.jpm.jpmStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables you to create sidebars. A sidebar is a vertical strip of user interface real estate for your add-on that's
  * attached to the left-hand side of the browser window. You specify its content using HTML, CSS, and JavaScript,
  * and the user can show or hide it in the same way they can show or hide the built-in sidebars
  */
object sidebarMod {
  
  @js.native
  trait Sidebar extends StObject {
    
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
  def Sidebar(options: Id): Sidebar = js.native
  
  @js.native
  trait SidebarWorker extends StObject {
    
    var port: Port = js.native
  }
  object SidebarWorker {
    
    @scala.inline
    def apply(port: Port): SidebarWorker = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarWorker]
    }
    
    @scala.inline
    implicit class SidebarWorkerMutableBuilder[Self <: SidebarWorker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
