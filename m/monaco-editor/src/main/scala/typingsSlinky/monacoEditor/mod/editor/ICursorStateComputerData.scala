package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICursorStateComputerData extends StObject {
  
  /**
    * Get the inverse edit operations of the added edit operations.
    */
  def getInverseEditOperations(): js.Array[IValidEditOperation] = js.native
  
  /**
    * Get a previously tracked selection.
    * @param id The unique identifier returned by `trackSelection`.
    * @return The selection.
    */
  def getTrackedSelection(id: String): Selection = js.native
}
object ICursorStateComputerData {
  
  @scala.inline
  def apply(
    getInverseEditOperations: () => js.Array[IValidEditOperation],
    getTrackedSelection: String => Selection
  ): ICursorStateComputerData = {
    val __obj = js.Dynamic.literal(getInverseEditOperations = js.Any.fromFunction0(getInverseEditOperations), getTrackedSelection = js.Any.fromFunction1(getTrackedSelection))
    __obj.asInstanceOf[ICursorStateComputerData]
  }
  
  @scala.inline
  implicit class ICursorStateComputerDataMutableBuilder[Self <: ICursorStateComputerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInverseEditOperations(value: () => js.Array[IValidEditOperation]): Self = StObject.set(x, "getInverseEditOperations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTrackedSelection(value: String => Selection): Self = StObject.set(x, "getTrackedSelection", js.Any.fromFunction1(value))
  }
}
