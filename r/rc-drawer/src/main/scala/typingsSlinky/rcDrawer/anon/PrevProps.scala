package typingsSlinky.rcDrawer.anon

import typingsSlinky.rcDrawer.drawerChildMod.DrawerChild
import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrevProps extends js.Object {
  var _self: DrawerChild = js.native
  var prevProps: IDrawerChildProps = js.native
}

object PrevProps {
  @scala.inline
  def apply(_self: DrawerChild, prevProps: IDrawerChildProps): PrevProps = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevProps]
  }
  @scala.inline
  implicit class PrevPropsOps[Self <: PrevProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_self(value: DrawerChild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevProps(value: IDrawerChildProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

