package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for all Crosshair Cursor's elements.
  */
@JSGlobal("ASPxClientCrosshairElementBase")
@js.native
class ASPxClientCrosshairElementBase ()
  extends typingsSlinky.devexpressWeb.ASPxClientCrosshairElementBase {
  /**
    * Returns the Crosshair Cursor's axis label element that belongs to the Crosshair element.
    */
  /* CompleteClass */
  override var AxisLabelElement: typingsSlinky.devexpressWeb.ASPxClientCrosshairAxisLabelElement = js.native
  /**
    * Returns the Crosshair Cursor's label element that belongs to the Crosshair element.
    */
  /* CompleteClass */
  override var LabelElement: typingsSlinky.devexpressWeb.ASPxClientCrosshairSeriesLabelElement = js.native
  /**
    * Returns the Crosshair Cursor's line element that belongs to the Crosshair element.
    */
  /* CompleteClass */
  override var LineElement: typingsSlinky.devexpressWeb.ASPxClientCrosshairLineElement = js.native
  /**
    * Returns the series or indicator point for which the Crosshair Cursor creates this element.
    */
  /* CompleteClass */
  override var Point: typingsSlinky.devexpressWeb.ASPxClientSeriesPoint = js.native
  /**
    * Returns a value that specifies whether the crosshair element is visible.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
}

