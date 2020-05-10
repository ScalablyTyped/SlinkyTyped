package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobConfiguration extends js.Object {
  /**
    * [Pick one] Copies a table.
    */
  var copy: js.UndefOr[SchemaJobConfigurationTableCopy] = js.native
  /**
    * [Optional] If set, don&#39;t actually run this job. A valid query will
    * return a mostly empty response with some processing statistics, while an
    * invalid query will return the same error it would if it wasn&#39;t a dry
    * run. Behavior of non-query jobs is undefined.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * [Pick one] Configures an extract job.
    */
  var extract: js.UndefOr[SchemaJobConfigurationExtract] = js.native
  /**
    * [Optional] Job timeout in milliseconds. If this time limit is exceeded,
    * BigQuery may attempt to terminate the job.
    */
  var jobTimeoutMs: js.UndefOr[String] = js.native
  /**
    * [Output-only] The type of the job. Can be QUERY, LOAD, EXTRACT, COPY or
    * UNKNOWN.
    */
  var jobType: js.UndefOr[String] = js.native
  /**
    * The labels associated with this job. You can use these to organize and
    * group your jobs. Label keys and values can be no longer than 63
    * characters, can only contain lowercase letters, numeric characters,
    * underscores and dashes. International characters are allowed. Label
    * values are optional. Label keys must start with a letter and each label
    * in the list must have a different key.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * [Pick one] Configures a load job.
    */
  var load: js.UndefOr[SchemaJobConfigurationLoad] = js.native
  /**
    * [Pick one] Configures a query job.
    */
  var query: js.UndefOr[SchemaJobConfigurationQuery] = js.native
}

object SchemaJobConfiguration {
  @scala.inline
  def apply(): SchemaJobConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobConfiguration]
  }
  @scala.inline
  implicit class SchemaJobConfigurationOps[Self <: SchemaJobConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: SchemaJobConfigurationTableCopy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withExtract(value: SchemaJobConfigurationExtract): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTimeoutMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTimeoutMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTimeoutMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTimeoutMs")(js.undefined)
        ret
    }
    @scala.inline
    def withJobType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobType")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: SchemaJobConfigurationLoad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: SchemaJobConfigurationQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}

