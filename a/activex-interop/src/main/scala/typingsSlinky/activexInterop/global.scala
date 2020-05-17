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
  }
  
  /**
    * Represents an Automation SAFEARRAY
    */
  @js.native
  class SafeArray[T] protected ()
    extends typingsSlinky.activexInterop.SafeArray[T]
  
  @js.native
  class VBArray[T] protected ()
    extends typingsSlinky.activexInterop.VBArray[T] {
    def this(safeArray: typingsSlinky.activexInterop.SafeArray[T]) = this()
  }
  
  /** Automation date (VT_DATE) */
  @js.native
  class VarDate protected ()
    extends typingsSlinky.activexInterop.VarDate
  
  var ActiveXObject: typingsSlinky.activexInterop.ActiveXObject = js.native
  @js.native
  object Enumerator extends TopLevel[EnumeratorConstructor]
  
  @js.native
  object VBArray extends TopLevel[VBArrayConstructor]
  
}

