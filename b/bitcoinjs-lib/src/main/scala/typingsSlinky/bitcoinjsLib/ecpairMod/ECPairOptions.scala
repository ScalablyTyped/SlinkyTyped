package typingsSlinky.bitcoinjsLib.ecpairMod

import typingsSlinky.bitcoinjsLib.networksMod.Network
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECPairOptions extends js.Object {
  var compressed: js.UndefOr[Boolean] = js.native
  var network: js.UndefOr[Network] = js.native
  var rng: js.UndefOr[js.Function1[/* arg0 */ Double, Buffer]] = js.native
}

object ECPairOptions {
  @scala.inline
  def apply(): ECPairOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECPairOptions]
  }
  @scala.inline
  implicit class ECPairOptionsOps[Self <: ECPairOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: Network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withRng(value: /* arg0 */ Double => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rng")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rng")(js.undefined)
        ret
    }
  }
  
}

