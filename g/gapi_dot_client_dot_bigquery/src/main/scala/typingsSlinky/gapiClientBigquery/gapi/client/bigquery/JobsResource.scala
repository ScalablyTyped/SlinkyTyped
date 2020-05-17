package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBigquery.anon.AllUsers
import typingsSlinky.gapiClientBigquery.anon.Fields
import typingsSlinky.gapiClientBigquery.anon.JobId
import typingsSlinky.gapiClientBigquery.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  /**
    * Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed
    * successfully. Cancelled jobs may still incur costs.
    */
  def cancel(request: JobId): Request[JobCancelResponse] = js.native
  /**
    * Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran
    * the job, or have the Is Owner project role.
    */
  def get(request: JobId): Request[Job] = js.native
  /** Retrieves the results of a query job. */
  def getQueryResults(request: Key): Request[GetQueryResultsResponse] = js.native
  /** Starts a new asynchronous job. Requires the Can View project role. */
  def insert(request: Fields): Request[Job] = js.native
  /**
    * Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in
    * reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
    */
  def list(request: AllUsers): Request[JobList] = js.native
  /** Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout. */
  def query(request: Fields): Request[QueryResponse] = js.native
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: JobId => Request[JobCancelResponse],
    get: JobId => Request[Job],
    getQueryResults: Key => Request[GetQueryResultsResponse],
    insert: Fields => Request[Job],
    list: AllUsers => Request[JobList],
    query: Fields => Request[QueryResponse]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), getQueryResults = js.Any.fromFunction1(getQueryResults), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[JobsResource]
  }
  @scala.inline
  implicit class JobsResourceOps[Self <: JobsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: JobId => Request[JobCancelResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: JobId => Request[Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetQueryResults(value: Key => Request[GetQueryResultsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueryResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Fields => Request[Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AllUsers => Request[JobList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuery(value: Fields => Request[QueryResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

