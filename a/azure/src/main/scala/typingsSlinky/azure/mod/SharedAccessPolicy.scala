package typingsSlinky.azure.mod

import typingsSlinky.azure.anon.Expiry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAccessPolicy extends js.Object {
  var AccessPolicy: Expiry = js.native
  var Id: js.UndefOr[String] = js.native
}

object SharedAccessPolicy {
  @scala.inline
  def apply(AccessPolicy: Expiry): SharedAccessPolicy = {
    val __obj = js.Dynamic.literal(AccessPolicy = AccessPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAccessPolicy]
  }
  @scala.inline
  implicit class SharedAccessPolicyOps[Self <: SharedAccessPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPolicy(value: Expiry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
  }
  
}

