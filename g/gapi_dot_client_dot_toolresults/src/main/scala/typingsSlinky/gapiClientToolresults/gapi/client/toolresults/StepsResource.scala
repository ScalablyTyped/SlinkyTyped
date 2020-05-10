package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientToolresults.AnonFields
import typingsSlinky.gapiClientToolresults.AnonPageSize
import typingsSlinky.gapiClientToolresults.AnonPrettyPrint
import typingsSlinky.gapiClientToolresults.AnonProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepsResource extends js.Object {
  var perfMetricsSummary: PerfMetricsSummaryResource = js.native
  var perfSampleSeries: PerfSampleSeriesResource = js.native
  var thumbnails: ThumbnailsResource = js.native
  /**
    * Creates a Step.
    *
    * The returned Step will have the id set.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * step is too large (more than 10Mib) - NOT_FOUND - if the containing Execution does not exist
    */
  def create(request: AnonPrettyPrint): Request_[Step] = js.native
  /**
    * Gets a Step.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Step does not
    * exist
    */
  def get(request: AnonFields): Request_[Step] = js.native
  /**
    * Retrieves a PerfMetricsSummary.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfMetricsSummary does not exist
    */
  def getPerfMetricsSummary(request: AnonFields): Request_[PerfMetricsSummary] = js.native
  /**
    * Lists Steps for a given Execution.
    *
    * The steps are sorted by creation_time in descending order. The step_id key will be used to order the steps with the same creation_time.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if an
    * argument in the request happens to be invalid; e.g. if an attempt is made to list the children of a nonexistent Step - NOT_FOUND - if the containing
    * Execution does not exist
    */
  def list(request: AnonPageSize): Request_[ListStepsResponse] = js.native
  /**
    * Updates an existing Step with the supplied partial entity.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal (e.g try to upload a duplicate xml file), if the updated step is too large (more than 10Mib) - NOT_FOUND - if the
    * containing Execution does not exist
    */
  def patch(request: AnonProjectId): Request_[Step] = js.native
  /**
    * Publish xml files to an existing Step.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal, e.g try to upload a duplicate xml file or a file too large. - NOT_FOUND - if the containing Execution does not
    * exist
    */
  def publishXunitXmlFiles(request: AnonFields): Request_[Step] = js.native
}

object StepsResource {
  @scala.inline
  def apply(
    create: AnonPrettyPrint => Request_[Step],
    get: AnonFields => Request_[Step],
    getPerfMetricsSummary: AnonFields => Request_[PerfMetricsSummary],
    list: AnonPageSize => Request_[ListStepsResponse],
    patch: AnonProjectId => Request_[Step],
    perfMetricsSummary: PerfMetricsSummaryResource,
    perfSampleSeries: PerfSampleSeriesResource,
    publishXunitXmlFiles: AnonFields => Request_[Step],
    thumbnails: ThumbnailsResource
  ): StepsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), getPerfMetricsSummary = js.Any.fromFunction1(getPerfMetricsSummary), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), perfMetricsSummary = perfMetricsSummary.asInstanceOf[js.Any], perfSampleSeries = perfSampleSeries.asInstanceOf[js.Any], publishXunitXmlFiles = js.Any.fromFunction1(publishXunitXmlFiles), thumbnails = thumbnails.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsResource]
  }
  @scala.inline
  implicit class StepsResourceOps[Self <: StepsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonPrettyPrint => Request_[Step]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Step]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPerfMetricsSummary(value: AnonFields => Request_[PerfMetricsSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPerfMetricsSummary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPageSize => Request_[ListStepsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonProjectId => Request_[Step]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPerfMetricsSummary(value: PerfMetricsSummaryResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfMetricsSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerfSampleSeries(value: PerfSampleSeriesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSampleSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishXunitXmlFiles(value: AnonFields => Request_[Step]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishXunitXmlFiles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThumbnails(value: ThumbnailsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

