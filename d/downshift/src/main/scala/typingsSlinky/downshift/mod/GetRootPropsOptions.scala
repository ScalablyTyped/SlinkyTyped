package typingsSlinky.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRootPropsOptions extends js.Object {
  var refKey: String = js.native
}

object GetRootPropsOptions {
  @scala.inline
  def apply(refKey: String): GetRootPropsOptions = {
    val __obj = js.Dynamic.literal(refKey = refKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRootPropsOptions]
  }
  @scala.inline
  implicit class GetRootPropsOptionsOps[Self <: GetRootPropsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

