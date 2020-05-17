package typingsSlinky.bluebird

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Constructor[E] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, E]
  type IterateFunction[T, R] = js.Function3[
    /* item */ T, 
    /* index */ scala.Double, 
    /* arrayLength */ scala.Double, 
    typingsSlinky.bluebird.mod.Resolvable[R]
  ]
  type ResolvableProps[T] = js.Object with typingsSlinky.bluebird.bluebirdStrings.ResolvableProps with org.scalablytyped.runtime.TopLevel[T]
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
}
