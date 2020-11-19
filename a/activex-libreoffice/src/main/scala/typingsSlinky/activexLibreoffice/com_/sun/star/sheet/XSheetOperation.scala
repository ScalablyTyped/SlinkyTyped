package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to execute operations on a cell range or ranges.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SheetCellRanges
  */
@js.native
trait XSheetOperation extends XInterface {
  
  /**
    * clears the specified contents of the current cell range(s).
    * @param nContentFlags a combination of {@link CellFlags} flags selecting the contents to be deleted.
    */
  def clearContents(nContentFlags: Double): Unit = js.native
  
  /**
    * computes a general function based on all cells in the current cell range(s).
    * @param nFunction is the function used to compute the result.
    * @returns the result of the calculation.
    */
  def computeFunction(nFunction: GeneralFunction): Double = js.native
}
object XSheetOperation {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    clearContents: Double => Unit,
    computeFunction: GeneralFunction => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetOperation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), clearContents = js.Any.fromFunction1(clearContents), computeFunction = js.Any.fromFunction1(computeFunction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetOperation]
  }
  
  @scala.inline
  implicit class XSheetOperationOps[Self <: XSheetOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearContents(value: Double => Unit): Self = this.set("clearContents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComputeFunction(value: GeneralFunction => Double): Self = this.set("computeFunction", js.Any.fromFunction1(value))
  }
}
