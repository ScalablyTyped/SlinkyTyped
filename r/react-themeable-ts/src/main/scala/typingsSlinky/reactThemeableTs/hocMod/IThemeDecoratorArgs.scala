package typingsSlinky.reactThemeableTs.hocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemeDecoratorArgs extends js.Object {
  var contextPath: js.UndefOr[String | js.Array[String]] = js.native
  var memoizeeOpts: js.UndefOr[js.Any] = js.native
  var themeKey: js.UndefOr[String] = js.native
  var themeProp: js.UndefOr[String] = js.native
}

object IThemeDecoratorArgs {
  @scala.inline
  def apply(): IThemeDecoratorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemeDecoratorArgs]
  }
  @scala.inline
  implicit class IThemeDecoratorArgsOps[Self <: IThemeDecoratorArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextPath(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextPath")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoizeeOpts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoizeeOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoizeeOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoizeeOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeProp")(js.undefined)
        ret
    }
  }
  
}

