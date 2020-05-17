package typingsSlinky.gitlab.resourceAccessRequestsMod

import typingsSlinky.gitlab.anon.accessLevelAccessLevelSud
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/templates/ResourceAccessRequests", "ResourceAccessRequests")
@js.native
class ResourceAccessRequests protected () extends BaseService {
  def this(resourceType: String, options: BaseServiceOptions) = this()
  def all(resourceId: String): js.Promise[GetResponse] = js.native
  def all(resourceId: Double): js.Promise[GetResponse] = js.native
  def approve(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
  def approve(resourceId: String, userId: Double, hasAccessLevel: accessLevelAccessLevelSud): js.Promise[js.Object] = js.native
  def approve(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
  def approve(resourceId: Double, userId: Double, hasAccessLevel: accessLevelAccessLevelSud): js.Promise[js.Object] = js.native
  def deny(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
  def deny(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
  def request(resourceId: String): js.Promise[js.Object] = js.native
  def request(resourceId: Double): js.Promise[js.Object] = js.native
}

