package typingsSlinky.roslib

import typingsSlinky.roslib.mod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRos extends js.Object {
  var name: String = js.native
  var ros: Ros = js.native
  var serviceType: String = js.native
}

object AnonRos {
  @scala.inline
  def apply(name: String, ros: Ros, serviceType: String): AnonRos = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRos]
  }
  @scala.inline
  implicit class AnonRosOps[Self <: AnonRos] (val x: Self) extends AnyVal {
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
    def withRos(value: Ros): Self = {
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

