package typingsSlinky.mobx.observablearrayMod

import typingsSlinky.mobx.interceptUtilsMod.IInterceptor
import typingsSlinky.mobx.utilsMod.Lambda
import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservableArray[T] extends Array[T] {
  
  def clear(): js.Array[T] = js.native
  
  def intercept(handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]): Lambda = js.native
  
  def observe(listener: js.Function1[/* changeData */ IArrayChange[T] | IArraySplice[T], Unit]): Lambda = js.native
  def observe(
    listener: js.Function1[/* changeData */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  
  def remove(value: T): Boolean = js.native
  
  def replace(newItems: js.Array[T]): js.Array[T] = js.native
  
  def spliceWithArray(index: Double): js.Array[T] = js.native
  def spliceWithArray(index: Double, deleteCount: js.UndefOr[scala.Nothing], newItems: js.Array[T]): js.Array[T] = js.native
  def spliceWithArray(index: Double, deleteCount: Double): js.Array[T] = js.native
  def spliceWithArray(index: Double, deleteCount: Double, newItems: js.Array[T]): js.Array[T] = js.native
  
  def toJS(): js.Array[T] = js.native
  
  def toJSON(): js.Array[T] = js.native
}
