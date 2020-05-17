package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTagmanager.anon.Alt
import typingsSlinky.gapiClientTagmanager.anon.Fields
import typingsSlinky.gapiClientTagmanager.anon.Fingerprint
import typingsSlinky.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainersResource extends js.Object {
  var environments: EnvironmentsResource = js.native
  var version_headers: VersionHeadersResource = js.native
  var versions: VersionsResource = js.native
  var workspaces: WorkspacesResource = js.native
  /** Creates a Container. */
  def create(request: Alt): Request[Container] = js.native
  /** Deletes a Container. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a Container. */
  def get(request: Fields): Request[Container] = js.native
  /** Lists all Containers that belongs to a GTM Account. */
  def list(request: Key): Request[ListContainersResponse] = js.native
  /** Updates a Container. */
  def update(request: Fingerprint): Request[Container] = js.native
}

object ContainersResource {
  @scala.inline
  def apply(
    create: Alt => Request[Container],
    delete: Fields => Request[Unit],
    environments: EnvironmentsResource,
    get: Fields => Request[Container],
    list: Key => Request[ListContainersResponse],
    update: Fingerprint => Request[Container],
    version_headers: VersionHeadersResource,
    versions: VersionsResource,
    workspaces: WorkspacesResource
  ): ContainersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), environments = environments.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), version_headers = version_headers.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainersResource]
  }
  @scala.inline
  implicit class ContainersResourceOps[Self <: ContainersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Alt => Request[Container]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnvironments(value: EnvironmentsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[Container]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[ListContainersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Fingerprint => Request[Container]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVersion_headers(value: VersionHeadersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: VersionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaces(value: WorkspacesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaces")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

