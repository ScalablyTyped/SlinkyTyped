package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the TimeInterval class.
  */
@JSGlobal("ASPxClientTimeInterval")
@js.native
class ASPxClientTimeInterval protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientTimeInterval {
  /**
    * Initializes a new instance of the ASPxClientTimeInterval class with the specified start time and duration.
    * @param start A DateTime object, representing the beginning of the period.
    * @param duration A TimeSpan structure, representing a time interval.
    */
  def this(start: js.Date, duration: js.Any) = this()
}
/* static members */
@JSGlobal("ASPxClientTimeInterval")
@js.native
object ASPxClientTimeInterval extends js.Object {
  
  /**
    * Calculates the time interval duration. An integer value specifying the interval duration in milliseconds.
    * @param start A DateTime value that specifies the start date time value.
    * @param end A DateTime value that specifies the end date time value.
    */
  def CalculateDuration(start: js.Date, end: js.Date): Double = js.native
}
