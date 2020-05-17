package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the cell style name for a condition in a conditional format.
  * @see com.sun.star.sheet.TableConditionalEntry
  */
@js.native
trait XSheetConditionalEntry extends XInterface {
  /** returns the name of the cell style that is used when the condition is fulfilled. */
  var StyleName: String = js.native
  /** returns the name of the cell style that is used when the condition is fulfilled. */
  def getStyleName(): String = js.native
  /** sets the name of the cell style that is used when the condition is fulfilled. */
  def setStyleName(aStyleName: String): Unit = js.native
}

object XSheetConditionalEntry {
  @scala.inline
  def apply(
    StyleName: String,
    acquire: () => Unit,
    getStyleName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setStyleName: String => Unit
  ): XSheetConditionalEntry = {
    val __obj = js.Dynamic.literal(StyleName = StyleName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStyleName = js.Any.fromFunction0(getStyleName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStyleName = js.Any.fromFunction1(setStyleName))
    __obj.asInstanceOf[XSheetConditionalEntry]
  }
  @scala.inline
  implicit class XSheetConditionalEntryOps[Self <: XSheetConditionalEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStyleName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetStyleName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

