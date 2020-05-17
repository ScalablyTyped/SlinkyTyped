package typingsSlinky.rcDrawer.anon

import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrevPropsIDrawerProps extends js.Object {
  var prevProps: IDrawerProps = js.native
}

object PrevPropsIDrawerProps {
  @scala.inline
  def apply(prevProps: IDrawerProps): PrevPropsIDrawerProps = {
    val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevPropsIDrawerProps]
  }
  @scala.inline
  implicit class PrevPropsIDrawerPropsOps[Self <: PrevPropsIDrawerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrevProps(value: IDrawerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

