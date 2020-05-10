package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIndexResponse extends js.Object {
  /**
    * The index name.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The index status.
    */
  var indexStatus: js.UndefOr[IndexStatus] = js.native
  /**
    * Contains a value that specifies the type of indexing performed. Valid values are:   REGISTRY – Your thing index contains only registry data.   REGISTRY_AND_SHADOW - Your thing index contains registry data and shadow data.   REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index contains registry data and thing connectivity status data.   REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index contains registry data, shadow data, and thing connectivity status data.  
    */
  var schema: js.UndefOr[IndexSchema] = js.native
}

object DescribeIndexResponse {
  @scala.inline
  def apply(): DescribeIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIndexResponse]
  }
  @scala.inline
  implicit class DescribeIndexResponseOps[Self <: DescribeIndexResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: IndexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexStatus(value: IndexStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: IndexSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
  }
  
}

