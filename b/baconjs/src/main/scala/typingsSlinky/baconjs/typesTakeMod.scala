package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesDescribeMod.Desc
import typingsSlinky.baconjs.typesEventMod.Event
import typingsSlinky.baconjs.typesObservableMod.default
import typingsSlinky.baconjs.typesReplyMod.Reply
import typingsSlinky.baconjs.typesTypesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/take", JSImport.Namespace)
@js.native
object typesTakeMod extends js.Object {
  def take[V](count: Double, src: default[V]): default[V] = js.native
  def take[V](count: Double, src: default[V], desc: Desc): default[V] = js.native
  def takeT[V](count: Double): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

