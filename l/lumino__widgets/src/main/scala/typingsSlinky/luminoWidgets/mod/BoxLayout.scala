package typingsSlinky.luminoWidgets.mod

import typingsSlinky.luminoWidgets.boxlayoutMod.BoxLayout.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "BoxLayout")
@js.native
/**
  * Construct a new box layout.
  *
  * @param options - The options for initializing the layout.
  */
class BoxLayout ()
  extends typingsSlinky.luminoWidgets.boxlayoutMod.BoxLayout {
  def this(options: IOptions) = this()
}
object BoxLayout {
  
  /**
    * Get the box layout size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box layout size basis for the widget.
    */
  @JSImport("@lumino/widgets", "BoxLayout.getSizeBasis")
  @js.native
  def getSizeBasis(widget: typingsSlinky.luminoWidgets.widgetMod.Widget): Double = js.native
  
  /**
    * Get the box layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box layout stretch factor for the widget.
    */
  @JSImport("@lumino/widgets", "BoxLayout.getStretch")
  @js.native
  def getStretch(widget: typingsSlinky.luminoWidgets.widgetMod.Widget): Double = js.native
  
  /**
    * Set the box layout size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the size basis.
    */
  @JSImport("@lumino/widgets", "BoxLayout.setSizeBasis")
  @js.native
  def setSizeBasis(widget: typingsSlinky.luminoWidgets.widgetMod.Widget, value: Double): Unit = js.native
  
  /**
    * Set the box layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  @JSImport("@lumino/widgets", "BoxLayout.setStretch")
  @js.native
  def setStretch(widget: typingsSlinky.luminoWidgets.widgetMod.Widget, value: Double): Unit = js.native
}
