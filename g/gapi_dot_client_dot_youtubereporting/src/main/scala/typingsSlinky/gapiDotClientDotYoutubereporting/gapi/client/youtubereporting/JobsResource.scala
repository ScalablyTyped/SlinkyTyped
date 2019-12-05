package typingsSlinky.gapiDotClientDotYoutubereporting.gapi.client.youtubereporting

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotYoutubereporting.Anon_AccesstokenAltBearertoken
import typingsSlinky.gapiDotClientDotYoutubereporting.Anon_AccesstokenAltBearertokenCallback
import typingsSlinky.gapiDotClientDotYoutubereporting.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  var reports: ReportsResource
  /** Creates a job and returns it. */
  def create(request: Anon_AccesstokenAltBearertoken): Request[Job]
  /** Deletes a job. */
  def delete(request: Anon_AccesstokenAltBearertokenCallback): Request[js.Object]
  /** Gets a job. */
  def get(request: Anon_AccesstokenAltBearertokenCallback): Request[Job]
  /** Lists jobs. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListJobsResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertoken => Request[Job],
    delete: Anon_AccesstokenAltBearertokenCallback => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallback => Request[Job],
    list: Anon_AccesstokenAltBearertokenCallbackFields => Request[ListJobsResponse],
    reports: ReportsResource
  ): JobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reports = reports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobsResource]
  }
}

