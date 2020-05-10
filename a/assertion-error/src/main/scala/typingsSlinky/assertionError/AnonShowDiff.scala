package typingsSlinky.assertionError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShowDiff extends js.Object {
  var showDiff: Boolean = js.native
}

object AnonShowDiff {
  @scala.inline
  def apply(showDiff: Boolean): AnonShowDiff = {
    val __obj = js.Dynamic.literal(showDiff = showDiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShowDiff]
  }
  @scala.inline
  implicit class AnonShowDiffOps[Self <: AnonShowDiff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowDiff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDiff")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

