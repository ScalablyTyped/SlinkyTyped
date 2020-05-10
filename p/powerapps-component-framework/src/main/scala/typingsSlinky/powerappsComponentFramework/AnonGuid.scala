package typingsSlinky.powerappsComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGuid extends js.Object {
  var guid: String = js.native
}

object AnonGuid {
  @scala.inline
  def apply(guid: String): AnonGuid = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGuid]
  }
  @scala.inline
  implicit class AnonGuidOps[Self <: AnonGuid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

