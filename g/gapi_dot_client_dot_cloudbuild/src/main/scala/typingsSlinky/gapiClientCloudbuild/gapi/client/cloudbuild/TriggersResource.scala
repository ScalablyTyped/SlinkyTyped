package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudbuild.AnonCallback
import typingsSlinky.gapiClientCloudbuild.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggersResource extends js.Object {
  /**
    * Creates a new BuildTrigger.
    *
    * This API is experimental.
    */
  def create(request: AnonCallback): Request_[BuildTrigger] = js.native
  /**
    * Deletes an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def delete(request: AnonKey): Request_[js.Object] = js.native
  /**
    * Gets information about a BuildTrigger.
    *
    * This API is experimental.
    */
  def get(request: AnonKey): Request_[BuildTrigger] = js.native
  /**
    * Lists existing BuildTrigger.
    *
    * This API is experimental.
    */
  def list(request: AnonCallback): Request_[ListBuildTriggersResponse] = js.native
  /**
    * Updates an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def patch(request: AnonKey): Request_[BuildTrigger] = js.native
}

object TriggersResource {
  @scala.inline
  def apply(
    create: AnonCallback => Request_[BuildTrigger],
    delete: AnonKey => Request_[js.Object],
    get: AnonKey => Request_[BuildTrigger],
    list: AnonCallback => Request_[ListBuildTriggersResponse],
    patch: AnonKey => Request_[BuildTrigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[TriggersResource]
  }
  @scala.inline
  implicit class TriggersResourceOps[Self <: TriggersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonCallback => Request_[BuildTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonKey => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[BuildTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCallback => Request_[ListBuildTriggersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonKey => Request_[BuildTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

