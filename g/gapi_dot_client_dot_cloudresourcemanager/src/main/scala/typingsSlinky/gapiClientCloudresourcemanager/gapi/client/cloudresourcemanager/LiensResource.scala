package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudresourcemanager.AnonAlt
import typingsSlinky.gapiClientCloudresourcemanager.AnonBearertoken
import typingsSlinky.gapiClientCloudresourcemanager.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiensResource extends js.Object {
  /**
    * Create a Lien which applies to the resource denoted by the `parent` field.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, applying to `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.
    *
    * NOTE: Some resources may limit the number of Liens which may be applied.
    */
  def create(request: AnonAlt): Request_[Lien] = js.native
  /**
    * Delete a Lien by `name`.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.
    */
  def delete(request: AnonBearertoken): Request_[js.Object] = js.native
  /**
    * List all Liens applied to the `parent` resource.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.get`.
    */
  def list(request: AnonCallback): Request_[ListLiensResponse] = js.native
}

object LiensResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Lien],
    delete: AnonBearertoken => Request_[js.Object],
    list: AnonCallback => Request_[ListLiensResponse]
  ): LiensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LiensResource]
  }
  @scala.inline
  implicit class LiensResourceOps[Self <: LiensResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Lien]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonBearertoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCallback => Request_[ListLiensResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

