package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellStyleProps extends js.Object {
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  var theme: ITheme = js.native
}

object CellStyleProps {
  @scala.inline
  def apply(theme: ITheme): CellStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellStyleProps]
  }
  @scala.inline
  implicit class CellStylePropsOps[Self <: CellStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellStyleProps(value: ICellStyleProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellStyleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(js.undefined)
        ret
    }
  }
  
}

