package typingsSlinky.fastMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CacheCreateFunc[K, V] = js.Function0[typingsSlinky.fastMemoize.AnonGet[K, V]]
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  type MemoizeFunc = js.Function2[
    /* fn */ typingsSlinky.fastMemoize.mod.Func, 
    /* options */ js.UndefOr[typingsSlinky.fastMemoize.mod.Options[typingsSlinky.fastMemoize.mod.Func]], 
    typingsSlinky.fastMemoize.mod.Func
  ]
  type Serializer = js.Function1[/* args */ js.Array[js.Any], java.lang.String]
}
