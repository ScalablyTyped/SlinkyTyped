package typingsSlinky.doublearray.doublearray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleArrayBuilder extends js.Object {
  
  def append(key: String, record: Double): DoubleArrayBuilder = js.native
  
  var bc: BaseAndCheck = js.native
  
  def build(): DoubleArray = js.native
  def build(keys: js.UndefOr[scala.Nothing], sorted: Boolean): DoubleArray = js.native
  def build(keys: js.Array[KeyValue]): DoubleArray = js.native
  def build(keys: js.Array[KeyValue], sorted: Boolean): DoubleArray = js.native
  
  def findAllocatableBase(children_info: js.typedarray.Int32Array): Double = js.native
  
  def getChildrenInfo(position: Double, start: Double, length: Double): js.typedarray.Int32Array = js.native
  
  def isUnusedNode(index: Double): Boolean = js.native
  
  var keys: js.Array[KeyValue] = js.native
  
  def setBC(parent_id: Double, children_info: js.typedarray.Int32Array, _base: Double): Unit = js.native
}
