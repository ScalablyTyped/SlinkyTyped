package typingsSlinky.crossfilter.CrossFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimension[T, TDimension] extends js.Object {
  
  def bottom(k: Double): js.Array[T] = js.native
  
  def dispose(): Unit = js.native
  
  def filter(value: TDimension): Dimension[T, TDimension] = js.native
  def filter(value: js.Array[TDimension]): Dimension[T, TDimension] = js.native
  def filter(value: Selector[TDimension]): Dimension[T, TDimension] = js.native
  
  def filterAll(): Dimension[T, TDimension] = js.native
  
  def filterExact(value: TDimension): Dimension[T, TDimension] = js.native
  
  def filterFunction(value: Selector[TDimension]): Dimension[T, TDimension] = js.native
  
  def filterRange(value: js.Array[TDimension]): Dimension[T, TDimension] = js.native
  
  def group(): Group[T, TDimension, TDimension] = js.native
  def group[TGroup](groupValue: js.Function1[/* data */ TDimension, TGroup]): Group[T, TDimension, TGroup] = js.native
  
  def groupAll(): GroupAll[T, T] = js.native
  @JSName("groupAll")
  def groupAll_TValue[TValue](): GroupAll[T, TValue] = js.native
  
  def top(k: Double): js.Array[T] = js.native
}
