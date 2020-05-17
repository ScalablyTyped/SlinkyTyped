package typingsSlinky.asymmetrikLeafletD3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internal {
  type DoubleObjectContextCallback = js.Function3[/* d */ js.Any, /* t */ js.Any, /* th */ js.Any, scala.Unit]
  type ObjectCallback = typingsSlinky.asymmetrikLeafletD3.mod.internal.ObjectFn[scala.Unit]
  type ObjectContextCallback = js.Function2[/* d */ js.Any, /* t */ js.Any, scala.Unit]
  type ObjectFn[T] = js.Function1[/* d */ js.Any, T]
  type ObjectIndexFn[T] = js.Function2[/* d */ js.Any, /* i */ scala.Double, T]
  type SimpleCallback = typingsSlinky.asymmetrikLeafletD3.mod.internal.SimpleFn[scala.Unit]
  type SimpleFn[T] = js.Function0[T]
}
