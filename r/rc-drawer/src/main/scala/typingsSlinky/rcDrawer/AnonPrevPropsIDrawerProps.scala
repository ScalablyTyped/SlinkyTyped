package typingsSlinky.rcDrawer

import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrevPropsIDrawerProps extends js.Object {
  var prevProps: IDrawerProps = js.native
}

object AnonPrevPropsIDrawerProps {
  @scala.inline
  def apply(prevProps: IDrawerProps): AnonPrevPropsIDrawerProps = {
    val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrevPropsIDrawerProps]
  }
  @scala.inline
  implicit class AnonPrevPropsIDrawerPropsOps[Self <: AnonPrevPropsIDrawerProps] (val x: Self) extends AnyVal {
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

