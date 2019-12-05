package typingsSlinky.officeDashJs.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("Visio.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait accessDenied extends ErrorCodes
  
  @js.native
  sealed trait generalException extends ErrorCodes
  
  @js.native
  sealed trait invalidArgument extends ErrorCodes
  
  @js.native
  sealed trait itemNotFound extends ErrorCodes
  
  @js.native
  sealed trait notImplemented extends ErrorCodes
  
  @js.native
  sealed trait unsupportedOperation extends ErrorCodes
  
  /* "AccessDenied" */ val accessDenied: typingsSlinky.officeDashJs.Visio.ErrorCodes.accessDenied with String = js.native
  /* "GeneralException" */ val generalException: typingsSlinky.officeDashJs.Visio.ErrorCodes.generalException with String = js.native
  /* "InvalidArgument" */ val invalidArgument: typingsSlinky.officeDashJs.Visio.ErrorCodes.invalidArgument with String = js.native
  /* "ItemNotFound" */ val itemNotFound: typingsSlinky.officeDashJs.Visio.ErrorCodes.itemNotFound with String = js.native
  /* "NotImplemented" */ val notImplemented: typingsSlinky.officeDashJs.Visio.ErrorCodes.notImplemented with String = js.native
  /* "UnsupportedOperation" */ val unsupportedOperation: typingsSlinky.officeDashJs.Visio.ErrorCodes.unsupportedOperation with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCodes with String] = js.native
}

