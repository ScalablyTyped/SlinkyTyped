package typingsSlinky.activexInterop

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows enumerating over a COM collection, which may not have indexed item access.
  */
@js.native
trait Enumerator[T] extends js.Object {
  /**
    * Returns true if the current item is the last one in the collection, or the collection is empty,
    * or the current item is undefined.
    */
  def atEnd(): Boolean = js.native
  /**
    * Returns the current item in the collection
    */
  def item(): T = js.native
  /**
    * Resets the current item in the collection to the first item. If there are no items in the collection,
    * the current item is set to undefined.
    */
  def moveFirst(): Unit = js.native
  /**
    * Moves the current item to the next item in the collection. If the enumerator is at the end of
    * the collection or the collection is empty, the current item is set to undefined.
    */
  def moveNext(): Unit = js.native
}

@JSGlobal("Enumerator")
@js.native
object Enumerator extends TopLevel[EnumeratorConstructor]

