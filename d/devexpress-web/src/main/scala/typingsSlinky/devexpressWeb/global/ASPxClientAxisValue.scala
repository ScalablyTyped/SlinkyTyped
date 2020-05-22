package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the information about an axis value.
  */
@JSGlobal("ASPxClientAxisValue")
@js.native
class ASPxClientAxisValue ()
  extends typingsSlinky.devexpressWeb.ASPxClientAxisValue {
  /**
    * Gets the axis value, if the axis scale type is date-time.
    */
  /* CompleteClass */
  override var dateTimeValue: js.Date = js.native
  /**
    * Gets the axis value, if the axis scale type is numerical.
    */
  /* CompleteClass */
  override var numericalValue: Double = js.native
  /**
    * Gets the axis value, if the axis scale type is qualitative.
    */
  /* CompleteClass */
  override var qualitativeValue: String = js.native
  /**
    * Gets the axis scale type.
    */
  /* CompleteClass */
  override var scaleType: String = js.native
  /* CompleteClass */
  override var timeSpanValue: js.Any = js.native
}

