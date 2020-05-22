package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the MassIndex class.
  */
@JSGlobal("ASPxClientMassIndex")
@js.native
class ASPxClientMassIndex ()
  extends typingsSlinky.devexpressWeb.ASPxClientMassIndex {
  /**
    * Returns the name of the Y-axis that is used to plot the current indicator on a ASPxClientXYDiagram.
    */
  /* CompleteClass */
  override var axisY: String = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typingsSlinky.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Returns the count of points used to calculate the exponential moving average (EMA).
    */
  /* CompleteClass */
  override var movingAveragePointsCount: Double = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Returns the name of a pane, used to plot the separate pane indicator on an XYDiagram.
    */
  /* CompleteClass */
  override var pane: String = js.native
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  override var series: typingsSlinky.devexpressWeb.ASPxClientSeries = js.native
  /**
    * Returns the count of summable values.
    */
  /* CompleteClass */
  override var sumPointsCount: Double = js.native
}

