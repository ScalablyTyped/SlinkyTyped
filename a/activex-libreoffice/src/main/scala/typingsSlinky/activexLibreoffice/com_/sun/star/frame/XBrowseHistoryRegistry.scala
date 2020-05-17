package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XBrowseHistoryRegistry extends XInterface {
  /** @deprecated Deprecated */
  def createNewEntry(URL: String, Arguments: SeqEquiv[PropertyValue], Title: String): Unit = js.native
  /** @deprecated Deprecated */
  def updateViewData(Value: js.Any): Unit = js.native
}

object XBrowseHistoryRegistry {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createNewEntry: (String, SeqEquiv[PropertyValue], String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateViewData: js.Any => Unit
  ): XBrowseHistoryRegistry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createNewEntry = js.Any.fromFunction3(createNewEntry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateViewData = js.Any.fromFunction1(updateViewData))
    __obj.asInstanceOf[XBrowseHistoryRegistry]
  }
  @scala.inline
  implicit class XBrowseHistoryRegistryOps[Self <: XBrowseHistoryRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateNewEntry(value: (String, SeqEquiv[PropertyValue], String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNewEntry")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdateViewData(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateViewData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

