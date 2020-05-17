package typingsSlinky.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ros extends js.Object {
  var name: String = js.native
  var ros: typingsSlinky.roslib.mod.Ros = js.native
  var serviceType: String = js.native
}

object Ros {
  @scala.inline
  def apply(name: String, ros: typingsSlinky.roslib.mod.Ros, serviceType: String): Ros = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ros]
  }
  @scala.inline
  implicit class RosOps[Self <: Ros] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRos(value: typingsSlinky.roslib.mod.Ros): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

