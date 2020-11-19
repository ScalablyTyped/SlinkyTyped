package typingsSlinky.pEvery

import typingsSlinky.pMap.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-every", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[ValueType](
    input: js.Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]]
  ): js.Promise[Boolean] = js.native
  def default[ValueType](
    input: js.Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]],
    options: Options
  ): js.Promise[Boolean] = js.native
}
