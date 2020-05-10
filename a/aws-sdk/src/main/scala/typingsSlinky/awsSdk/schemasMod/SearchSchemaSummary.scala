package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSchemaSummary extends js.Object {
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  /**
    * An array of schema version summaries.
    */
  var SchemaVersions: js.UndefOr[listOfSearchSchemaVersionSummary] = js.native
}

object SearchSchemaSummary {
  @scala.inline
  def apply(): SearchSchemaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSchemaSummary]
  }
  @scala.inline
  implicit class SearchSchemaSummaryOps[Self <: SearchSchemaSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistryName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistryName")(js.undefined)
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
    def withSchemaVersions(value: listOfSearchSchemaVersionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaVersions")(js.undefined)
        ret
    }
  }
  
}

