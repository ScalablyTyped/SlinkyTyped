package typingsSlinky.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWebkitappearance extends js.Object {
  var `-webkit-appearance`: String = js.native
}

object AnonWebkitappearance {
  @scala.inline
  def apply(`-webkit-appearance`: String): AnonWebkitappearance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-webkit-appearance")(`-webkit-appearance`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWebkitappearance]
  }
  @scala.inline
  implicit class AnonWebkitappearanceOps[Self <: AnonWebkitappearance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with-webkit-appearance`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-webkit-appearance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

