package typingsSlinky.coinbase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Epoch extends js.Object {
  var epoch: Double = js.native
  var iso: String = js.native
}

object Epoch {
  @scala.inline
  def apply(epoch: Double, iso: String): Epoch = {
    val __obj = js.Dynamic.literal(epoch = epoch.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[Epoch]
  }
  @scala.inline
  implicit class EpochOps[Self <: Epoch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEpoch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epoch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

