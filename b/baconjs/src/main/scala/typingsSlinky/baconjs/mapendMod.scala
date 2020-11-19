package typingsSlinky.baconjs

import typingsSlinky.baconjs.eventMod.End
import typingsSlinky.baconjs.transformMod.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/mapend", JSImport.Namespace)
@js.native
object mapendMod extends js.Object {
  
  def default[V](f: V): Transformer[V, V] = js.native
  def default[V](f: js.Function1[/* end */ End, V]): Transformer[V, V] = js.native
}
