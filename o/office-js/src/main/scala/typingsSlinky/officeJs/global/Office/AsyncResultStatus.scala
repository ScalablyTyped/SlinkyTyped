package typingsSlinky.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Enumerations
/**
  * Specifies the result of an asynchronous call.
  * 
  * @remarks
  * 
  * Returned by the `status` property of the {@link Office.AsyncResult | AsyncResult} object.
  */
@JSGlobal("Office.AsyncResultStatus")
@js.native
object AsyncResultStatus extends js.Object {
  /* 1 */ val Failed: typingsSlinky.officeJs.Office.AsyncResultStatus.Failed with Double = js.native
  /* 0 */ val Succeeded: typingsSlinky.officeJs.Office.AsyncResultStatus.Succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.officeJs.Office.AsyncResultStatus with Double] = js.native
}

