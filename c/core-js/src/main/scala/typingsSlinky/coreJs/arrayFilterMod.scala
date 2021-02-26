package typingsSlinky.coreJs

import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayFilterMod {
  
  /* was `typeof core.Array.filter` */
  @JSImport("core-js/library/fn/array/filter", JSImport.Namespace)
  @js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
  ): Array[T] = js.native
  @JSImport("core-js/library/fn/array/filter", JSImport.Namespace)
  @js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: js.Any
  ): Array[T] = js.native
}
