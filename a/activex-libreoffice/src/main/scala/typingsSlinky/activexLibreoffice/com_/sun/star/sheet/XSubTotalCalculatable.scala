package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains methods to handle a subtotal descriptor.
  *
  * The subtotal descriptor provides properties to set up the subtotal function.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
@js.native
trait XSubTotalCalculatable extends XInterface {
  
  /**
    * creates subtotals using the settings of the passed descriptor.
    * @param xDescriptor the subtotal descriptor with the settings used for the subtotal operation.
    * @param bReplace if set to `TRUE` , replaces previous subtotal results.
    */
  def applySubTotals(xDescriptor: XSubTotalDescriptor, bReplace: Boolean): Unit = js.native
  
  /**
    * creates a subtotal descriptor.
    * @param bEmpty if set to `TRUE` , creates an empty descriptor. If set to `FALSE` , fills the descriptor with previous settings of the current object (i.e
    */
  def createSubTotalDescriptor(bEmpty: Boolean): XSubTotalDescriptor = js.native
  
  /** removes the subtotals from the current object. */
  def removeSubTotals(): Unit = js.native
}
object XSubTotalCalculatable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    applySubTotals: (XSubTotalDescriptor, Boolean) => Unit,
    createSubTotalDescriptor: Boolean => XSubTotalDescriptor,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSubTotals: () => Unit
  ): XSubTotalCalculatable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), applySubTotals = js.Any.fromFunction2(applySubTotals), createSubTotalDescriptor = js.Any.fromFunction1(createSubTotalDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSubTotals = js.Any.fromFunction0(removeSubTotals))
    __obj.asInstanceOf[XSubTotalCalculatable]
  }
  
  @scala.inline
  implicit class XSubTotalCalculatableMutableBuilder[Self <: XSubTotalCalculatable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplySubTotals(value: (XSubTotalDescriptor, Boolean) => Unit): Self = StObject.set(x, "applySubTotals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateSubTotalDescriptor(value: Boolean => XSubTotalDescriptor): Self = StObject.set(x, "createSubTotalDescriptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSubTotals(value: () => Unit): Self = StObject.set(x, "removeSubTotals", js.Any.fromFunction0(value))
  }
}
