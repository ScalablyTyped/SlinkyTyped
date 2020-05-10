package typingsSlinky.reactToolbox.menuMenuDividerMod

import typingsSlinky.reactToolbox.libMod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuDividerProps extends Props {
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[MenuDividerTheme] = js.native
}

object MenuDividerProps {
  @scala.inline
  def apply(): MenuDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuDividerProps]
  }
  @scala.inline
  implicit class MenuDividerPropsOps[Self <: MenuDividerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: MenuDividerTheme): Self = {
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

