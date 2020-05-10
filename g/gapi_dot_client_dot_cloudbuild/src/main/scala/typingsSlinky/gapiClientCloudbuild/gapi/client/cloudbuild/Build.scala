package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Build extends js.Object {
  /**
    * The ID of the BuildTrigger that triggered this build, if it was
    * triggered automatically.
    * @OutputOnly
    */
  var buildTriggerId: js.UndefOr[String] = js.native
  /**
    * Time at which the request to create the build was received.
    * @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Time at which execution of the build was finished.
    *
    * The difference between finish_time and start_time is the duration of the
    * build's execution.
    * @OutputOnly
    */
  var finishTime: js.UndefOr[String] = js.native
  /**
    * Unique identifier of the build.
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A list of images to be pushed upon the successful completion of all build
    * steps.
    *
    * The images will be pushed using the builder service account's credentials.
    *
    * The digests of the pushed images will be stored in the Build resource's
    * results field.
    *
    * If any of the images fail to be pushed, the build is marked FAILURE.
    */
  var images: js.UndefOr[js.Array[String]] = js.native
  /**
    * URL to logs for this build in Google Cloud Logging.
    * @OutputOnly
    */
  var logUrl: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage bucket where logs should be written (see
    * [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    * Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
    */
  var logsBucket: js.UndefOr[String] = js.native
  /** Special options for this build. */
  var options: js.UndefOr[BuildOptions] = js.native
  /**
    * ID of the project.
    * @OutputOnly.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Results of the build.
    * @OutputOnly
    */
  var results: js.UndefOr[Results] = js.native
  /** Secrets to decrypt using Cloud KMS. */
  var secrets: js.UndefOr[js.Array[Secret]] = js.native
  /** Describes where to find the source files to build. */
  var source: js.UndefOr[Source] = js.native
  /**
    * A permanent fixed identifier for source.
    * @OutputOnly
    */
  var sourceProvenance: js.UndefOr[SourceProvenance] = js.native
  /**
    * Time at which execution of the build was started.
    * @OutputOnly
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Status of the build.
    * @OutputOnly
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Customer-readable message about the current status.
    * @OutputOnly
    */
  var statusDetail: js.UndefOr[String] = js.native
  /** Describes the operations to be performed on the workspace. */
  var steps: js.UndefOr[js.Array[BuildStep]] = js.native
  /** Substitutions data for Build resource. */
  var substitutions: js.UndefOr[Record[String, String]] = js.native
  /** Tags for annotation of a Build. These are not docker tags. */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Amount of time that this build should be allowed to run, to second
    * granularity. If this amount of time elapses, work on the build will cease
    * and the build status will be TIMEOUT.
    *
    * Default time is ten minutes.
    */
  var timeout: js.UndefOr[String] = js.native
}

object Build {
  @scala.inline
  def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildTriggerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildTriggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildTriggerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildTriggerId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLogsBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogsBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: BuildOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: Results): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withSecrets(value: js.Array[Secret]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecrets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceProvenance(value: SourceProvenance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceProvenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceProvenance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceProvenance")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[BuildStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutions(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitutions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

