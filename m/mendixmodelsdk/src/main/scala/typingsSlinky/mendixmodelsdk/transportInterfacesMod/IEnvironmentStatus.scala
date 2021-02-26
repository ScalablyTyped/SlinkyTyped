package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.fail
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.success_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.anon.AppType
  - typingsSlinky.mendixmodelsdk.anon.Cause
*/
trait IEnvironmentStatus extends StObject
object IEnvironmentStatus {
  
  @scala.inline
  def AppType(
    disk: Double,
    endpoint: String,
    environmentId: String,
    instances: Double,
    memory: Double,
    name: String,
    profile: String,
    state: SuccessAppState,
    `type`: success_,
    url: String
  ): typingsSlinky.mendixmodelsdk.anon.AppType = {
    val __obj = js.Dynamic.literal(disk = disk.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.anon.AppType]
  }
  
  @scala.inline
  def Cause(state: CannotFixAppState, `type`: fail): typingsSlinky.mendixmodelsdk.anon.Cause = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.anon.Cause]
  }
}
