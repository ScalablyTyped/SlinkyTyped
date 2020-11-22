package typingsSlinky.jupyterlabStatusbar.hoverMod

import org.scalajs.dom.raw.Event
import typingsSlinky.jupyterlabStatusbar.hoverMod.Popup.IOptions
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/statusbar/lib/components/hover", "Popup")
@js.native
class Popup_ protected () extends Widget {
  /**
    * Construct a new Popup.
    */
  def this(options: IOptions) = this()
  
  var _align: js.Any = js.native
  
  var _anchor: js.Any = js.native
  
  var _body: js.Any = js.native
  
  var _evtClick: js.Any = js.native
  
  var _evtKeydown: js.Any = js.native
  
  var _setGeometry: js.Any = js.native
  
  /**
    * Handle DOM events for the widget.
    */
  def handleEvent(event: Event): Unit = js.native
  
  /**
    * Attach the popup widget to the page.
    */
  def launch(): Unit = js.native
  
  /**
    * Handle `'resize'` messages for the widget.
    */
  /* protected */ def onResize(): Unit = js.native
}
