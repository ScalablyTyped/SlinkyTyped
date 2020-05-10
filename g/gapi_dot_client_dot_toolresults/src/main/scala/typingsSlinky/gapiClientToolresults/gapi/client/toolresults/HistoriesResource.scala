package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientToolresults.AnonFilterByName
import typingsSlinky.gapiClientToolresults.AnonRequestId
import typingsSlinky.gapiClientToolresults.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoriesResource extends js.Object {
  var executions: ExecutionsResource = js.native
  /**
    * Creates a History.
    *
    * The returned History will have the id set.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the
    * containing project does not exist
    */
  def create(request: AnonRequestId): Request_[History] = js.native
  /**
    * Gets a History.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does
    * not exist
    */
  def get(request: AnonUserIp): Request_[History] = js.native
  /**
    * Lists Histories for a given Project.
    *
    * The histories are sorted by modification time in descending order. The history_id key will be used to order the history with the same modification
    * time.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does
    * not exist
    */
  def list(request: AnonFilterByName): Request_[ListHistoriesResponse] = js.native
}

object HistoriesResource {
  @scala.inline
  def apply(
    create: AnonRequestId => Request_[History],
    executions: ExecutionsResource,
    get: AnonUserIp => Request_[History],
    list: AnonFilterByName => Request_[ListHistoriesResponse]
  ): HistoriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), executions = executions.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[HistoriesResource]
  }
  @scala.inline
  implicit class HistoriesResourceOps[Self <: HistoriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonRequestId => Request_[History]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExecutions(value: ExecutionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonUserIp => Request_[History]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilterByName => Request_[ListHistoriesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

