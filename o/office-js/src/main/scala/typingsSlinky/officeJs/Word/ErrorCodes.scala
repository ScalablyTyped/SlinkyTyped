package typingsSlinky.officeJs.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @js.native
  sealed trait searchDialogIsOpen extends ErrorCodes
  
  @js.native
  sealed trait searchStringInvalidOrTooLong extends ErrorCodes
}
