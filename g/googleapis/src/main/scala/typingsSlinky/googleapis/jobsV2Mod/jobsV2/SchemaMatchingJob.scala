package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Job entry with metadata inside SearchJobsResponse.
  */
@js.native
trait SchemaMatchingJob extends js.Object {
  /**
    * Commute information which is generated based on specified
    * CommutePreference.
    */
  var commuteInfo: js.UndefOr[SchemaCommuteInfo] = js.native
  /**
    * Job resource that matches the specified SearchJobsRequest.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  /**
    * A summary of the job with core information that&#39;s displayed on the
    * search results listing page.
    */
  var jobSummary: js.UndefOr[String] = js.native
  /**
    * Contains snippets of text from the Job.job_title field most closely
    * matching a search query&#39;s keywords, if available. The matching query
    * keywords are enclosed in HTML bold tags.
    */
  var jobTitleSnippet: js.UndefOr[String] = js.native
  /**
    * Contains snippets of text from the Job.description and similar fields
    * that most closely match a search query&#39;s keywords, if available. All
    * HTML tags in the original fields are stripped when returned in this
    * field, and matching query keywords are enclosed in HTML bold tags.
    */
  var searchTextSnippet: js.UndefOr[String] = js.native
}

object SchemaMatchingJob {
  @scala.inline
  def apply(): SchemaMatchingJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchingJob]
  }
  @scala.inline
  implicit class SchemaMatchingJobOps[Self <: SchemaMatchingJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommuteInfo(value: SchemaCommuteInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commuteInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommuteInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commuteInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withJob(value: SchemaJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(js.undefined)
        ret
    }
    @scala.inline
    def withJobSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTitleSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitleSnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTitleSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitleSnippet")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTextSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTextSnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTextSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTextSnippet")(js.undefined)
        ret
    }
  }
  
}

