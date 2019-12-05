package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("Excel.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait accessDenied extends ErrorCodes
  
  @js.native
  sealed trait apiNotFound extends ErrorCodes
  
  @js.native
  sealed trait conflict extends ErrorCodes
  
  @js.native
  sealed trait generalException extends ErrorCodes
  
  @js.native
  sealed trait insertDeleteConflict extends ErrorCodes
  
  @js.native
  sealed trait invalidArgument extends ErrorCodes
  
  @js.native
  sealed trait invalidBinding extends ErrorCodes
  
  @js.native
  sealed trait invalidOperation extends ErrorCodes
  
  @js.native
  sealed trait invalidOperationInCellEditMode extends ErrorCodes
  
  @js.native
  sealed trait invalidReference extends ErrorCodes
  
  @js.native
  sealed trait invalidSelection extends ErrorCodes
  
  @js.native
  sealed trait itemAlreadyExists extends ErrorCodes
  
  @js.native
  sealed trait itemNotFound extends ErrorCodes
  
  @js.native
  sealed trait nonBlankCellOffSheet extends ErrorCodes
  
  @js.native
  sealed trait notImplemented extends ErrorCodes
  
  @js.native
  sealed trait rangeExceedsLimit extends ErrorCodes
  
  @js.native
  sealed trait requestAborted extends ErrorCodes
  
  @js.native
  sealed trait unsupportedOperation extends ErrorCodes
  
  /* "AccessDenied" */ val accessDenied: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.accessDenied with String = js.native
  /* "ApiNotFound" */ val apiNotFound: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.apiNotFound with String = js.native
  /* "Conflict" */ val conflict: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.conflict with String = js.native
  /* "GeneralException" */ val generalException: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.generalException with String = js.native
  /* "InsertDeleteConflict" */ val insertDeleteConflict: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.insertDeleteConflict with String = js.native
  /* "InvalidArgument" */ val invalidArgument: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.invalidArgument with String = js.native
  /* "InvalidBinding" */ val invalidBinding: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.invalidBinding with String = js.native
  /* "InvalidOperation" */ val invalidOperation: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.invalidOperation with String = js.native
  /* "InvalidOperationInCellEditMode" */ val invalidOperationInCellEditMode: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.invalidOperationInCellEditMode with String = js.native
  /* "InvalidReference" */ val invalidReference: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.invalidReference with String = js.native
  /* "InvalidSelection" */ val invalidSelection: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.invalidSelection with String = js.native
  /* "ItemAlreadyExists" */ val itemAlreadyExists: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.itemAlreadyExists with String = js.native
  /* "ItemNotFound" */ val itemNotFound: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.itemNotFound with String = js.native
  /* "NonBlankCellOffSheet" */ val nonBlankCellOffSheet: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.nonBlankCellOffSheet with String = js.native
  /* "NotImplemented" */ val notImplemented: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.notImplemented with String = js.native
  /* "RangeExceedsLimit" */ val rangeExceedsLimit: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.rangeExceedsLimit with String = js.native
  /* "RequestAborted" */ val requestAborted: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.requestAborted with String = js.native
  /* "UnsupportedOperation" */ val unsupportedOperation: typingsSlinky.officeDashJsDashPreview.Excel.ErrorCodes.unsupportedOperation with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCodes with String] = js.native
}

