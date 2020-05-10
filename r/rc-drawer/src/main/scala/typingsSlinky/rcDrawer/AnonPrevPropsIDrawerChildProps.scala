package typingsSlinky.rcDrawer

import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrevPropsIDrawerChildProps extends js.Object {
  var prevProps: IDrawerChildProps = js.native
}

object AnonPrevPropsIDrawerChildProps {
  @scala.inline
  def apply(prevProps: IDrawerChildProps): AnonPrevPropsIDrawerChildProps = {
    val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrevPropsIDrawerChildProps]
  }
  @scala.inline
  implicit class AnonPrevPropsIDrawerChildPropsOps[Self <: AnonPrevPropsIDrawerChildProps] (val x: Self) extends AnyVal {
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

