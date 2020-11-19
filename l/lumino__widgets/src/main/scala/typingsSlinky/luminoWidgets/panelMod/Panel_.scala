package typingsSlinky.luminoWidgets.panelMod

import typingsSlinky.luminoWidgets.panelMod.Panel.IOptions
import typingsSlinky.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets/types/panel", "Panel")
@js.native
/**
  * Construct a new panel.
  *
  * @param options - The options for initializing the panel.
  */
class Panel_ () extends Widget {
  def this(options: IOptions) = this()
  
  /**
    * Add a widget to the end of the panel.
    *
    * @param widget - The widget to add to the panel.
    *
    * #### Notes
    * If the widget is already contained in the panel, it will be moved.
    */
  def addWidget(widget: Widget): Unit = js.native
  
  /**
    * Insert a widget at the specified index.
    *
    * @param index - The index at which to insert the widget.
    *
    * @param widget - The widget to insert into to the panel.
    *
    * #### Notes
    * If the widget is already contained in the panel, it will be moved.
    */
  def insertWidget(index: Double, widget: Widget): Unit = js.native
  
  /**
    * A read-only array of the widgets in the panel.
    */
  val widgets: js.Array[Widget] = js.native
}
