package typingsSlinky.reactBootstrap.bootstrapUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BSProps extends js.Object {
  var bsClass: js.Any = js.native
  var bsRole: js.Any = js.native
  var bsSize: js.Any = js.native
  var bsStyle: js.Any = js.native
}

object BSProps {
  @scala.inline
  def apply(bsClass: js.Any, bsRole: js.Any, bsSize: js.Any, bsStyle: js.Any): BSProps = {
    val __obj = js.Dynamic.literal(bsClass = bsClass.asInstanceOf[js.Any], bsRole = bsRole.asInstanceOf[js.Any], bsSize = bsSize.asInstanceOf[js.Any], bsStyle = bsStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BSProps]
  }
  @scala.inline
  implicit class BSPropsOps[Self <: BSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBsClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBsRole(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBsSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBsStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

