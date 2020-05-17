package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.Beacons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeaconUpdateOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_BeaconUpdateOptions: js.UndefOr[js.Function1[/* res */ Beacons, Unit]] = js.native
}

object BeaconUpdateOptions {
  @scala.inline
  def apply(): BeaconUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeaconUpdateOptions]
  }
  @scala.inline
  implicit class BeaconUpdateOptionsOps[Self <: BeaconUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ Beacons => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

