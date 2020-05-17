package typingsSlinky.baseui.menuMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.baseui.anon.Body
import typingsSlinky.baseui.anon.ListItemProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionProfileProps extends BaseMenuPropsT {
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, TagMod[Any]]] = js.native
  var item: js.Any = js.native
  var overrides: js.UndefOr[ListItemProfile] = js.native
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.native
  def getProfileItemImg(item: js.Any): String | ReactComponentClass[_] = js.native
  def getProfileItemImgText(item: js.Any): String = js.native
  def getProfileItemLabels(item: js.Any): Body = js.native
}

object OptionProfileProps {
  @scala.inline
  def apply(
    getProfileItemImg: js.Any => String | ReactComponentClass[_],
    getProfileItemImgText: js.Any => String,
    getProfileItemLabels: js.Any => Body,
    item: js.Any
  ): OptionProfileProps = {
    val __obj = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProfileProps]
  }
  @scala.inline
  implicit class OptionProfilePropsOps[Self <: OptionProfileProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetProfileItemImg(value: js.Any => String | ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProfileItemImg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProfileItemImgText(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProfileItemImgText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProfileItemLabels(value: js.Any => Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProfileItemLabels")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
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
    def withOverrides(value: ListItemProfile): Self = {
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
  }
  
}

