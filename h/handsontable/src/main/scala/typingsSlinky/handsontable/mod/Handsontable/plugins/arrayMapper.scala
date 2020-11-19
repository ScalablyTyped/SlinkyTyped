package typingsSlinky.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait arrayMapper extends js.Object {
  
  def getIndexByValue(value: js.Any): Double = js.native
  
  def getValueByIndex(index: Double): js.Any = js.native
  
  def insertItems(index: Double): js.Array[_] = js.native
  def insertItems(index: Double, amount: Double): js.Array[_] = js.native
  
  def removeItems(index: Double): js.Array[_] = js.native
  def removeItems(index: Double, amount: Double): js.Array[_] = js.native
  
  def shiftItems(index: Double): Unit = js.native
  def shiftItems(index: Double, amount: Double): Unit = js.native
  
  def unshiftItems(index: Double): Unit = js.native
  def unshiftItems(index: Double, amount: Double): Unit = js.native
}
