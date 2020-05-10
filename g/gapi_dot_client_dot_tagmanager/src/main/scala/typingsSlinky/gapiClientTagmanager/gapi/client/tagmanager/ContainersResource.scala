package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTagmanager.AnonAlt
import typingsSlinky.gapiClientTagmanager.AnonFields
import typingsSlinky.gapiClientTagmanager.AnonFingerprint
import typingsSlinky.gapiClientTagmanager.AnonKey
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
  def create(request: AnonAlt): Request_[Container] = js.native
  /** Deletes a Container. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets a Container. */
  def get(request: AnonFields): Request_[Container] = js.native
  /** Lists all Containers that belongs to a GTM Account. */
  def list(request: AnonKey): Request_[ListContainersResponse] = js.native
  /** Updates a Container. */
  def update(request: AnonFingerprint): Request_[Container] = js.native
}

object ContainersResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Container],
    delete: AnonFields => Request_[Unit],
    environments: EnvironmentsResource,
    get: AnonFields => Request_[Container],
    list: AnonKey => Request_[ListContainersResponse],
    update: AnonFingerprint => Request_[Container],
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
    def withCreate(value: AnonAlt => Request_[Container]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
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
    def withGet(value: AnonFields => Request_[Container]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListContainersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFingerprint => Request_[Container]): Self = {
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

