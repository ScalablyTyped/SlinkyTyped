package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLDragFill extends js.Object {
  /** This method is used to perform auto fill in Spreadsheet.
    * @param {Spreadsheet.AutoFillObject} Pass Object AutoFillObject.
    * @returns {void}
    */
  def autoFill(options: AutoFillObject): Unit = js.native
  /** This method is used to hide the auto fill element in the Spreadsheet.
    * @returns {void}
    */
  def hideAutoFillElement(): Unit = js.native
  /** This method is used to hide the auto fill options in the Spreadsheet.
    * @returns {void}
    */
  def hideAutoFillOptions(): Unit = js.native
  /** This method is used to set position of the auto fill element in the Spreadsheet.
    * @param {boolean} Pass the isDragFill option as {{'`boolean`' | markdownify}} value to show auto fill options in Spreadsheet.
    * @returns {void}
    */
  def positionAutoFillElement(isDragFill: Boolean): Unit = js.native
}

object XLDragFill {
  @scala.inline
  def apply(
    autoFill: AutoFillObject => Unit,
    hideAutoFillElement: () => Unit,
    hideAutoFillOptions: () => Unit,
    positionAutoFillElement: Boolean => Unit
  ): XLDragFill = {
    val __obj = js.Dynamic.literal(autoFill = js.Any.fromFunction1(autoFill), hideAutoFillElement = js.Any.fromFunction0(hideAutoFillElement), hideAutoFillOptions = js.Any.fromFunction0(hideAutoFillOptions), positionAutoFillElement = js.Any.fromFunction1(positionAutoFillElement))
    __obj.asInstanceOf[XLDragFill]
  }
  @scala.inline
  implicit class XLDragFillOps[Self <: XLDragFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFill(value: AutoFillObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHideAutoFillElement(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAutoFillElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideAutoFillOptions(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAutoFillOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPositionAutoFillElement(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionAutoFillElement")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

