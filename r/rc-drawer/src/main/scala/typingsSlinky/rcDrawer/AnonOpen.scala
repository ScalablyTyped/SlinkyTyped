package typingsSlinky.rcDrawer

import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOpen extends js.Object {
  var open: js.UndefOr[Boolean] = js.native
  var prevProps: IDrawerProps = js.native
}

object AnonOpen {
  @scala.inline
  def apply(prevProps: IDrawerProps): AnonOpen = {
    val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpen]
  }
  @scala.inline
  implicit class AnonOpenOps[Self <: AnonOpen] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
  }
  
}

