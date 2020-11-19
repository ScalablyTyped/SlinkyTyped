package typingsSlinky.officeJs.global

import typingsSlinky.officeJs.OfficeExtension.ClientRequestContext
import typingsSlinky.officeJs.OfficeExtension.RequestUrlAndHeaderInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
///////////////// End OfficeExtension runtime //////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////// Begin OfficeCore ////////////////////////
////////////////////////////////////////////////////////////////
@JSGlobal("OfficeCore")
@js.native
object OfficeCore extends js.Object {
  
  @js.native
  class RequestContext () extends ClientRequestContext {
    def this(url: String) = this()
    def this(url: js.Any) = this()
    def this(url: RequestUrlAndHeaderInfo) = this()
  }
}
