package typingsSlinky.jupyterlabApputils.collapseMod

import org.scalajs.dom.raw.Event
import typingsSlinky.jupyterlabApputils.collapseMod.Collapse.IOptions
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils/lib/collapse", "Collapse")
@js.native
class Collapse_[T /* <: Widget */] protected () extends Widget {
  def this(options: IOptions[T]) = this()
  
  var _collapse: js.Any = js.native
  
  var _collapseChanged: js.Any = js.native
  
  var _collapsed: js.Any = js.native
  
  var _content: js.Any = js.native
  
  var _evtClick: js.Any = js.native
  
  var _header: js.Any = js.native
  
  /**
    * Handle the `changed` signal of a title object.
    */
  var _onTitleChanged: js.Any = js.native
  
  var _setHeader: js.Any = js.native
  
  var _uncollapse: js.Any = js.native
  
  var _widget: js.Any = js.native
  
  /**
    * A signal for when the widget collapse state changes.
    */
  def collapseChanged: ISignal[Collapse[Widget], Unit] = js.native
  
  /**
    * The collapsed state of the panel.
    */
  def collapsed: Boolean = js.native
  def collapsed_=(value: Boolean): Unit = js.native
  
  /**
    * Handle the DOM events for the Collapse widget.
    *
    * @param event - The DOM event sent to the panel.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the panel's DOM node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  
  /**
    * Toggle the collapse state of the panel.
    */
  def toggle(): Unit = js.native
  
  /**
    * The widget inside the collapse panel.
    */
  def widget: T = js.native
  def widget_=(widget: T): Unit = js.native
}
