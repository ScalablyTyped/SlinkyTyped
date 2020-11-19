package typingsSlinky.pOne

import typingsSlinky.pMap.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-one", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[ValueType](
    input: js.Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Promise[Boolean]]
  ): js.Promise[Boolean] = js.native
  def default[ValueType](
    input: js.Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Promise[Boolean]],
    options: Options
  ): js.Promise[Boolean] = js.native
}
