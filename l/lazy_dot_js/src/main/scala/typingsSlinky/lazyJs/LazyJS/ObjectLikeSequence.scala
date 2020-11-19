package typingsSlinky.lazyJs.LazyJS

import typingsSlinky.lazyJs.anon.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectLikeSequence[T] extends Sequence[T] {
  
  def assign(other: js.Any): ObjectLikeSequence[T] = js.native
  
  // throws error
  //async(): X;
  def defaults(defaults: js.Any): ObjectLikeSequence[T] = js.native
  
  def functions(): Sequence[T] = js.native
  
  def get(property: String): js.Any = js.native
  
  def invert(): ObjectLikeSequence[T] = js.native
  
  def keys(): Sequence[String] = js.native
  
  def merge(others: js.Any): ObjectLikeSequence[T] = js.native
  def merge(others: js.Any, mergeFn: js.Function): ObjectLikeSequence[T] = js.native
  def merge(others: ObjectLikeSequence[T]): ObjectLikeSequence[T] = js.native
  def merge(others: ObjectLikeSequence[T], mergeFn: js.Function): ObjectLikeSequence[T] = js.native
  
  def omit(properties: js.Array[String]): ObjectLikeSequence[T] = js.native
  
  def pairs(): Sequence[T] = js.native
  
  def pick(properties: js.Array[String]): ObjectLikeSequence[T] = js.native
  
  def values(): Sequence[T] = js.native
  
  def watch(propertyNames: String): Sequence[Property] = js.native
  def watch(propertyNames: js.Array[String]): Sequence[Property] = js.native
}
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
@JSGlobal("LazyJS.ObjectLikeSequence")
@js.native
object ObjectLikeSequence extends js.Object
