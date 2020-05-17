package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDoubleclickbidmanager.anon.Alt
import typingsSlinky.gapiClientDoubleclickbidmanager.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueriesResource extends js.Object {
  /** Creates a query. */
  def createquery(request: Alt): Request[Query] = js.native
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(request: Fields): Request[Unit] = js.native
  /** Retrieves a stored query. */
  def getquery(request: Fields): Request[Query] = js.native
  /** Retrieves stored queries. */
  def listqueries(request: Alt): Request[ListQueriesResponse] = js.native
  /** Runs a stored query to generate a report. */
  def runquery(request: Fields): Request[Unit] = js.native
}

object QueriesResource {
  @scala.inline
  def apply(
    createquery: Alt => Request[Query],
    deletequery: Fields => Request[Unit],
    getquery: Fields => Request[Query],
    listqueries: Alt => Request[ListQueriesResponse],
    runquery: Fields => Request[Unit]
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
    def withCreatequery(value: Alt => Request[Query]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createquery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeletequery(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletequery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetquery(value: Fields => Request[Query]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getquery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListqueries(value: Alt => Request[ListQueriesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listqueries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunquery(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runquery")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

