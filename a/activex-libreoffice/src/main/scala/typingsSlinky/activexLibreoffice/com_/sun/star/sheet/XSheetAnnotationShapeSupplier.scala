package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to get the shape of o annotation
  * @see com.sun.star.sheet.CellAnnotation
  * @see com.sun.star.sheet.CellAnnotationShape
  */
@js.native
trait XSheetAnnotationShapeSupplier extends XInterface {
  /** returns the shape of the annotation */
  val AnnotationShape: XShape = js.native
  /** returns the shape of the annotation */
  def getAnnotationShape(): XShape = js.native
}

object XSheetAnnotationShapeSupplier {
  @scala.inline
  def apply(
    AnnotationShape: XShape,
    acquire: () => Unit,
    getAnnotationShape: () => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetAnnotationShapeSupplier = {
    val __obj = js.Dynamic.literal(AnnotationShape = AnnotationShape.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAnnotationShape = js.Any.fromFunction0(getAnnotationShape), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetAnnotationShapeSupplier]
  }
  @scala.inline
  implicit class XSheetAnnotationShapeSupplierOps[Self <: XSheetAnnotationShapeSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationShape(value: XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnnotationShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAnnotationShape(value: () => XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnnotationShape")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

