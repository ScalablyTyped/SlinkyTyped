package typingsSlinky.cycled.mod

import typingsSlinky.std.Array
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cycled[T] extends Array[T] {
  
  /**
  	Returns the current item.
  	*/
  def current(): T = js.native
  
  /**
  	Returns an iterable that will cycle through the array indefinitely.
  	*/
  def indefinitely(): IterableIterator[T] = js.native
  
  /**
  	Returns an iterable that will cycle through the array backward indefinitely.
  	*/
  def indefinitelyReversed(): IterableIterator[T] = js.native
  
  /**
  	Get or set the current index.
  	*/
  var index: Double = js.native
  
  /**
  	Returns the next item.
  	*/
  def next(): T = js.native
  
  /**
  	Returns the item that is located in the given amount of `steps` through the array. For example, calling `peek(2)` would get the item 2 items after the current one.
  	You go backward by specifying a negative number.
  	This method is similar to `.step()` but without changing the current item.
  	*/
  def peek(steps: Double): T = js.native
  
  /**
  	Returns the previous item.
  	*/
  def previous(): T = js.native
  
  /**
  	Returns the item by going the given amount of `steps` through the array. For example, calling `step(2)` is like calling `next()` twice.
  	You go backward by specifying a negative number.
  	*/
  def step(steps: Double): T = js.native
}
