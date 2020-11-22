package typingsSlinky.jupyterlabCsvviewer.toolbarMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLSelectElement
import typingsSlinky.jupyterlabCsvviewer.toolbarMod.CSVToolbar.IOptions
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/csvviewer/lib/toolbar", "CSVDelimiter")
@js.native
class CSVDelimiter protected () extends Widget {
  /**
    * Construct a new csv table widget.
    */
  def this(options: IOptions) = this()
  
  var _delimiterChanged: js.Any = js.native
  
  /**
    * A signal emitted when the delimiter selection has changed.
    */
  def delimiterChanged: ISignal[this.type, String] = js.native
  
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the dock panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  
  /**
    * The delimiter dropdown menu.
    */
  def selectNode: HTMLSelectElement = js.native
}
