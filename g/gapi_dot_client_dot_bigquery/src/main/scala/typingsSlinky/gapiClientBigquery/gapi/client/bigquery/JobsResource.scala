package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBigquery.AnonAllUsers
import typingsSlinky.gapiClientBigquery.AnonFields
import typingsSlinky.gapiClientBigquery.AnonJobId
import typingsSlinky.gapiClientBigquery.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  /**
    * Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed
    * successfully. Cancelled jobs may still incur costs.
    */
  def cancel(request: AnonJobId): Request_[JobCancelResponse] = js.native
  /**
    * Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran
    * the job, or have the Is Owner project role.
    */
  def get(request: AnonJobId): Request_[Job] = js.native
  /** Retrieves the results of a query job. */
  def getQueryResults(request: AnonKey): Request_[GetQueryResultsResponse] = js.native
  /** Starts a new asynchronous job. Requires the Can View project role. */
  def insert(request: AnonFields): Request_[Job] = js.native
  /**
    * Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in
    * reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
    */
  def list(request: AnonAllUsers): Request_[JobList] = js.native
  /** Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout. */
  def query(request: AnonFields): Request_[QueryResponse] = js.native
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: AnonJobId => Request_[JobCancelResponse],
    get: AnonJobId => Request_[Job],
    getQueryResults: AnonKey => Request_[GetQueryResultsResponse],
    insert: AnonFields => Request_[Job],
    list: AnonAllUsers => Request_[JobList],
    query: AnonFields => Request_[QueryResponse]
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
    def withCancel(value: AnonJobId => Request_[JobCancelResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonJobId => Request_[Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetQueryResults(value: AnonKey => Request_[GetQueryResultsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueryResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAllUsers => Request_[JobList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuery(value: AnonFields => Request_[QueryResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

