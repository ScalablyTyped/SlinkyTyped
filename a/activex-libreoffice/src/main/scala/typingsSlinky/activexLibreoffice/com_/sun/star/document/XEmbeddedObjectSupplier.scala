package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that provides an embedded object. */
@js.native
trait XEmbeddedObjectSupplier extends XInterface {
  /** returns the object which is embedded into this object. */
  val EmbeddedObject: XComponent = js.native
  /** returns the object which is embedded into this object. */
  def getEmbeddedObject(): XComponent = js.native
}

object XEmbeddedObjectSupplier {
  @scala.inline
  def apply(
    EmbeddedObject: XComponent,
    acquire: () => Unit,
    getEmbeddedObject: () => XComponent,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEmbeddedObjectSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObject = EmbeddedObject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEmbeddedObjectSupplier]
  }
  @scala.inline
  implicit class XEmbeddedObjectSupplierOps[Self <: XEmbeddedObjectSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbeddedObject(value: XComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetEmbeddedObject(value: () => XComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmbeddedObject")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

