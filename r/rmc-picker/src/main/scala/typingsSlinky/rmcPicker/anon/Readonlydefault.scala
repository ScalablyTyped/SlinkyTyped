package typingsSlinky.rmcPicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<rmc-picker.rmc-picker/lib/MultiPickerProps.default> */
@js.native
trait Readonlydefault extends js.Object {
  val children: js.UndefOr[js.Any] = js.native
  val className: js.UndefOr[String] = js.native
  val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.native
  val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.native
  val prefixCls: js.UndefOr[String] = js.native
  val rootNativeProps: js.UndefOr[js.Any] = js.native
  val selectedValue: js.UndefOr[js.Array[_]] = js.native
  val style: js.UndefOr[js.Any] = js.native
}

object Readonlydefault {
  @scala.inline
  def apply(): Readonlydefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Readonlydefault]
  }
  @scala.inline
  implicit class ReadonlydefaultOps[Self <: Readonlydefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Any): Self = {
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
    def withOnScrollChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnScrollChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
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
    def withRootNativeProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNativeProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootNativeProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNativeProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedValue(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
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

