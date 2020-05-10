package typingsSlinky.openfin.entityTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityTypeHelpers extends js.Object {
  var isExternal: Boolean = js.native
  var isFrame: Boolean = js.native
  var isView: Boolean = js.native
  var isWindow: Boolean = js.native
}

object EntityTypeHelpers {
  @scala.inline
  def apply(isExternal: Boolean, isFrame: Boolean, isView: Boolean, isWindow: Boolean): EntityTypeHelpers = {
    val __obj = js.Dynamic.literal(isExternal = isExternal.asInstanceOf[js.Any], isFrame = isFrame.asInstanceOf[js.Any], isView = isView.asInstanceOf[js.Any], isWindow = isWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityTypeHelpers]
  }
  @scala.inline
  implicit class EntityTypeHelpersOps[Self <: EntityTypeHelpers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

