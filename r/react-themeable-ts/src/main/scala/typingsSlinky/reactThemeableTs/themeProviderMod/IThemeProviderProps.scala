package typingsSlinky.reactThemeableTs.themeProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemeProviderProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.native
  var reactThemeable: js.Any = js.native
}

object IThemeProviderProps {
  @scala.inline
  def apply(reactThemeable: js.Any): IThemeProviderProps = {
    val __obj = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeProviderProps]
  }
  @scala.inline
  implicit class IThemeProviderPropsOps[Self <: IThemeProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReactThemeable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactThemeable")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

