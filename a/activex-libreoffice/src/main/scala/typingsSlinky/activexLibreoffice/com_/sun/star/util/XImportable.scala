package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to import files into the object. */
@js.native
trait XImportable extends XInterface {
  /** @returns a descriptor which contains the arguments for an import. */
  def createImportDescriptor(bEmpty: Boolean): SafeArray[PropertyValue] = js.native
  /** imports data from an external database. */
  def doImport(aDescriptor: SeqEquiv[PropertyValue]): Unit = js.native
}

object XImportable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createImportDescriptor: Boolean => SafeArray[PropertyValue],
    doImport: SeqEquiv[PropertyValue] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XImportable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createImportDescriptor = js.Any.fromFunction1(createImportDescriptor), doImport = js.Any.fromFunction1(doImport), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XImportable]
  }
  @scala.inline
  implicit class XImportableOps[Self <: XImportable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateImportDescriptor(value: Boolean => SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImportDescriptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDoImport(value: SeqEquiv[PropertyValue] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doImport")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

