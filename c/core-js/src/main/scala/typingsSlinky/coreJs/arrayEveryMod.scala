package typingsSlinky.coreJs

import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayEveryMod {
  
  /* was `typeof core.Array.every` */
  @JSImport("core-js/library/fn/array/every", JSImport.Namespace)
  @js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
  ): Boolean = js.native
  @JSImport("core-js/library/fn/array/every", JSImport.Namespace)
  @js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
}
