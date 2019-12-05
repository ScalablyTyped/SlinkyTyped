package typingsSlinky.gapiDotClientDotDataflow.gapi.client.dataflow

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAlt
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFields
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsJobId
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKey
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocation
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtoken
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtokenPp
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  var debug: DebugResource = js.native
  var messages: MessagesResource = js.native
  var workItems: WorkItemsResource = js.native
  /** List the jobs of a project across all regions. */
  def aggregated(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListJobsResponse] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Job] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocation): Request[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobId): Request[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtoken): Request[Job] = js.native
  /** Request the job status. */
  def getMetrics(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKey): Request[JobMetrics] = js.native
  /** Request the job status. */
  def getMetrics(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtokenPp): Request[JobMetrics] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListJobsResponse] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilter): Request[ListJobsResponse] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: Anon_AccesstokenAlt): Request[Job] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocation): Request[Job] = js.native
}

