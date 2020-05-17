package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the collection of document indexes.
  *
  * In general this interface is supported by a {@link TextDocument} .
  */
@js.native
trait XDocumentIndexesSupplier extends XInterface {
  /** @returns the collection of "DocumentIndexes" currently contained in the object. */
  val DocumentIndexes: XIndexAccess = js.native
  /** @returns the collection of "DocumentIndexes" currently contained in the object. */
  def getDocumentIndexes(): XIndexAccess = js.native
}

object XDocumentIndexesSupplier {
  @scala.inline
  def apply(
    DocumentIndexes: XIndexAccess,
    acquire: () => Unit,
    getDocumentIndexes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentIndexesSupplier = {
    val __obj = js.Dynamic.literal(DocumentIndexes = DocumentIndexes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDocumentIndexes = js.Any.fromFunction0(getDocumentIndexes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentIndexesSupplier]
  }
  @scala.inline
  implicit class XDocumentIndexesSupplierOps[Self <: XDocumentIndexesSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentIndexes(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDocumentIndexes(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocumentIndexes")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

