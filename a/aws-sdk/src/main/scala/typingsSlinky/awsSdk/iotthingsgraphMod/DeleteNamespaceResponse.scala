package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNamespaceResponse extends js.Object {
  /**
    * The ARN of the namespace to be deleted.
    */
  var namespaceArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the namespace to be deleted.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
}

object DeleteNamespaceResponse {
  @scala.inline
  def apply(): DeleteNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNamespaceResponse]
  }
  @scala.inline
  implicit class DeleteNamespaceResponseOps[Self <: DeleteNamespaceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespaceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceArn")(js.undefined)
        ret
    }
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

