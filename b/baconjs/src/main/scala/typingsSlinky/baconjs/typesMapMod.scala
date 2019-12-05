package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesEventMod.Event
import typingsSlinky.baconjs.typesObservableMod.Property
import typingsSlinky.baconjs.typesObservableMod.default
import typingsSlinky.baconjs.typesReplyMod.Reply
import typingsSlinky.baconjs.typesTypesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/map", JSImport.Namespace)
@js.native
object typesMapMod extends js.Object {
  def default[V, V2](src: typingsSlinky.baconjs.typesObservableMod.default[V], f: V2): typingsSlinky.baconjs.typesObservableMod.default[V2] = js.native
  def default[V, V2](src: typingsSlinky.baconjs.typesObservableMod.default[V], f: js.Function1[/* value */ V, V2]): typingsSlinky.baconjs.typesObservableMod.default[V2] = js.native
  def default[V, V2](src: typingsSlinky.baconjs.typesObservableMod.default[V], f: Property[V2]): typingsSlinky.baconjs.typesObservableMod.default[V2] = js.native
  def map[V, V2](src: default[V], f: V2): default[V2] = js.native
  def map[V, V2](src: default[V], f: js.Function1[/* value */ V, V2]): default[V2] = js.native
  def map[V, V2](src: default[V], f: Property[V2]): default[V2] = js.native
  def mapT[V, V2](f: V2): js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply] = js.native
  def mapT[V, V2](f: js.Function1[/* value */ V, V2]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply] = js.native
}

