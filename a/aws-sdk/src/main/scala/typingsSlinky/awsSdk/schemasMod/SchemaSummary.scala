package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSummary extends js.Object {
  /**
    * The date and time that schema was modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  /**
    * Tags associated with the schema.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.schemasMod.Tags] = js.native
  /**
    * The number of versions available for the schema.
    */
  var VersionCount: js.UndefOr[long] = js.native
}

object SchemaSummary {
  @scala.inline
  def apply(): SchemaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSummary]
  }
  @scala.inline
  implicit class SchemaSummaryOps[Self <: SchemaSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionCount(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionCount")(js.undefined)
        ret
    }
  }
  
}

