package typingsSlinky.betterCurry.BetterCurryModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delegate[T] extends js.Object {
  
  def access(name: String): Delegate[T] = js.native
  def access(name: DelegateOptions): Delegate[T] = js.native
  
  def all(): Unit = js.native
  def all(skip: js.Array[String]): Unit = js.native
  
  def getter(name: String): Delegate[T] = js.native
  def getter(name: DelegateOptions): Delegate[T] = js.native
  
  var getters: js.Array[_] = js.native
  
  def method(name: String): Delegate[T] = js.native
  def method(name: DelegateOptions): Delegate[T] = js.native
  
  var methods: js.Array[_] = js.native
  
  var proto: T = js.native
  
  def revoke(name: String): Delegate[T] = js.native
  
  def setter(name: String): Delegate[T] = js.native
  def setter(name: DelegateOptions): Delegate[T] = js.native
  
  var setters: js.Array[_] = js.native
  
  var target: String = js.native
}
