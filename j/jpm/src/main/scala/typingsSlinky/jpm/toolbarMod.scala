package typingsSlinky.jpm

import typingsSlinky.jpm.anon.Hidden
import typingsSlinky.jpm.jpmStrings.attach
import typingsSlinky.jpm.jpmStrings.detach
import typingsSlinky.jpm.jpmStrings.hide
import typingsSlinky.jpm.jpmStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add a toolbar to the Firefox user interface. A toolbar is a horizontal strip of user interface real estate
  */
object toolbarMod {
  
  @js.native
  trait Toolbar extends StObject {
    
    def destroy(): Unit = js.native
    
    var hidden: Boolean = js.native
    
    var items: js.Array[ToolbarItem] = js.native
    
    @JSName("off")
    def off_attach(event: attach, handler: js.Function): Unit = js.native
    @JSName("off")
    def off_detach(event: detach, handler: js.Function): Unit = js.native
    @JSName("off")
    def off_hide(event: hide, handler: js.Function): Unit = js.native
    @JSName("off")
    def off_show(event: show, handler: js.Function): Unit = js.native
    
    @JSName("on")
    def on_attach(event: attach, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_detach(event: detach, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_hide(event: hide, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("on")
    def on_show(event: show, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    
    @JSName("once")
    def once_attach(event: attach, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("once")
    def once_detach(event: detach, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("once")
    def once_hide(event: hide, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    @JSName("once")
    def once_show(event: show, handler: js.Function1[/* toolbar */ this.type, _]): Unit = js.native
    
    @JSName("removeListener")
    def removeListener_attach(event: attach, handler: js.Function): Unit = js.native
    @JSName("removeListener")
    def removeListener_detach(event: detach, handler: js.Function): Unit = js.native
    @JSName("removeListener")
    def removeListener_hide(event: hide, handler: js.Function): Unit = js.native
    @JSName("removeListener")
    def removeListener_show(event: show, handler: js.Function): Unit = js.native
    
    var title: String = js.native
  }
  @JSImport("sdk/ui/toolbar", "Toolbar")
  @js.native
  def Toolbar(options: Hidden): Toolbar = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jpm.FFAddonSDK.Frame
    - typingsSlinky.jpm.FFAddonSDK.ActionButton
    - typingsSlinky.jpm.FFAddonSDK.ToggleButton
  */
  trait ToolbarItem extends StObject
}
