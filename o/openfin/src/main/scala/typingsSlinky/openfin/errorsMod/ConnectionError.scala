package typingsSlinky.openfin.errorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionError extends js.Object
@JSImport("openfin/_v2/fdc3/errors", "ConnectionError")
@js.native
object ConnectionError extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionError with String] = js.native
  
  /**
    * Indicates that no window with a provided OpenFin Identity is registered with the FDC3 service.
    */
  @js.native
  sealed trait WindowWithIdentityNotFound extends ConnectionError
  /* "ConnectionError:WindowWithIdentityNotFound" */ @js.native
  object WindowWithIdentityNotFound extends TopLevel[WindowWithIdentityNotFound with String]
}
