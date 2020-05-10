package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendDefaults extends js.Object {
  /**
    * A reference to an object that represents a client policy.
    */
  var clientPolicy: js.UndefOr[ClientPolicy] = js.native
}

object BackendDefaults {
  @scala.inline
  def apply(): BackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendDefaults]
  }
  @scala.inline
  implicit class BackendDefaultsOps[Self <: BackendDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientPolicy(value: ClientPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientPolicy")(js.undefined)
        ret
    }
  }
  
}

