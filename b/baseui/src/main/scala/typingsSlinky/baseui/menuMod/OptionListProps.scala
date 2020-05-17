package typingsSlinky.baseui.menuMod

import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import typingsSlinky.baseui.anon.ListItem
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionListProps extends BaseMenuPropsT {
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, TagMod[Any]]] = js.native
  var item: js.Any = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.native
  var overrides: js.UndefOr[ListItem] = js.native
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.native
  var size: js.UndefOr[default_ | compact] = js.native
  def getItemLabel(item: js.Any): TagMod[Any] = js.native
}

object OptionListProps {
  @scala.inline
  def apply(getItemLabel: js.Any => TagMod[Any], item: js.Any): OptionListProps = {
    val __obj = js.Dynamic.literal(getItemLabel = js.Any.fromFunction1(getItemLabel), item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionListProps]
  }
  @scala.inline
  implicit class OptionListPropsOps[Self <: OptionListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetItemLabel(value: js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isFocused")(js.undefined)
        ret
    }
    @scala.inline
    def with$isHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isHighlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isHighlighted")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChildMenu(value: /* item */ js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetChildMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: /* event */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: ListItem): Self = {
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
    def withResetMenu(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResetMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: default_ | compact): Self = {
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
  }
  
}

