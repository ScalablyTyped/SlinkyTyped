package typingsSlinky.jpm

import typingsSlinky.jpm.jpmStrings.attach
import typingsSlinky.jpm.jpmStrings.detach
import typingsSlinky.jpm.jpmStrings.hide
import typingsSlinky.jpm.jpmStrings.show
import typingsSlinky.jpm.sdkUiToolbarMod.Toolbar
import typingsSlinky.jpm.sdkUiToolbarMod.ToolbarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Add a toolbar to the Firefox user interface. A toolbar is a horizontal strip of user interface real estate
  */
@JSImport("sdk/ui/toolbar", JSImport.Namespace)
@js.native
object sdkUiToolbarMod extends js.Object {
  @js.native
  trait Toolbar extends js.Object {
    var hidden: Boolean = js.native
    var items: js.Array[ToolbarItem] = js.native
    var title: String = js.native
    def destroy(): Unit = js.native
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
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jpm.FFAddonSDK.Frame
    - typings.jpm.FFAddonSDK.ActionButton
    - typings.jpm.FFAddonSDK.ToggleButton
  */
  trait ToolbarItem extends js.Object
  
  def Toolbar(options: Anon_Hidden): Toolbar = js.native
}

