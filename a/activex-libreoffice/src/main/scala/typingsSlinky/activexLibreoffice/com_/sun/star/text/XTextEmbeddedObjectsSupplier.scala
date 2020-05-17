package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the collection of all embedded objects within this context (i.e. this document). */
@js.native
trait XTextEmbeddedObjectsSupplier extends XInterface {
  /** @returns the collection of embedded objects. */
  val EmbeddedObjects: XNameAccess = js.native
  /** @returns the collection of embedded objects. */
  def getEmbeddedObjects(): XNameAccess = js.native
}

object XTextEmbeddedObjectsSupplier {
  @scala.inline
  def apply(
    EmbeddedObjects: XNameAccess,
    acquire: () => Unit,
    getEmbeddedObjects: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextEmbeddedObjectsSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObjects = EmbeddedObjects.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEmbeddedObjects = js.Any.fromFunction0(getEmbeddedObjects), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextEmbeddedObjectsSupplier]
  }
  @scala.inline
  implicit class XTextEmbeddedObjectsSupplierOps[Self <: XTextEmbeddedObjectsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbeddedObjects(value: XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetEmbeddedObjects(value: () => XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmbeddedObjects")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

