package typingsSlinky.antd.anon

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/typography/Typography.TypographyProps> */
@js.native
trait WeakValidationMapTypograp extends js.Object {
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var children: js.UndefOr[Validator[js.UndefOr[Null | TagMod[Any]]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
}

object WeakValidationMapTypograp {
  @scala.inline
  def apply(): WeakValidationMapTypograp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTypograp]
  }
  @scala.inline
  implicit class WeakValidationMapTypograpOps[Self <: WeakValidationMapTypograp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-label`(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: Validator[js.UndefOr[Null | TagMod[Any]]]): Self = {
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
    def withPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

