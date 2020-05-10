package typingsSlinky.knuddelsUserappsApi

import typingsSlinky.knuddelsUserappsApi.mod._Global_.KnuddelPot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnPotSealed extends js.Object {
  var onPotSealed: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Unit]] = js.native
  var payoutTimeoutMinutes: js.UndefOr[Double] = js.native
  var shouldSealPot: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Boolean]] = js.native
}

object AnonOnPotSealed {
  @scala.inline
  def apply(): AnonOnPotSealed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnPotSealed]
  }
  @scala.inline
  implicit class AnonOnPotSealedOps[Self <: AnonOnPotSealed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPotSealed(value: /* pot */ KnuddelPot => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPotSealed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPotSealed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPotSealed")(js.undefined)
        ret
    }
    @scala.inline
    def withPayoutTimeoutMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payoutTimeoutMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayoutTimeoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payoutTimeoutMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldSealPot(value: /* pot */ KnuddelPot => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSealPot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldSealPot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSealPot")(js.undefined)
        ret
    }
  }
  
}

