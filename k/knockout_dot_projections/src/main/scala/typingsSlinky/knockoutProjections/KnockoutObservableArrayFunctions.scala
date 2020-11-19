package typingsSlinky.knockoutProjections

import typingsSlinky.knockoutProjections.anon.DisposeItem
import typingsSlinky.knockoutProjections.anon.MappingWithDisposeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  
  def filter(predicate: js.Function1[/* value */ T, Boolean]): KnockoutMappedObservableArray[T] = js.native
  
  def map[TResult](mappingOptions: js.Function1[/* value */ T, TResult]): KnockoutMappedObservableArray[TResult] = js.native
  def map[TResult](mappingOptions: DisposeItem[T, TResult]): KnockoutMappedObservableArray[TResult] = js.native
  def map[TResult](mappingOptions: MappingWithDisposeCallback[T, TResult]): KnockoutMappedObservableArray[TResult] = js.native
}
