package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChangeSetRequest extends js.Object {
  /**
    * Required. The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typingsSlinky.awsSdk.marketplacecatalogMod.Catalog = js.native
  /**
    * Required. The unique identifier for the StartChangeSet request that you want to describe the details for.
    */
  var ChangeSetId: ResourceId = js.native
}

object DescribeChangeSetRequest {
  @scala.inline
  def apply(Catalog: Catalog, ChangeSetId: ResourceId): DescribeChangeSetRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], ChangeSetId = ChangeSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChangeSetRequest]
  }
  @scala.inline
  implicit class DescribeChangeSetRequestOps[Self <: DescribeChangeSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalog(value: Catalog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Catalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

