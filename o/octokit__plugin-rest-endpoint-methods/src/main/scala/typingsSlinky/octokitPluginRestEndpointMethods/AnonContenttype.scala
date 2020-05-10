package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContenttype extends js.Object {
  var `content-type`: String = js.native
}

object AnonContenttype {
  @scala.inline
  def apply(`content-type`: String): AnonContenttype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContenttype]
  }
  @scala.inline
  implicit class AnonContenttypeOps[Self <: AnonContenttype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withContent-type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

