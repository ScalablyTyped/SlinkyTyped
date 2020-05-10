package typingsSlinky.postmanCollection

import typingsSlinky.postmanCollection.mod.PropertyBaseDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInfo extends js.Object {
  var info: PropertyBaseDefinition = js.native
}

object AnonInfo {
  @scala.inline
  def apply(info: PropertyBaseDefinition): AnonInfo = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInfo]
  }
  @scala.inline
  implicit class AnonInfoOps[Self <: AnonInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: PropertyBaseDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

