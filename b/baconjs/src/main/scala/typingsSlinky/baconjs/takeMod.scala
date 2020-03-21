package typingsSlinky.baconjs

import typingsSlinky.baconjs.describeMod.Desc
import typingsSlinky.baconjs.eventMod.Event
import typingsSlinky.baconjs.observableMod.default
import typingsSlinky.baconjs.replyMod.Reply
import typingsSlinky.baconjs.typesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/take", JSImport.Namespace)
@js.native
object takeMod extends js.Object {
  def take[V](count: Double, src: default[V]): default[V] = js.native
  def take[V](count: Double, src: default[V], desc: Desc): default[V] = js.native
  def takeT[V](count: Double): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

