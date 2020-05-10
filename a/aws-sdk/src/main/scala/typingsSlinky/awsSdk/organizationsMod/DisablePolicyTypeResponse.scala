package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisablePolicyTypeResponse extends js.Object {
  /**
    * A structure that shows the root with the updated list of enabled policy types.
    */
  var Root: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Root] = js.native
}

object DisablePolicyTypeResponse {
  @scala.inline
  def apply(): DisablePolicyTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisablePolicyTypeResponse]
  }
  @scala.inline
  implicit class DisablePolicyTypeResponseOps[Self <: DisablePolicyTypeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: Root): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(js.undefined)
        ret
    }
  }
  
}

