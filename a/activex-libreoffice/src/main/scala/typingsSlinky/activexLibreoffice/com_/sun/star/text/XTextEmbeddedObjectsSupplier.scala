package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the collection of all embedded objects within this context (i.e. this document). */
trait XTextEmbeddedObjectsSupplier extends XInterface {
  /** @returns the collection of embedded objects. */
  val EmbeddedObjects: XNameAccess
  /** @returns the collection of embedded objects. */
  def getEmbeddedObjects(): XNameAccess
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
}

