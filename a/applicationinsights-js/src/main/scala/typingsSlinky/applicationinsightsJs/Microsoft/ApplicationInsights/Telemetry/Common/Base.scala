package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common

import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base
  extends typingsSlinky.applicationinsightsJs.Microsoft.Telemetry.Base
     with ISerializable
object Base {
  
  @scala.inline
  def apply(aiDataContract: js.Any, baseType: String): Base = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}
