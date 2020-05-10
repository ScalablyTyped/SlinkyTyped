package typingsSlinky.blueprintjsTable.copyCellsMenuItemMod

import typingsSlinky.blueprintjsCore.menuItemMod.IMenuItemProps
import typingsSlinky.blueprintjsTable.menuContextMod.IMenuContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICopyCellsMenuItemProps extends IMenuItemProps {
  /**
    * The `IMenuContext` that launched the menu.
    */
  var context: IMenuContext = js.native
  /**
    * If you want to do something after the copy or if you want to notify the
    * user if a copy fails, you may provide this optional callback.
    *
    * Due to browser limitations, the copy can fail. This usually occurs if
    * the selection is too large, like 20,000+ cells. The copy will also fail
    * if the browser does not support the copy method (see
    * `Clipboard.isCopySupported`).
    */
  var onCopy: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.native
  /**
    * A callback that returns the data for a specific cell. This need not
    * match the value displayed in the `<Cell>` component. The value will be
    * invisibly added as `textContent` into the DOM before copying.
    */
  def getCellData(row: Double, col: Double): js.Any = js.native
}

object ICopyCellsMenuItemProps {
  @scala.inline
  def apply(context: IMenuContext, getCellData: (Double, Double) => js.Any): ICopyCellsMenuItemProps = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], getCellData = js.Any.fromFunction2(getCellData))
    __obj.asInstanceOf[ICopyCellsMenuItemProps]
  }
  @scala.inline
  implicit class ICopyCellsMenuItemPropsOps[Self <: ICopyCellsMenuItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: IMenuContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCellData(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnCopy(value: /* success */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
  }
  
}

