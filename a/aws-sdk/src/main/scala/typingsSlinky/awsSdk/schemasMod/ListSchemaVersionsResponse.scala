package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemaVersionsResponse extends js.Object {
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * An array of schema version summaries.
    */
  var SchemaVersions: js.UndefOr[listOfSchemaVersionSummary] = js.native
}

object ListSchemaVersionsResponse {
  @scala.inline
  def apply(): ListSchemaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemaVersionsResponse]
  }
  @scala.inline
  implicit class ListSchemaVersionsResponseOps[Self <: ListSchemaVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaVersions(value: listOfSchemaVersionSummary): Self = {
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

