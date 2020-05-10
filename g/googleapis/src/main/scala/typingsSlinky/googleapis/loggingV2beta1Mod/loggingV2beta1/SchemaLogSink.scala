package typingsSlinky.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a sink used to export log entries to one of the following
  * destinations in any project: a Cloud Storage bucket, a BigQuery dataset, or
  * a Cloud Pub/Sub topic. A logs filter controls which log entries are
  * exported. The sink must be created within a project, organization, billing
  * account, or folder.
  */
@js.native
trait SchemaLogSink extends js.Object {
  /**
    * Output only. The creation timestamp of the sink.This field may not be
    * present for older sinks.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Required. The export destination:
    * &quot;storage.googleapis.com/[GCS_BUCKET]&quot;
    * &quot;bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]&quot;
    * &quot;pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]&quot;
    * The sink&#39;s writer_identity, set when the sink is created, must have
    * permission to write to the destination or else the log entries are not
    * exported. For more information, see Exporting Logs with Sinks.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Optional. An advanced logs filter. The only exported log entries are
    * those that are in the resource owning the sink and that match the filter.
    * For example: logName=&quot;projects/[PROJECT_ID]/logs/[LOG_ID]&quot; AND
    * severity&gt;=ERROR
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional. This field applies only to sinks owned by organizations and
    * folders. If the field is false, the default, only the logs owned by the
    * sink&#39;s parent resource are available for export. If the field is
    * true, then logs from all the projects, folders, and billing accounts
    * contained in the sink&#39;s parent resource are also available for
    * export. Whether a particular log entry from the children is exported
    * depends on the sink&#39;s filter expression. For example, if this field
    * is true, then the filter resource.type=gce_instance would export all
    * Compute Engine VM instance log entries from all projects in the
    * sink&#39;s parent. To only export entries from certain child projects,
    * filter on the project part of the log name:
    * logName:(&quot;projects/test-project1/&quot; OR
    * &quot;projects/test-project2/&quot;) AND resource.type=gce_instance
    */
  var includeChildren: js.UndefOr[Boolean] = js.native
  /**
    * Required. The client-assigned sink identifier, unique within the project.
    * Example: &quot;my-syslog-errors-to-pubsub&quot;. Sink identifiers are
    * limited to 100 characters and can include only the following characters:
    * upper and lower-case alphanumeric characters, underscores, hyphens, and
    * periods.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The log entry format to use for this sink&#39;s exported log
    * entries. The v2 format is used by default and cannot be changed.
    */
  var outputVersionFormat: js.UndefOr[String] = js.native
  /**
    * Output only. The last update timestamp of the sink.This field may not be
    * present for older sinks.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Output only. An IAM identity&amp;mdash;a service account or
    * group&amp;mdash;under which Logging writes the exported log entries to
    * the sink&#39;s destination. This field is set by sinks.create and
    * sinks.update based on the value of unique_writer_identity in those
    * methods.Until you grant this identity write-access to the destination,
    * log entry exports from this sink will fail. For more information, see
    * Granting Access for a Resource. Consult the destination service&#39;s
    * documentation to determine the appropriate IAM roles to assign to the
    * identity.
    */
  var writerIdentity: js.UndefOr[String] = js.native
}

object SchemaLogSink {
  @scala.inline
  def apply(): SchemaLogSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogSink]
  }
  @scala.inline
  implicit class SchemaLogSinkOps[Self <: SchemaLogSink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeChildren")(js.undefined)
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
    def withOutputVersionFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputVersionFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputVersionFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputVersionFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWriterIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writerIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriterIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writerIdentity")(js.undefined)
        ret
    }
  }
  
}

