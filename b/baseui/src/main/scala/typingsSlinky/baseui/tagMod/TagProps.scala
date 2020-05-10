package typingsSlinky.baseui.tagMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.accent
import typingsSlinky.baseui.baseuiStrings.custom_
import typingsSlinky.baseui.baseuiStrings.light
import typingsSlinky.baseui.baseuiStrings.negative
import typingsSlinky.baseui.baseuiStrings.neutral
import typingsSlinky.baseui.baseuiStrings.outlined
import typingsSlinky.baseui.baseuiStrings.positive
import typingsSlinky.baseui.baseuiStrings.primary
import typingsSlinky.baseui.baseuiStrings.solid
import typingsSlinky.baseui.baseuiStrings.warning
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var closeable: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var isFocused: js.UndefOr[Boolean] = js.native
  var isHovered: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[custom_ | accent | primary | neutral | positive | warning | negative] = js.native
  var onActionClick: js.UndefOr[js.Function2[/* e */ Event_, /* children */ js.UndefOr[TagMod[Any]], _]] = js.native
  var onActionKeyDown: js.UndefOr[js.Function2[/* e */ Event_, /* children */ js.UndefOr[TagMod[Any]], _]] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ Event_, _]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* event */ Event_, _]] = js.native
  var overrides: js.UndefOr[TagOverrides] = js.native
  var title: js.UndefOr[String] = js.native
  var variant: js.UndefOr[solid | light | outlined] = js.native
}

object TagProps {
  @scala.inline
  def apply(): TagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagProps]
  }
  @scala.inline
  implicit class TagPropsOps[Self <: TagProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCloseable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeable")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
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
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHovered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHovered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHovered")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: custom_ | accent | primary | neutral | positive | warning | negative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActionClick(value: (/* e */ Event_, /* children */ js.UndefOr[TagMod[Any]]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnActionClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActionKeyDown(value: (/* e */ Event_, /* children */ js.UndefOr[TagMod[Any]]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionKeyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnActionKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* event */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* event */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: TagOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(value: solid | light | outlined): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

