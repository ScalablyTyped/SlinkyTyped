package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information on an approval URL.
  */
@js.native
trait SchemaApprovalUrlInfo extends js.Object {
  /**
    * A URL that displays a product&#39;s permissions and that can also be used
    * to approve the product with the Products.approve call.
    */
  var approvalUrl: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#approvalUrlInfo&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaApprovalUrlInfo {
  @scala.inline
  def apply(): SchemaApprovalUrlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApprovalUrlInfo]
  }
  @scala.inline
  implicit class SchemaApprovalUrlInfoOps[Self <: SchemaApprovalUrlInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

