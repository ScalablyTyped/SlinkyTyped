package typingsSlinky.jupyterlabSettingeditor.pluginlistMod

import org.scalajs.dom.raw.Event
import typingsSlinky.jupyterlabSettingeditor.pluginlistMod.PluginList.IOptions
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingeditor/lib/pluginlist", "PluginList")
@js.native
class PluginList_ protected () extends Widget {
  /**
    * Create a new plugin list.
    */
  def this(options: IOptions) = this()
  
  var _changed: js.Any = js.native
  
  var _confirm: js.Any = js.native
  
  /**
    * Handle the `'mousedown'` event for the plugin list.
    *
    * @param event - The DOM event sent to the widget
    */
  var _evtMousedown: js.Any = js.native
  
  var _scrollTop: js.Any = js.native
  
  var _selection: js.Any = js.native
  
  /**
    * A signal emitted when a list user interaction happens.
    */
  def changed: ISignal[this.type, Unit] = js.native
  
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the plugin list's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  
  /**
    * The setting registry.
    */
  val registry: ISettingRegistry = js.native
  
  /**
    * The selection value of the plugin list.
    */
  def scrollTop: js.UndefOr[Double] = js.native
  
  /**
    * The selection value of the plugin list.
    */
  def selection: String = js.native
  def selection_=(selection: String): Unit = js.native
}
