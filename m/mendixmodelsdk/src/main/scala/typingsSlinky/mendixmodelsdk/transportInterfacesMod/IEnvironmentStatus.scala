package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.fail
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.AnonAppType
  - typingsSlinky.mendixmodelsdk.AnonCause
*/
trait IEnvironmentStatus extends js.Object

object IEnvironmentStatus {
  @scala.inline
  def AnonAppType(
    disk: Double,
    endpoint: String,
    environmentId: String,
    instances: Double,
    memory: Double,
    name: String,
    profile: String,
    state: SuccessAppState,
    `type`: success,
    url: String
  ): IEnvironmentStatus = {
    val __obj = js.Dynamic.literal(disk = disk.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnvironmentStatus]
  }
  @scala.inline
  def AnonCause(state: CannotFixAppState, `type`: fail): IEnvironmentStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnvironmentStatus]
  }
}

