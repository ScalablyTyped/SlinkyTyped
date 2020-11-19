package typingsSlinky.mobservable.interfacesMod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservableArray[T]
  extends Array[T]
     with IObservable {
  
  def clear(): js.Array[T] = js.native
  
  def find(
    predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ IObservableArray[T], Boolean],
    thisArg: js.UndefOr[scala.Nothing],
    fromIndex: Double
  ): T = js.native
  def find(
    predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ IObservableArray[T], Boolean],
    thisArg: js.Any,
    fromIndex: Double
  ): T = js.native
  
  def peek(): js.Array[T] = js.native
  
  def remove(value: T): Boolean = js.native
  
  def replace(newItems: js.Array[T]): js.Array[T] = js.native
  
  def spliceWithArray(index: Double): js.Array[T] = js.native
  def spliceWithArray(index: Double, deleteCount: js.UndefOr[scala.Nothing], newItems: js.Array[T]): js.Array[T] = js.native
  def spliceWithArray(index: Double, deleteCount: Double): js.Array[T] = js.native
  def spliceWithArray(index: Double, deleteCount: Double, newItems: js.Array[T]): js.Array[T] = js.native
}
