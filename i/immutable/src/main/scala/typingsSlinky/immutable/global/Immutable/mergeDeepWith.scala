package typingsSlinky.immutable.global.Immutable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Immutable.mergeDeepWith")
@js.native
object mergeDeepWith extends js.Object {
  
  def apply[C](
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collection: C,
    collections: ((js.Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
  ): C = js.native
}
