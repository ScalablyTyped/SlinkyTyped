package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNamespaceResponse extends js.Object {
  /**
    * A complex type that contains information about the specified namespace.
    */
  var Namespace: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.Namespace] = js.native
}

object GetNamespaceResponse {
  @scala.inline
  def apply(): GetNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNamespaceResponse]
  }
  @scala.inline
  implicit class GetNamespaceResponseOps[Self <: GetNamespaceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespace(value: Namespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(js.undefined)
        ret
    }
  }
  
}

