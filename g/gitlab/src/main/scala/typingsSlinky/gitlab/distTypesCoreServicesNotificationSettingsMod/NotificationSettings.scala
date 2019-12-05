package typingsSlinky.gitlab.distTypesCoreServicesNotificationSettingsMod

import typingsSlinky.gitlab.Anon_GroupIdNumber
import typingsSlinky.gitlab.Anon_Level
import typingsSlinky.gitlab.Anon_ProjectIdNumber
import typingsSlinky.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
@js.native
class NotificationSettings () extends BaseService {
  def all(
    hasProjectIdGroupIdOptions: (Anon_ProjectIdNumber | Anon_GroupIdNumber) with PaginatedRequestOptions
  ): js.Promise[GetResponse] = js.native
  def edit(
    hasProjectIdGroupIdOptions: Anon_Level with (Anon_ProjectIdNumber | Anon_GroupIdNumber) with BaseRequestOptions
  ): js.Promise[js.Object] = js.native
}

