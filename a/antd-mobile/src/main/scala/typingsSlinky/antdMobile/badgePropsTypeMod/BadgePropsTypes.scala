package typingsSlinky.antdMobile.badgePropsTypeMod

import typingsSlinky.antdMobile.antdMobileStrings.large
import typingsSlinky.antdMobile.antdMobileStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgePropsTypes extends js.Object {
  var corner: js.UndefOr[Boolean] = js.native
  var dot: js.UndefOr[Boolean] = js.native
  var overflowCount: js.UndefOr[Double] = js.native
  var size: js.UndefOr[large | small] = js.native
  var text: js.UndefOr[js.Any] = js.native
}

object BadgePropsTypes {
  @scala.inline
  def apply(): BadgePropsTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgePropsTypes]
  }
  @scala.inline
  implicit class BadgePropsTypesOps[Self <: BadgePropsTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner")(js.undefined)
        ret
    }
    @scala.inline
    def withDot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: large | small): Self = {
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
    def withText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

