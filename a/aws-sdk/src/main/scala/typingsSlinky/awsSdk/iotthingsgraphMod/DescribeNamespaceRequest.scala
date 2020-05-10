package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNamespaceRequest extends js.Object {
  /**
    * The name of the user's namespace. Set this to aws to get the public namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
}

object DescribeNamespaceRequest {
  @scala.inline
  def apply(): DescribeNamespaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNamespaceRequest]
  }
  @scala.inline
  implicit class DescribeNamespaceRequestOps[Self <: DescribeNamespaceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespaceName(value: NamespaceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceName")(js.undefined)
        ret
    }
  }
  
}

