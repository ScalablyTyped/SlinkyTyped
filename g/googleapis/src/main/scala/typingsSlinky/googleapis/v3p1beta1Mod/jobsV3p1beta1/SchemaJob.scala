package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Job resource represents a job posting (also referred to as a &quot;job
  * listing&quot; or &quot;job requisition&quot;). A job belongs to a Company,
  * which is the hiring entity responsible for the job.
  */
@js.native
trait SchemaJob extends js.Object {
  /**
    * Optional but strongly recommended for the best service experience.
    * Location(s) where the employer is looking to hire for this job posting.
    * Specifying the full street address(es) of the hiring location enables
    * better API results, especially job searches by commute time.  At most 50
    * locations are allowed for best search performance. If a job has more
    * locations, it is suggested to split it into multiple jobs with unique
    * requisition_ids (e.g. &#39;ReqA&#39; becomes &#39;ReqA-1&#39;,
    * &#39;ReqA-2&#39;, etc.) as multiple jobs with the same company_name,
    * language_code and requisition_id are not allowed. If the original
    * requisition_id must be preserved, a custom field should be used for
    * storage. It is also suggested to group the locations that close to each
    * other in the same job for better search experience.  The maximum number
    * of allowed characters is 500.
    */
  var addresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. At least one field within ApplicationInfo must be specified.
    * Job application information.
    */
  var applicationInfo: js.UndefOr[SchemaApplicationInfo] = js.native
  /**
    * Output only. Display name of the company listing the job.
    */
  var companyDisplayName: js.UndefOr[String] = js.native
  /**
    * Required.  The resource name of the company listing the job, such as
    * &quot;projects/api-test-project/companies/foo&quot;.
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Optional.  Job compensation information.
    */
  var compensationInfo: js.UndefOr[SchemaCompensationInfo] = js.native
  /**
    * Optional.  A map of fields to hold both filterable and non-filterable
    * custom job attributes that are not covered by the provided structured
    * fields.  The keys of the map are strings up to 64 bytes and must match
    * the pattern: a-zA-Z*. For example, key0LikeThis or KEY_1_LIKE_THIS.  At
    * most 100 filterable and at most 100 unfilterable keys are supported. For
    * filterable `string_values`, across all keys at most 200 values are
    * allowed, with each string no more than 255 characters. For unfilterable
    * `string_values`, the maximum total size of `string_values` across all
    * keys is 50KB.
    */
  var customAttributes: js.UndefOr[StringDictionary[SchemaCustomAttribute]] = js.native
  /**
    * Optional.  The desired education degrees for the job, such as Bachelors,
    * Masters.
    */
  var degreeTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  The department or functional area within the company with the
    * open position.  The maximum number of allowed characters is 255.
    */
  var department: js.UndefOr[String] = js.native
  /**
    * Output only. Derived details about the job posting.
    */
  var derivedInfo: js.UndefOr[SchemaJobDerivedInfo] = js.native
  /**
    * Required.  The description of the job, which typically includes a
    * multi-paragraph description of the company and related information.
    * Separate fields are provided on the job object for responsibilities,
    * qualifications, and other job characteristics. Use of these separate job
    * fields is recommended.  This field accepts and sanitizes HTML input, and
    * also accepts bold, italic, ordered list, and unordered list markup tags.
    * The maximum number of allowed characters is 100,000.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional.  The employment type(s) of a job, for example, full time or
    * part time.
    */
  var employmentTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  A description of bonus, commission, and other compensation
    * incentives associated with the job not including salary or pay.  The
    * maximum number of allowed characters is 10,000.
    */
  var incentives: js.UndefOr[String] = js.native
  /**
    * Optional.  The benefits included with the job.
    */
  var jobBenefits: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  The end timestamp of the job. Typically this field is used for
    * contracting engagements. Invalid timestamps are ignored.
    */
  var jobEndTime: js.UndefOr[String] = js.native
  /**
    * Optional.  The experience level associated with the job, such as
    * &quot;Entry Level&quot;.
    */
  var jobLevel: js.UndefOr[String] = js.native
  /**
    * Optional.  The start timestamp of the job in UTC time zone. Typically
    * this field is used for contracting engagements. Invalid timestamps are
    * ignored.
    */
  var jobStartTime: js.UndefOr[String] = js.native
  /**
    * Optional.  The language of the posting. This field is distinct from any
    * requirements for fluency that are associated with the job.  Language
    * codes must be in BCP-47 format, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see [Tags for Identifying
    * Languages](https://tools.ietf.org/html/bcp47){:
    * class=&quot;external&quot; target=&quot;_blank&quot; }.  If this field is
    * unspecified and Job.description is present, detected language code based
    * on Job.description is assigned, otherwise defaults to &#39;en_US&#39;.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Required during job update.  The resource name for the job. This is
    * generated by the service when a job is created.  The format is
    * &quot;projects/{project_id}/jobs/{job_id}&quot;, for example,
    * &quot;projects/api-test-project/jobs/1234&quot;.  Use of this field in
    * job queries and API calls is preferred over the use of requisition_id
    * since this value is unique.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The timestamp when this job posting was created.
    */
  var postingCreateTime: js.UndefOr[String] = js.native
  /**
    * Optional but strongly recommended for the best service experience.  The
    * expiration timestamp of the job. After this timestamp, the job is marked
    * as expired, and it no longer appears in search results. The expired job
    * can&#39;t be deleted or listed by the DeleteJob and ListJobs APIs, but it
    * can be retrieved with the GetJob API or updated with the UpdateJob API.
    * An expired job can be updated and opened again by using a future
    * expiration timestamp. Updating an expired job fails if there is another
    * existing open job with same company_name, language_code and
    * requisition_id.  The expired jobs are retained in our system for 90 days.
    * However, the overall expired job count cannot exceed 3 times the maximum
    * of open jobs count over the past week, otherwise jobs with earlier expire
    * time are cleaned first. Expired jobs are no longer accessible after they
    * are cleaned out.  Invalid timestamps are ignored, and treated as expire
    * time not provided.  Timestamp before the instant request is made is
    * considered valid, the job will be treated as expired immediately.  If
    * this value is not provided at the time of job creation or is invalid, the
    * job posting expires after 30 days from the job&#39;s creation time. For
    * example, if the job was created on 2017/01/01 13:00AM UTC with an
    * unspecified expiration date, the job expires after 2017/01/31 13:00AM
    * UTC.  If this value is not provided on job update, it depends on the
    * field masks set by UpdateJobRequest.update_mask. If the field masks
    * include expiry_time, or the masks are empty meaning that every field is
    * updated, the job posting expires after 30 days from the job&#39;s last
    * update time. Otherwise the expiration date isn&#39;t updated.
    */
  var postingExpireTime: js.UndefOr[String] = js.native
  /**
    * Optional.  The timestamp this job posting was most recently published.
    * The default value is the time the request arrives at the server. Invalid
    * timestamps are ignored.
    */
  var postingPublishTime: js.UndefOr[String] = js.native
  /**
    * Optional.  The job PostingRegion (for example, state, country) throughout
    * which the job is available. If this field is set, a LocationFilter in a
    * search query within the job region finds this job posting if an exact
    * location match isn&#39;t specified. If this field is set to
    * PostingRegion.NATION or PostingRegion.ADMINISTRATIVE_AREA, setting job
    * Job.addresses to the same location level as this field is strongly
    * recommended.
    */
  var postingRegion: js.UndefOr[String] = js.native
  /**
    * Output only. The timestamp when this job posting was last updated.
    */
  var postingUpdateTime: js.UndefOr[String] = js.native
  /**
    * Optional.  Options for job processing.
    */
  var processingOptions: js.UndefOr[SchemaProcessingOptions] = js.native
  /**
    * Optional.  A promotion value of the job, as determined by the client. The
    * value determines the sort order of the jobs returned when searching for
    * jobs using the featured jobs search call, with higher promotional values
    * being returned first and ties being resolved by relevance sort. Only the
    * jobs with a promotionValue &gt;0 are returned in a FEATURED_JOB_SEARCH.
    * Default value is 0, and negative values are treated as 0.
    */
  var promotionValue: js.UndefOr[Double] = js.native
  /**
    * Optional.  A description of the qualifications required to perform the
    * job. The use of this field is recommended as an alternative to using the
    * more general description field.  This field accepts and sanitizes HTML
    * input, and also accepts bold, italic, ordered list, and unordered list
    * markup tags.  The maximum number of allowed characters is 10,000.
    */
  var qualifications: js.UndefOr[String] = js.native
  /**
    * Required.  The requisition ID, also referred to as the posting ID,
    * assigned by the client to identify a job. This field is intended to be
    * used by clients for client identification and tracking of postings. A job
    * is not allowed to be created if there is another job with the same
    * [company_name], language_code and requisition_id.  The maximum number of
    * allowed characters is 255.
    */
  var requisitionId: js.UndefOr[String] = js.native
  /**
    * Optional.  A description of job responsibilities. The use of this field
    * is recommended as an alternative to using the more general description
    * field.  This field accepts and sanitizes HTML input, and also accepts
    * bold, italic, ordered list, and unordered list markup tags.  The maximum
    * number of allowed characters is 10,000.
    */
  var responsibilities: js.UndefOr[String] = js.native
  /**
    * Required.  The title of the job, such as &quot;Software Engineer&quot;
    * The maximum number of allowed characters is 500.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Optional.  The visibility of the job.  Defaults to
    * Visibility.ACCOUNT_ONLY if not specified.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaJob {
  @scala.inline
  def apply(): SchemaJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJob]
  }
  @scala.inline
  implicit class SchemaJobOps[Self <: SchemaJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationInfo(value: SchemaApplicationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(js.undefined)
        ret
    }
    @scala.inline
    def withCompensationInfo(value: SchemaCompensationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompensationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttributes(value: StringDictionary[SchemaCustomAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDegreeTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degreeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDegreeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degreeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDepartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(js.undefined)
        ret
    }
    @scala.inline
    def withDerivedInfo(value: SchemaJobDerivedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDerivedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivedInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEmploymentTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("employmentTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmploymentTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("employmentTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncentives(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incentives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncentives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incentives")(js.undefined)
        ret
    }
    @scala.inline
    def withJobBenefits(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobBenefits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobBenefits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobBenefits")(js.undefined)
        ret
    }
    @scala.inline
    def withJobEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withJobLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withJobStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPostingCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postingCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostingCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postingCreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPostingExpireTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postingExpireTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostingExpireTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postingExpireTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPostingPublishTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postingPublishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostingPublishTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postingPublishTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPostingRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postingRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostingRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postingRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withPostingUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postingUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostingUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postingUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingOptions(value: SchemaProcessingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotionValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifications(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifications")(js.undefined)
        ret
    }
    @scala.inline
    def withRequisitionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requisitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequisitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requisitionId")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsibilities(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsibilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsibilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsibilities")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

