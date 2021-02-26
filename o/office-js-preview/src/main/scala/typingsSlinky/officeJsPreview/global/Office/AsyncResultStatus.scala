package typingsSlinky.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the result of an asynchronous call.
  *
  * @remarks
  *
  * Returned by the `status` property of the {@link Office.AsyncResult | AsyncResult} object.
  */
@JSGlobal("Office.AsyncResultStatus")
@js.native
object AsyncResultStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.officeJsPreview.Office.AsyncResultStatus with Double] = js.native
  
  /* 1 */ val Failed: typingsSlinky.officeJsPreview.Office.AsyncResultStatus.Failed with Double = js.native
  
  /* 0 */ val Succeeded: typingsSlinky.officeJsPreview.Office.AsyncResultStatus.Succeeded with Double = js.native
}
