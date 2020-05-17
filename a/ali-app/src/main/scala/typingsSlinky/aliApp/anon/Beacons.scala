package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.my.Beacon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Beacons extends js.Object {
  var beacons: js.Array[Beacon] = js.native
}

object Beacons {
  @scala.inline
  def apply(beacons: js.Array[Beacon]): Beacons = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beacons]
  }
  @scala.inline
  implicit class BeaconsOps[Self <: Beacons] (val x: Self) extends AnyVal {
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

