package typingsSlinky.officeDashJs.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("Word.ErrorCodes")
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
  
  /* "AccessDenied" */ val accessDenied: typingsSlinky.officeDashJs.Word.ErrorCodes.accessDenied with String = js.native
  /* "GeneralException" */ val generalException: typingsSlinky.officeDashJs.Word.ErrorCodes.generalException with String = js.native
  /* "InvalidArgument" */ val invalidArgument: typingsSlinky.officeDashJs.Word.ErrorCodes.invalidArgument with String = js.native
  /* "ItemNotFound" */ val itemNotFound: typingsSlinky.officeDashJs.Word.ErrorCodes.itemNotFound with String = js.native
  /* "NotImplemented" */ val notImplemented: typingsSlinky.officeDashJs.Word.ErrorCodes.notImplemented with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCodes with String] = js.native
}

