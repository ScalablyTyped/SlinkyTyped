package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDoubleclickbidmanager.AnonAlt
import typingsSlinky.gapiClientDoubleclickbidmanager.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueriesResource extends js.Object {
  /** Creates a query. */
  def createquery(request: AnonAlt): Request_[Query] = js.native
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(request: AnonFields): Request_[Unit] = js.native
  /** Retrieves a stored query. */
  def getquery(request: AnonFields): Request_[Query] = js.native
  /** Retrieves stored queries. */
  def listqueries(request: AnonAlt): Request_[ListQueriesResponse] = js.native
  /** Runs a stored query to generate a report. */
  def runquery(request: AnonFields): Request_[Unit] = js.native
}

object QueriesResource {
  @scala.inline
  def apply(
    createquery: AnonAlt => Request_[Query],
    deletequery: AnonFields => Request_[Unit],
    getquery: AnonFields => Request_[Query],
    listqueries: AnonAlt => Request_[ListQueriesResponse],
    runquery: AnonFields => Request_[Unit]
  ): QueriesResource = {
    val __obj = js.Dynamic.literal(createquery = js.Any.fromFunction1(createquery), deletequery = js.Any.fromFunction1(deletequery), getquery = js.Any.fromFunction1(getquery), listqueries = js.Any.fromFunction1(listqueries), runquery = js.Any.fromFunction1(runquery))
    __obj.asInstanceOf[QueriesResource]
  }
  @scala.inline
  implicit class QueriesResourceOps[Self <: QueriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatequery(value: AnonAlt => Request_[Query]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createquery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeletequery(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletequery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetquery(value: AnonFields => Request_[Query]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getquery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListqueries(value: AnonAlt => Request_[ListQueriesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listqueries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunquery(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runquery")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

