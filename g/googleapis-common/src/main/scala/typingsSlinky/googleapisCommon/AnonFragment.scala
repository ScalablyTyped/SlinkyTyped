package typingsSlinky.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFragment extends js.Object {
  var fragment: String = js.native
}

object AnonFragment {
  @scala.inline
  def apply(fragment: String): AnonFragment = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFragment]
  }
  @scala.inline
  implicit class AnonFragmentOps[Self <: AnonFragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

