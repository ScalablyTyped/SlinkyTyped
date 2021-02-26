package typingsSlinky.pEvery

import typingsSlinky.pMap.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-every", JSImport.Default)
  @js.native
  def default[ValueType](
    input: js.Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]]
  ): js.Promise[Boolean] = js.native
  @JSImport("p-every", JSImport.Default)
  @js.native
  def default[ValueType](
    input: js.Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]],
    options: Options
  ): js.Promise[Boolean] = js.native
}
