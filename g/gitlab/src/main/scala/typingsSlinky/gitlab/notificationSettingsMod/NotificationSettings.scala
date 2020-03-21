package typingsSlinky.gitlab.notificationSettingsMod

import typingsSlinky.gitlab.Anon0
import typingsSlinky.gitlab.Anon1
import typingsSlinky.gitlab.AnonLevel
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
@js.native
class NotificationSettings () extends BaseService {
  def all(hasProjectIdGroupIdOptions: (Anon0 | Anon1) with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def edit(hasProjectIdGroupIdOptions: AnonLevel with (Anon0 | Anon1) with BaseRequestOptions): js.Promise[js.Object] = js.native
}

