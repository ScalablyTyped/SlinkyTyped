package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudresourcemanager.anon.Alt
import typingsSlinky.gapiClientCloudresourcemanager.anon.Bearertoken
import typingsSlinky.gapiClientCloudresourcemanager.anon.Callback
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
  def create(request: Alt): Request[Lien] = js.native
  /**
    * Delete a Lien by `name`.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.
    */
  def delete(request: Bearertoken): Request[js.Object] = js.native
  /**
    * List all Liens applied to the `parent` resource.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.get`.
    */
  def list(request: Callback): Request[ListLiensResponse] = js.native
}

object LiensResource {
  @scala.inline
  def apply(
    create: Alt => Request[Lien],
    delete: Bearertoken => Request[js.Object],
    list: Callback => Request[ListLiensResponse]
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
    def withCreate(value: Alt => Request[Lien]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Bearertoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Callback => Request[ListLiensResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

