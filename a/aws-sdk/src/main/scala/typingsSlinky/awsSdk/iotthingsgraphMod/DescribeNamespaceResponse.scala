package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNamespaceResponse extends js.Object {
  /**
    * The ARN of the namespace.
    */
  var namespaceArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
  /**
    * The version of the user's namespace to describe.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The name of the public namespace that the latest namespace version is tracking.
    */
  var trackingNamespaceName: js.UndefOr[NamespaceName] = js.native
  /**
    * The version of the public namespace that the latest version is tracking.
    */
  var trackingNamespaceVersion: js.UndefOr[Version] = js.native
}

object DescribeNamespaceResponse {
  @scala.inline
  def apply(): DescribeNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNamespaceResponse]
  }
  @scala.inline
  implicit class DescribeNamespaceResponseOps[Self <: DescribeNamespaceResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withNamespaceVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingNamespaceName(value: NamespaceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingNamespaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingNamespaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingNamespaceName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingNamespaceVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingNamespaceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingNamespaceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingNamespaceVersion")(js.undefined)
        ret
    }
  }
  
}

