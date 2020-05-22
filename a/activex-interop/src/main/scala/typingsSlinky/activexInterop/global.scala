package typingsSlinky.activexInterop

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.activexInterop.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Enumerator[T] protected ()
    extends typingsSlinky.activexInterop.Enumerator[T] {
    def this(collection: Item[T]) = this()
    /**
      * Returns true if the current item is the last one in the collection, or the collection is empty,
      * or the current item is undefined.
      */
    /* CompleteClass */
    override def atEnd(): Boolean = js.native
    /**
      * Returns the current item in the collection
      */
    /* CompleteClass */
    override def item(): T = js.native
    /**
      * Resets the current item in the collection to the first item. If there are no items in the collection,
      * the current item is set to undefined.
      */
    /* CompleteClass */
    override def moveFirst(): Unit = js.native
    /**
      * Moves the current item to the next item in the collection. If the enumerator is at the end of
      * the collection or the collection is empty, the current item is set to undefined.
      */
    /* CompleteClass */
    override def moveNext(): Unit = js.native
  }
  
  /**
    * Represents an Automation SAFEARRAY
    */
  @js.native
  class SafeArray[T] protected ()
    extends typingsSlinky.activexInterop.SafeArray[T] {
    /* CompleteClass */
    override var SafeArray_typekey: typingsSlinky.activexInterop.SafeArray[T] = js.native
  }
  
  @js.native
  class VBArray[T] protected ()
    extends typingsSlinky.activexInterop.VBArray[T] {
    def this(safeArray: typingsSlinky.activexInterop.SafeArray[T]) = this()
  }
  
  /** Automation date (VT_DATE) */
  @js.native
  class VarDate protected ()
    extends typingsSlinky.activexInterop.VarDate {
    /* CompleteClass */
    override var VarDate_typekey: typingsSlinky.activexInterop.VarDate = js.native
  }
  
  var ActiveXObject: typingsSlinky.activexInterop.ActiveXObject = js.native
  @js.native
  object Enumerator extends TopLevel[EnumeratorConstructor]
  
  @js.native
  object VBArray extends TopLevel[VBArrayConstructor]
  
}

