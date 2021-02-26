package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a cell annotation attached to a spreadsheet cell.
  * @see com.sun.star.sheet.SheetCell
  * @see com.sun.star.sheet.CellAnnotation
  */
@js.native
trait XSheetAnnotationAnchor extends XInterface {
  
  /** returns the annotation at this anchor. */
  val Annotation: XSheetAnnotation = js.native
  
  /** returns the annotation at this anchor. */
  def getAnnotation(): XSheetAnnotation = js.native
}
object XSheetAnnotationAnchor {
  
  @scala.inline
  def apply(
    Annotation: XSheetAnnotation,
    acquire: () => Unit,
    getAnnotation: () => XSheetAnnotation,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetAnnotationAnchor = {
    val __obj = js.Dynamic.literal(Annotation = Annotation.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAnnotation = js.Any.fromFunction0(getAnnotation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetAnnotationAnchor]
  }
  
  @scala.inline
  implicit class XSheetAnnotationAnchorMutableBuilder[Self <: XSheetAnnotationAnchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: XSheetAnnotation): Self = StObject.set(x, "Annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAnnotation(value: () => XSheetAnnotation): Self = StObject.set(x, "getAnnotation", js.Any.fromFunction0(value))
  }
}
