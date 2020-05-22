package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Legend class.
  */
@JSGlobal("ASPxClientLegend")
@js.native
class ASPxClientLegend ()
  extends typingsSlinky.devexpressWeb.ASPxClientLegend {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typingsSlinky.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Returns a collection of custom legend items of the legend.
    */
  /* CompleteClass */
  override var customItems: js.Array[typingsSlinky.devexpressWeb.ASPxClientCustomLegendItem] = js.native
  /**
    * Returns the name of the legend.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Returns a value which determines whether to use checkboxes instead of markers on a chart legend for all legend items.
    */
  /* CompleteClass */
  override var useCheckBoxes: Boolean = js.native
}

