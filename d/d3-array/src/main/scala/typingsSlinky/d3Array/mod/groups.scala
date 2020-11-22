package typingsSlinky.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "groups")
@js.native
object groups extends js.Object {
  
  def apply[TObject, TKey](iterable: js.Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): js.Array[js.Tuple2[TKey, js.Array[TObject]]] = js.native
  def apply[TObject, TKey1, TKey2](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[TObject]]]]] = js.native
  def apply[TObject, TKey1, TKey2, TKey3](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, js.Array[TObject]]]]]]
  ] = js.native
}
