package typingsSlinky.reactRelay.mod

import typingsSlinky.reactRelay.reactRelayStrings.`network-only`
import typingsSlinky.reactRelay.reactRelayStrings.`store-or-network`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefetchOptions extends js.Object {
  var fetchPolicy: js.UndefOr[`store-or-network` | `network-only`] = js.native
  var force: js.UndefOr[Boolean] = js.native
}

object RefetchOptions {
  @scala.inline
  def apply(): RefetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefetchOptions]
  }
  @scala.inline
  implicit class RefetchOptionsOps[Self <: RefetchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchPolicy(value: `store-or-network` | `network-only`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
  }
  
}

