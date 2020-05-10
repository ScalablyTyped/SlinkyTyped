package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetachTypedLink extends js.Object {
  /**
    * Used to accept a typed link specifier as input.
    */
  var TypedLinkSpecifier: typingsSlinky.awsSdk.clouddirectoryMod.TypedLinkSpecifier = js.native
}

object BatchDetachTypedLink {
  @scala.inline
  def apply(TypedLinkSpecifier: TypedLinkSpecifier): BatchDetachTypedLink = {
    val __obj = js.Dynamic.literal(TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachTypedLink]
  }
  @scala.inline
  implicit class BatchDetachTypedLinkOps[Self <: BatchDetachTypedLink] (val x: Self) extends AnyVal {
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
  }
  
}

