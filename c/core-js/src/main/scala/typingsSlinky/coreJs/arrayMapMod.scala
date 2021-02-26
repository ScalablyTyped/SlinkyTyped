package typingsSlinky.coreJs

import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMapMod {
  
  /* was `typeof core.Array.map` */
  @JSImport("core-js/fn/array/map", JSImport.Namespace)
  @js.native
  def apply[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U]
  ): Array[U] = js.native
  @JSImport("core-js/fn/array/map", JSImport.Namespace)
  @js.native
  def apply[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U],
    thisArg: js.Any
  ): Array[U] = js.native
}
