package typingsSlinky.gitlab.eventsMod

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Events", "Events")
@js.native
class Events () extends BaseService {
  def all(): js.Promise[GetResponse] = js.native
  def all(options: PaginatedRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
}

