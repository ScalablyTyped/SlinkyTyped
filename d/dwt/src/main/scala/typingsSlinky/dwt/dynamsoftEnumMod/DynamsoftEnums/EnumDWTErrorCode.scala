package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTErrorCode extends js.Object
/** -2400 to -2499 is webcam error code */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ErrorCode")
@js.native
object EnumDWTErrorCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTErrorCode with Double] = js.native
  
  /** Can't add the filter to graph */
  @js.native
  sealed trait WCERR_FAIL_ADDFILTER extends EnumDWTErrorCode
  /* -2411 */ @js.native
  object WCERR_FAIL_ADDFILTER extends TopLevel[WCERR_FAIL_ADDFILTER with Double]
  
  /** Can't build the graph */
  @js.native
  sealed trait WCERR_FAIL_BUILDGRAPH extends EnumDWTErrorCode
  /* -2412 */ @js.native
  object WCERR_FAIL_BUILDGRAPH extends TopLevel[WCERR_FAIL_BUILDGRAPH with Double]
  
  /** Could not create filter graph. */
  @js.native
  sealed trait WCERR_FAIL_FILTERGRAPH extends EnumDWTErrorCode
  /* -2408 */ @js.native
  object WCERR_FAIL_FILTERGRAPH extends TopLevel[WCERR_FAIL_FILTERGRAPH with Double]
  
  /** Create ICreateDevEnum interface failed. */
  @js.native
  sealed trait WCERR_FAIL_ICREATEDEVENUM extends EnumDWTErrorCode
  /* -2401 */ @js.native
  object WCERR_FAIL_ICREATEDEVENUM extends TopLevel[WCERR_FAIL_ICREATEDEVENUM with Double]
  
  /** Create IEnumMoniker interface failed. */
  @js.native
  sealed trait WCERR_FAIL_IENUMMONIKER extends EnumDWTErrorCode
  /* -2402 */ @js.native
  object WCERR_FAIL_IENUMMONIKER extends TopLevel[WCERR_FAIL_IENUMMONIKER with Double]
  
  /** Failed to register filter graph with ROT. */
  @js.native
  sealed trait WCERR_FAIL_REGFILTERGRAPH extends EnumDWTErrorCode
  /* -2413 */ @js.native
  object WCERR_FAIL_REGFILTERGRAPH extends TopLevel[WCERR_FAIL_REGFILTERGRAPH with Double]
  
  /** Could not create SampleGrabber (isqedit.all registered?). */
  @js.native
  sealed trait WCERR_FAIL_SAMPLEGRABBER extends EnumDWTErrorCode
  /* -2409 */ @js.native
  object WCERR_FAIL_SAMPLEGRABBER extends TopLevel[WCERR_FAIL_SAMPLEGRABBER with Double]
  
  /** Could not get video window interface */
  @js.native
  sealed trait WCERR_FAIL_VIDEOWINDOW extends EnumDWTErrorCode
  /* -2407 */ @js.native
  object WCERR_FAIL_VIDEOWINDOW extends TopLevel[WCERR_FAIL_VIDEOWINDOW with Double]
  
  /** Time out */
  @js.native
  sealed trait WCERR_GRAB_TIMEOUT extends EnumDWTErrorCode
  /* -2414 */ @js.native
  object WCERR_GRAB_TIMEOUT extends TopLevel[WCERR_GRAB_TIMEOUT with Double]
  
  /** The property doesn't support auto capability. */
  @js.native
  sealed trait WCERR_NOT_AUTOPROPERTY extends EnumDWTErrorCode
  /* -2405 */ @js.native
  object WCERR_NOT_AUTOPROPERTY extends TopLevel[WCERR_NOT_AUTOPROPERTY with Double]
  
  /** The camera doesn't support IAMCameraControl interface. */
  @js.native
  sealed trait WCERR_NOT_IAMCAMERACONTROL extends EnumDWTErrorCode
  /* -2404 */ @js.native
  object WCERR_NOT_IAMCAMERACONTROL extends TopLevel[WCERR_NOT_IAMCAMERACONTROL with Double]
  
  /** The camera doesn't support IAMVideoProcAmp interface. */
  @js.native
  sealed trait WCERR_NOT_IAMVIDEOPROPERTY extends EnumDWTErrorCode
  /* -2403 */ @js.native
  object WCERR_NOT_IAMVIDEOPROPERTY extends TopLevel[WCERR_NOT_IAMVIDEOPROPERTY with Double]
  
  /** No webcam device is found. */
  @js.native
  sealed trait WCERR_NO_DEVICE extends EnumDWTErrorCode
  /* -2406 */ @js.native
  object WCERR_NO_DEVICE extends TopLevel[WCERR_NO_DEVICE with Double]
  
  /** Unable to make NULL renderer */
  @js.native
  sealed trait WCERR_NULLRENDER extends EnumDWTErrorCode
  /* -2410 */ @js.native
  object WCERR_NULLRENDER extends TopLevel[WCERR_NULLRENDER with Double]
  
  /** All error from directshow sdk */
  @js.native
  sealed trait WCERR_SYSTEM extends EnumDWTErrorCode
  /* -2400 */ @js.native
  object WCERR_SYSTEM extends TopLevel[WCERR_SYSTEM with Double]
}
