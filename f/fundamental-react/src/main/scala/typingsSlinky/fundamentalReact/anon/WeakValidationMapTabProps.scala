package typingsSlinky.fundamentalReact.anon

import typingsSlinky.fundamentalReact.iconMod.IconGlyph
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> */
@js.native
trait WeakValidationMapTabProps extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var glyph: js.UndefOr[Validator[js.UndefOr[IconGlyph | Null]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var index: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var linkProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.native
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var tabContentProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}

object WeakValidationMapTabProps {
  @scala.inline
  def apply(): WeakValidationMapTabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTabProps]
  }
  @scala.inline
  implicit class WeakValidationMapTabPropsOps[Self <: WeakValidationMapTabProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyph(value: Validator[js.UndefOr[IconGlyph | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkProps(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withTabContentProps(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabContentProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabContentProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabContentProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Validator[js.UndefOr[Null | String]]): Self = {
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
  }
  
}

