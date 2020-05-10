package typingsSlinky.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWithRoot extends js.Object {
  var withRoot: Boolean = js.native
}

object AnonWithRoot {
  @scala.inline
  def apply(withRoot: Boolean): AnonWithRoot = {
    val __obj = js.Dynamic.literal(withRoot = withRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWithRoot]
  }
  @scala.inline
  implicit class AnonWithRootOps[Self <: AnonWithRoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRoot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

