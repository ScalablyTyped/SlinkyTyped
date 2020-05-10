package typingsSlinky.antdMobileRn.flexPropsTypeMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`column-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`row-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`wrap-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.around
import typingsSlinky.antdMobileRn.antdMobileRnStrings.baseline
import typingsSlinky.antdMobileRn.antdMobileRnStrings.between
import typingsSlinky.antdMobileRn.antdMobileRnStrings.center
import typingsSlinky.antdMobileRn.antdMobileRnStrings.column
import typingsSlinky.antdMobileRn.antdMobileRnStrings.end
import typingsSlinky.antdMobileRn.antdMobileRnStrings.nowrap
import typingsSlinky.antdMobileRn.antdMobileRnStrings.row
import typingsSlinky.antdMobileRn.antdMobileRnStrings.start
import typingsSlinky.antdMobileRn.antdMobileRnStrings.stretch
import typingsSlinky.antdMobileRn.antdMobileRnStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var justify: js.UndefOr[start | end | center | between | around] = js.native
  var wrap: js.UndefOr[nowrap | typingsSlinky.antdMobileRn.antdMobileRnStrings.wrap | `wrap-reverse`] = js.native
}

object FlexPropsType {
  @scala.inline
  def apply(): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexPropsType]
  }
  @scala.inline
  implicit class FlexPropsTypeOps[Self <: FlexPropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: start | center | end | baseline | stretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: row | `row-reverse` | column | `column-reverse`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withJustify(value: start | end | center | between | around): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: nowrap | wrap | `wrap-reverse`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

