package typingsSlinky.reactColor.checkboardMod

import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboardProps extends ClassAttributes[Checkboard] {
  var grey: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var white: js.UndefOr[String] = js.native
}

object CheckboardProps {
  @scala.inline
  def apply(): CheckboardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboardProps]
  }
  @scala.inline
  implicit class CheckboardPropsOps[Self <: CheckboardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withWhite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(js.undefined)
        ret
    }
  }
  
}

