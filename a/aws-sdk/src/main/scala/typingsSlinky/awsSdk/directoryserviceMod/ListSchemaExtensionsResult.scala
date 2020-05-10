package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemaExtensionsResult extends js.Object {
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListSchemaExtensions to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * Information about the schema extensions applied to the directory.
    */
  var SchemaExtensionsInfo: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SchemaExtensionsInfo] = js.native
}

object ListSchemaExtensionsResult {
  @scala.inline
  def apply(): ListSchemaExtensionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemaExtensionsResult]
  }
  @scala.inline
  implicit class ListSchemaExtensionsResultOps[Self <: ListSchemaExtensionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withSchemaExtensionsInfo(value: SchemaExtensionsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaExtensionsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionsInfo")(js.undefined)
        ret
    }
  }
  
}

