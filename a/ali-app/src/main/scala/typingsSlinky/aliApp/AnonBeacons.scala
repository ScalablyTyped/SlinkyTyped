package typingsSlinky.aliApp

import typingsSlinky.aliApp.my.Beacon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBeacons extends js.Object {
  var beacons: js.Array[Beacon] = js.native
}

object AnonBeacons {
  @scala.inline
  def apply(beacons: js.Array[Beacon]): AnonBeacons = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeacons]
  }
  @scala.inline
  implicit class AnonBeaconsOps[Self <: AnonBeacons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeacons(value: js.Array[Beacon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

