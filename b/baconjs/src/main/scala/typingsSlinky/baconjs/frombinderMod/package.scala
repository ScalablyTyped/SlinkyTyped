package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object frombinderMod {
  type Binder[V] = js.Function1[
    /* sink */ typingsSlinky.baconjs.frombinderMod.FlexibleSink[V], 
    typingsSlinky.baconjs.typesMod.Unsub
  ]
  type EventTransformer[V] = js.Function1[/* repeated */ js.Any, typingsSlinky.baconjs.frombinderMod.EventLike[V]]
  type FlexibleSink[V] = js.Function1[
    /* event */ typingsSlinky.baconjs.frombinderMod.EventLike[V], 
    typingsSlinky.baconjs.replyMod.Reply
  ]
}
