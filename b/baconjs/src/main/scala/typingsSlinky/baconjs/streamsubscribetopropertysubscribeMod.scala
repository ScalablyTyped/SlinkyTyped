package typingsSlinky.baconjs

import typingsSlinky.baconjs.optionalMod.Option
import typingsSlinky.baconjs.typesMod.EventSink
import typingsSlinky.baconjs.typesMod.Subscribe
import typingsSlinky.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/internal/streamsubscribetopropertysubscribe", JSImport.Namespace)
@js.native
object streamsubscribetopropertysubscribeMod extends js.Object {
  
  def default[V](initValue: Option[V], streamSubscribe: Subscribe[V]): js.Function1[/* sink */ EventSink[V], Unsub] = js.native
}
