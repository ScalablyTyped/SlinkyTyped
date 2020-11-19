package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common

import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[TDomain]
  extends typingsSlinky.applicationinsightsJs.Microsoft.Telemetry.Data[TDomain]
     with ISerializable
object Data {
  
  @scala.inline
  def apply[TDomain](aiDataContract: js.Any, baseData: TDomain, baseType: String): Data[TDomain] = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], baseData = baseData.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TDomain]]
  }
}
