package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetSchemaSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the schema was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time (in Unix time) that the schema was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the schema.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.native
}

object DatasetSchemaSummary {
  @scala.inline
  def apply(): DatasetSchemaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSchemaSummary]
  }
  @scala.inline
  implicit class DatasetSchemaSummaryOps[Self <: DatasetSchemaSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
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
    def withSchemaArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaArn")(js.undefined)
        ret
    }
  }
  
}

