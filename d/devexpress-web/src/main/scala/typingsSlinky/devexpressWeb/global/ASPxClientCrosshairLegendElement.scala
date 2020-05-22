package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairLegendElement class.
  */
@JSGlobal("ASPxClientCrosshairLegendElement")
@js.native
class ASPxClientCrosshairLegendElement ()
  extends typingsSlinky.devexpressWeb.ASPxClientCrosshairLegendElement {
  /**
    * Provides access to the crosshair axis label element to custom draw the crosshair.
    */
  /* CompleteClass */
  override var AxisLabelElement: typingsSlinky.devexpressWeb.ASPxClientCrosshairAxisLabelElement = js.native
  /**
    * Returns the Crosshair Cursor's line element to custom draw the crosshair.
    */
  /* CompleteClass */
  override var LineElement: typingsSlinky.devexpressWeb.ASPxClientCrosshairLineElement = js.native
  /**
    * Returns the series or indicator point for which the Crosshair Cursor creates this element.
    */
  /* CompleteClass */
  override var Point: typingsSlinky.devexpressWeb.ASPxClientSeriesPoint = js.native
  /**
    * Returns a series whose point the Crosshair Cursor legend element highlights.
    */
  /* CompleteClass */
  override var Series: typingsSlinky.devexpressWeb.ASPxClientSeries = js.native
  /**
    * Returns the value that specifies whether the crosshair legend element is visible.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
}

