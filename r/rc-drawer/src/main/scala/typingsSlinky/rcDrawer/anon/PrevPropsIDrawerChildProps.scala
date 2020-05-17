package typingsSlinky.rcDrawer.anon

import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrevPropsIDrawerChildProps extends js.Object {
  var prevProps: IDrawerChildProps = js.native
}

object PrevPropsIDrawerChildProps {
  @scala.inline
  def apply(prevProps: IDrawerChildProps): PrevPropsIDrawerChildProps = {
    val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevPropsIDrawerChildProps]
  }
  @scala.inline
  implicit class PrevPropsIDrawerChildPropsOps[Self <: PrevPropsIDrawerChildProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrevProps(value: IDrawerChildProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

