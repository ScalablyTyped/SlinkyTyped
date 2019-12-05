package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesDescribeMod.Desc
import typingsSlinky.baconjs.typesEventMod.Event
import typingsSlinky.baconjs.typesObservableMod.EventStream
import typingsSlinky.baconjs.typesObservableMod.Property
import typingsSlinky.baconjs.typesReplyMod.Reply
import typingsSlinky.baconjs.typesTransformMod.Transformer
import typingsSlinky.baconjs.typesTypesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/transform", JSImport.Namespace)
@js.native
object typesTransformMod extends js.Object {
  def composeT[V, V2, V3](t1: Transformer[V, V2], t2: Transformer[V2, V3]): Transformer[V, V3] = js.native
  def transformE[V, V2](src: EventStream[V], transformer: Transformer[V, V2]): EventStream[V2] = js.native
  def transformE[V, V2](src: EventStream[V], transformer: Transformer[V, V2], desc: Desc): EventStream[V2] = js.native
  def transformP[V, V2](src: Property[V], transformer: Transformer[V, V2]): Property[V2] = js.native
  def transformP[V, V2](src: Property[V], transformer: Transformer[V, V2], desc: Desc): Property[V2] = js.native
  type Transformer[V1, V2] = js.Function2[/* event */ Event[V1], /* sink */ EventSink[V2], Reply]
}

