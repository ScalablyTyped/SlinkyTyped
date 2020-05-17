package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the endnotes within the context (e.g. document). */
@js.native
trait XEndnotesSupplier extends XInterface {
  /** @returns the endnote settings of the document. */
  val EndnoteSettings: XPropertySet = js.native
  /** @returns a collection of endnotes. */
  val Endnotes: XIndexAccess = js.native
  /** @returns the endnote settings of the document. */
  def getEndnoteSettings(): XPropertySet = js.native
  /** @returns a collection of endnotes. */
  def getEndnotes(): XIndexAccess = js.native
}

object XEndnotesSupplier {
  @scala.inline
  def apply(
    EndnoteSettings: XPropertySet,
    Endnotes: XIndexAccess,
    acquire: () => Unit,
    getEndnoteSettings: () => XPropertySet,
    getEndnotes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEndnotesSupplier = {
    val __obj = js.Dynamic.literal(EndnoteSettings = EndnoteSettings.asInstanceOf[js.Any], Endnotes = Endnotes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEndnoteSettings = js.Any.fromFunction0(getEndnoteSettings), getEndnotes = js.Any.fromFunction0(getEndnotes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEndnotesSupplier]
  }
  @scala.inline
  implicit class XEndnotesSupplierOps[Self <: XEndnotesSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndnoteSettings(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndnoteSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndnotes(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endnotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetEndnoteSettings(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndnoteSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEndnotes(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndnotes")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

