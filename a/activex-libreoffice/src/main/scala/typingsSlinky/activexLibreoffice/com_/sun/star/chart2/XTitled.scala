package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to be implemented by objects that support having a title of type {@link XTitle} . */
@js.native
trait XTitled extends XInterface {
  /** get the object holding the title's content and formatting */
  var TitleObject: XTitle = js.native
  /** get the object holding the title's content and formatting */
  def getTitleObject(): XTitle = js.native
  /** set a new title object replacing the former one */
  def setTitleObject(Title: XTitle): Unit = js.native
}

object XTitled {
  @scala.inline
  def apply(
    TitleObject: XTitle,
    acquire: () => Unit,
    getTitleObject: () => XTitle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitleObject: XTitle => Unit
  ): XTitled = {
    val __obj = js.Dynamic.literal(TitleObject = TitleObject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTitleObject = js.Any.fromFunction0(getTitleObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitleObject = js.Any.fromFunction1(setTitleObject))
    __obj.asInstanceOf[XTitled]
  }
  @scala.inline
  implicit class XTitledOps[Self <: XTitled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitleObject(value: XTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TitleObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTitleObject(value: () => XTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitleObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTitleObject(value: XTitle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitleObject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

