package typingsSlinky.activexInterop

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.activexInterop.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var ActiveXObject: typingsSlinky.activexInterop.ActiveXObject = js.native
  
  @js.native
  class Enumerator[T] protected ()
    extends typingsSlinky.activexInterop.Enumerator[T] {
    def this(collection: Item[T]) = this()
  }
  @js.native
  object Enumerator extends TopLevel[EnumeratorConstructor]
  
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
  @js.native
  object VBArray extends TopLevel[VBArrayConstructor]
  
  /** Automation date (VT_DATE) */
  @js.native
  class VarDate protected ()
    extends typingsSlinky.activexInterop.VarDate
}
