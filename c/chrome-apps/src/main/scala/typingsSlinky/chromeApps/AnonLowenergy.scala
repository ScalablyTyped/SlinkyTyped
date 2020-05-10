package typingsSlinky.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLowenergy extends js.Object {
  var low_energy: js.UndefOr[Boolean] = js.native
  var peripheral: js.UndefOr[Boolean] = js.native
  var socket: js.UndefOr[Boolean] = js.native
  var uuids: js.UndefOr[js.Array[String]] = js.native
}

object AnonLowenergy {
  @scala.inline
  def apply(): AnonLowenergy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLowenergy]
  }
  @scala.inline
  implicit class AnonLowenergyOps[Self <: AnonLowenergy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLow_energy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low_energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow_energy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low_energy")(js.undefined)
        ret
    }
    @scala.inline
    def withPeripheral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peripheral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeripheral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peripheral")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
    @scala.inline
    def withUuids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuids")(js.undefined)
        ret
    }
  }
  
}

