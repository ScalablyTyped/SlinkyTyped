package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a collection of cell annotations. */
@js.native
trait XSheetAnnotationsSupplier extends XInterface {
  /**
    * returns the collection of cell annotations.
    * @see com.sun.star.sheet.CellAnnotations
    */
  val Annotations: XSheetAnnotations = js.native
  /**
    * returns the collection of cell annotations.
    * @see com.sun.star.sheet.CellAnnotations
    */
  def getAnnotations(): XSheetAnnotations = js.native
}

object XSheetAnnotationsSupplier {
  @scala.inline
  def apply(
    Annotations: XSheetAnnotations,
    acquire: () => Unit,
    getAnnotations: () => XSheetAnnotations,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetAnnotationsSupplier = {
    val __obj = js.Dynamic.literal(Annotations = Annotations.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAnnotations = js.Any.fromFunction0(getAnnotations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetAnnotationsSupplier]
  }
  @scala.inline
  implicit class XSheetAnnotationsSupplierOps[Self <: XSheetAnnotationsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: XSheetAnnotations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAnnotations(value: () => XSheetAnnotations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnnotations")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

