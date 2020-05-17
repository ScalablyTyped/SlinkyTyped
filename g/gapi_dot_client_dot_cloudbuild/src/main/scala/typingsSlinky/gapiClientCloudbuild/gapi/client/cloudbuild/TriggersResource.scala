package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudbuild.anon.Callback
import typingsSlinky.gapiClientCloudbuild.anon.Key
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
  def create(request: Callback): Request[BuildTrigger] = js.native
  /**
    * Deletes an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def delete(request: Key): Request[js.Object] = js.native
  /**
    * Gets information about a BuildTrigger.
    *
    * This API is experimental.
    */
  def get(request: Key): Request[BuildTrigger] = js.native
  /**
    * Lists existing BuildTrigger.
    *
    * This API is experimental.
    */
  def list(request: Callback): Request[ListBuildTriggersResponse] = js.native
  /**
    * Updates an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def patch(request: Key): Request[BuildTrigger] = js.native
}

object TriggersResource {
  @scala.inline
  def apply(
    create: Callback => Request[BuildTrigger],
    delete: Key => Request[js.Object],
    get: Key => Request[BuildTrigger],
    list: Callback => Request[ListBuildTriggersResponse],
    patch: Key => Request[BuildTrigger]
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
    def withCreate(value: Callback => Request[BuildTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Key => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Key => Request[BuildTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Callback => Request[ListBuildTriggersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Key => Request[BuildTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

