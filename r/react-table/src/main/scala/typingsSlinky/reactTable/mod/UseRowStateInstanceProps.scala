package typingsSlinky.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseRowStateInstanceProps[D /* <: js.Object */] extends StObject {
  
  def setCellState(rowPath: js.Array[String], columnId: IdType[D], updater: UseRowUpdater[_]): Unit = js.native
  
  def setRowState(rowPath: js.Array[String], updater: UseRowUpdater[_]): Unit = js.native
}
object UseRowStateInstanceProps {
  
  @scala.inline
  def apply[D /* <: js.Object */](
    setCellState: (js.Array[String], IdType[D], UseRowUpdater[_]) => Unit,
    setRowState: (js.Array[String], UseRowUpdater[_]) => Unit
  ): UseRowStateInstanceProps[D] = {
    val __obj = js.Dynamic.literal(setCellState = js.Any.fromFunction3(setCellState), setRowState = js.Any.fromFunction2(setRowState))
    __obj.asInstanceOf[UseRowStateInstanceProps[D]]
  }
  
  @scala.inline
  implicit class UseRowStateInstancePropsMutableBuilder[Self <: UseRowStateInstanceProps[_], D /* <: js.Object */] (val x: Self with UseRowStateInstanceProps[D]) extends AnyVal {
    
    @scala.inline
    def setSetCellState(value: (js.Array[String], IdType[D], UseRowUpdater[_]) => Unit): Self = StObject.set(x, "setCellState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetRowState(value: (js.Array[String], UseRowUpdater[_]) => Unit): Self = StObject.set(x, "setRowState", js.Any.fromFunction2(value))
  }
}
