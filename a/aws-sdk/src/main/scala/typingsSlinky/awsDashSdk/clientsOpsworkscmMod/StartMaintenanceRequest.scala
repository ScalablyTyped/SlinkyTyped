package typingsSlinky.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMaintenanceRequest extends js.Object {
  /**
    * Engine attributes that are specific to the server on which you want to run maintenance.
    */
  var EngineAttributes: js.UndefOr[typingsSlinky.awsDashSdk.clientsOpsworkscmMod.EngineAttributes] = js.native
  /**
    * The name of the server on which to run maintenance. 
    */
  var ServerName: typingsSlinky.awsDashSdk.clientsOpsworkscmMod.ServerName = js.native
}

object StartMaintenanceRequest {
  @scala.inline
  def apply(ServerName: ServerName, EngineAttributes: EngineAttributes = null): StartMaintenanceRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    if (EngineAttributes != null) __obj.updateDynamic("EngineAttributes")(EngineAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMaintenanceRequest]
  }
}

