package typingsSlinky.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMetadataResult extends js.Object {
  var metadataObjects: js.Array[MetadataObject] = js.native
  var organizationNamespace: String = js.native
  var partialSaveAllowed: Boolean = js.native
  var testRequired: Boolean = js.native
}

object DescribeMetadataResult {
  @scala.inline
  def apply(
    metadataObjects: js.Array[MetadataObject],
    organizationNamespace: String,
    partialSaveAllowed: Boolean,
    testRequired: Boolean
  ): DescribeMetadataResult = {
    val __obj = js.Dynamic.literal(metadataObjects = metadataObjects.asInstanceOf[js.Any], organizationNamespace = organizationNamespace.asInstanceOf[js.Any], partialSaveAllowed = partialSaveAllowed.asInstanceOf[js.Any], testRequired = testRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMetadataResult]
  }
  @scala.inline
  implicit class DescribeMetadataResultOps[Self <: DescribeMetadataResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadataObjects(value: js.Array[MetadataObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizationNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartialSaveAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialSaveAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRequired")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

