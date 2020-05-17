package typingsSlinky.immutable.global.Immutable

import typingsSlinky.immutable.Immutable.Collection.Indexed
import typingsSlinky.immutable.Immutable.Collection.Keyed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Immutable.fromJS")
@js.native
object fromJS extends js.Object {
  def apply(jsValue: js.Any): js.Any = js.native
  def apply(
    jsValue: js.Any,
    reviver: js.Function3[
      /* key */ String | Double, 
      /* sequence */ (Keyed[String, _]) | Indexed[_], 
      /* path */ js.UndefOr[js.Array[String | Double]], 
      _
    ]
  ): js.Any = js.native
}

