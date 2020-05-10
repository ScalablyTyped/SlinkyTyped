package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSources extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  var s3: AnalyticsApplicationReferenceDataSourcesS3 = js.native
  var schema: AnalyticsApplicationReferenceDataSourcesSchema = js.native
  var tableName: String = js.native
}

object AnalyticsApplicationReferenceDataSources {
  @scala.inline
  def apply(
    id: String,
    s3: AnalyticsApplicationReferenceDataSourcesS3,
    schema: AnalyticsApplicationReferenceDataSourcesSchema,
    tableName: String
  ): AnalyticsApplicationReferenceDataSources = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSources]
  }
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesOps[Self <: AnalyticsApplicationReferenceDataSources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3(value: AnalyticsApplicationReferenceDataSourcesS3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: AnalyticsApplicationReferenceDataSourcesSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

