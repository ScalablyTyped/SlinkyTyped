package typingsSlinky.baconjs.anon

import typingsSlinky.baconjs.typesMod.Subscribe
import typingsSlinky.baconjs.updatebarrierMod.EventSink
import typingsSlinky.baconjs.updatebarrierMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallObsSubscribeSink extends js.Object {
  def apply[V](obs: Observable, subscribe: Subscribe[V], sink: EventSink[V]): js.Function0[Unit] = js.native
}

