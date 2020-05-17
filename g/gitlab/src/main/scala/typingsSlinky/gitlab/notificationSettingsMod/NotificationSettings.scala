package typingsSlinky.gitlab.notificationSettingsMod

import typingsSlinky.gitlab.anon.Level
import typingsSlinky.gitlab.anon.`0`
import typingsSlinky.gitlab.anon.`1`
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
  def all(hasProjectIdGroupIdOptions: (`0` | `1`) with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def edit(hasProjectIdGroupIdOptions: Level with (`0` | `1`) with BaseRequestOptions): js.Promise[js.Object] = js.native
}

