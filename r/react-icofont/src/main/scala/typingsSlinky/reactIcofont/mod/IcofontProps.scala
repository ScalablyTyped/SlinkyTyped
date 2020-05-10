package typingsSlinky.reactIcofont.mod

import typingsSlinky.reactIcofont.reactIcofontStrings.`10`
import typingsSlinky.reactIcofont.reactIcofontStrings.`180`
import typingsSlinky.reactIcofont.reactIcofontStrings.`1`
import typingsSlinky.reactIcofont.reactIcofontStrings.`270`
import typingsSlinky.reactIcofont.reactIcofontStrings.`2`
import typingsSlinky.reactIcofont.reactIcofontStrings.`3`
import typingsSlinky.reactIcofont.reactIcofontStrings.`4`
import typingsSlinky.reactIcofont.reactIcofontStrings.`5`
import typingsSlinky.reactIcofont.reactIcofontStrings.`6`
import typingsSlinky.reactIcofont.reactIcofontStrings.`7`
import typingsSlinky.reactIcofont.reactIcofontStrings.`8`
import typingsSlinky.reactIcofont.reactIcofontStrings.`90`
import typingsSlinky.reactIcofont.reactIcofontStrings.`9`
import typingsSlinky.reactIcofont.reactIcofontStrings.h
import typingsSlinky.reactIcofont.reactIcofontStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IcofontProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var flip: js.UndefOr[h | v] = js.native
  var icon: String = js.native
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.native
  var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`] = js.native
  var spin: js.UndefOr[Boolean] = js.native
}

object IcofontProps {
  @scala.inline
  def apply(icon: String): IcofontProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IcofontProps]
  }
  @scala.inline
  implicit class IcofontPropsOps[Self <: IcofontProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withFlip(value: h | v): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: `90` | `180` | `270`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): Self = {
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
    def withSpin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(js.undefined)
        ret
    }
  }
  
}

