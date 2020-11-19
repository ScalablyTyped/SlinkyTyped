package typingsSlinky.azureSb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure-sb", "createServiceBusService")
@js.native
object createServiceBusService extends js.Object {
  
  def apply(
    namespaceOrConnectionString: js.UndefOr[String],
    accessKey: js.UndefOr[String],
    issuer: js.UndefOr[String],
    acsNamespace: js.UndefOr[String],
    host: js.UndefOr[String],
    authenticationProvider: js.UndefOr[js.Object]
  ): ServiceBusService = js.native
}
