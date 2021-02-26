package typingsSlinky.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariantLayoutData extends LayoutData {
  
  /**
    * Adds some multipleLayoutData to the aggregation <code>multipleLayoutData</code>.
    * @param oMultipleLayoutData the multipleLayoutData to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addMultipleLayoutData(oMultipleLayoutData: LayoutData): VariantLayoutData = js.native
  
  /**
    * Destroys all the multipleLayoutData in the aggregation <code>multipleLayoutData</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyMultipleLayoutData(): VariantLayoutData = js.native
  
  /**
    * Gets content of aggregation <code>multipleLayoutData</code>.Allows multiple LayoutData.
    */
  def getMultipleLayoutData(): js.Array[LayoutData] = js.native
  
  /**
    * Checks for the provided <code>sap.ui.core.LayoutData</code> in the aggregation
    * <code>multipleLayoutData</code>.and returns its index if found or -1 otherwise.
    * @param oMultipleLayoutData The multipleLayoutData whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfMultipleLayoutData(oMultipleLayoutData: LayoutData): Double = js.native
  
  /**
    * Inserts a multipleLayoutData into the aggregation <code>multipleLayoutData</code>.
    * @param oMultipleLayoutData the multipleLayoutData to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the multipleLayoutData should be inserted at; for      
    *       a negative value of <code>iIndex</code>, the multipleLayoutData is inserted at position 0; for
    * a value             greater than the current size of the aggregation, the multipleLayoutData is
    * inserted at             the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertMultipleLayoutData(oMultipleLayoutData: LayoutData, iIndex: Double): VariantLayoutData = js.native
  
  /**
    * Removes all the controls from the aggregation <code>multipleLayoutData</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllMultipleLayoutData(): js.Array[LayoutData] = js.native
  
  def removeMultipleLayoutData(vMultipleLayoutData: String): LayoutData = js.native
  /**
    * Removes a multipleLayoutData from the aggregation <code>multipleLayoutData</code>.
    * @param vMultipleLayoutData The multipleLayoutData to remove or its index or id
    * @returns The removed multipleLayoutData or <code>null</code>
    */
  def removeMultipleLayoutData(vMultipleLayoutData: Double): LayoutData = js.native
  def removeMultipleLayoutData(vMultipleLayoutData: LayoutData): LayoutData = js.native
}
