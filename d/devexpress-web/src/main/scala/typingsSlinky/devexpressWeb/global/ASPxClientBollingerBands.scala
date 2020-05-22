package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the BollingerBands class.
  */
@JSGlobal("ASPxClientBollingerBands")
@js.native
class ASPxClientBollingerBands ()
  extends typingsSlinky.devexpressWeb.ASPxClientBollingerBands {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typingsSlinky.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the number of data points used to calculate the indicator values.
    */
  /* CompleteClass */
  override var pointsCount: Double = js.native
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  override var series: typingsSlinky.devexpressWeb.ASPxClientSeries = js.native
  /**
    * Gets a value, indicating whose series point values are used to calculate the indicator's values.
    */
  /* CompleteClass */
  override var valueLevel: String = js.native
}

