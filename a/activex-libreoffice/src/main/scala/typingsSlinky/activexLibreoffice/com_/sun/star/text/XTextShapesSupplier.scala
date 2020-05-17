package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the collection of com::sun::star::drawing::TextShapes. */
@js.native
trait XTextShapesSupplier extends XInterface {
  /**
    * returns the collection of shapes.
    * @see com.sun.star.drawing.DrawPage
    */
  val Shapes: XIndexAccess = js.native
  /**
    * returns the collection of shapes.
    * @see com.sun.star.drawing.DrawPage
    */
  def getShapes(): XIndexAccess = js.native
}

object XTextShapesSupplier {
  @scala.inline
  def apply(
    Shapes: XIndexAccess,
    acquire: () => Unit,
    getShapes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextShapesSupplier = {
    val __obj = js.Dynamic.literal(Shapes = Shapes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getShapes = js.Any.fromFunction0(getShapes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextShapesSupplier]
  }
  @scala.inline
  implicit class XTextShapesSupplierOps[Self <: XTextShapesSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShapes(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetShapes(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShapes")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

