package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisBase class.
  */
@JSGlobal("ASPxClientAxisBase")
@js.native
class ASPxClientAxisBase ()
  extends typingsSlinky.devexpressWeb.ASPxClientAxisBase {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typingsSlinky.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Provides access to the XY-diagram which contains the current axis.
    */
  /* CompleteClass */
  override var diagram: typingsSlinky.devexpressWeb.ASPxClientXYDiagramBase = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Provides acess to the range of the axis coordinates.
    */
  /* CompleteClass */
  override var range: typingsSlinky.devexpressWeb.ASPxClientAxisRange = js.native
}

