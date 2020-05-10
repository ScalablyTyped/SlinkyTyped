package typingsSlinky.antDesignReactNative.libStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseThemeContextProps extends js.Object {
  var theme: js.UndefOr[PartialTheme] = js.native
}

object UseThemeContextProps {
  @scala.inline
  def apply(): UseThemeContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseThemeContextProps]
  }
  @scala.inline
  implicit class UseThemeContextPropsOps[Self <: UseThemeContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: PartialTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

