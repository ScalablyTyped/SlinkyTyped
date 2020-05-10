package typingsSlinky.antDesignPro.loginMod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var defaultActiveKey: js.UndefOr[String] = js.native
  var onSubmit: js.UndefOr[js.Function2[/* error */ js.Any, /* values */ js.Any, Unit]] = js.native
  var onTabChange: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object LoginProps {
  @scala.inline
  def apply(): LoginProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginProps]
  }
  @scala.inline
  implicit class LoginPropsOps[Self <: LoginProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDefaultActiveKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActiveKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: (/* error */ js.Any, /* values */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabChange(value: /* key */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTabChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabChange")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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

