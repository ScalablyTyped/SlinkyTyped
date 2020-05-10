package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachTypedLinkResponse extends js.Object {
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifier: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.TypedLinkSpecifier] = js.native
}

object BatchAttachTypedLinkResponse {
  @scala.inline
  def apply(): BatchAttachTypedLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAttachTypedLinkResponse]
  }
  @scala.inline
  implicit class BatchAttachTypedLinkResponseOps[Self <: BatchAttachTypedLinkResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypedLinkSpecifier(value: TypedLinkSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedLinkSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypedLinkSpecifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedLinkSpecifier")(js.undefined)
        ret
    }
  }
  
}

