package typingsSlinky.baconjs

import typingsSlinky.baconjs.frombinderMod.EventTransformer
import typingsSlinky.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/frompromise", JSImport.Namespace)
@js.native
object frompromiseMod extends js.Object {
  
  def default[V](promise: js.Promise[V]): EventStream[V] = js.native
  def default[V](promise: js.Promise[V], abort: js.UndefOr[scala.Nothing], eventTransformer: EventTransformer[V]): EventStream[V] = js.native
  def default[V](promise: js.Promise[V], abort: Boolean): EventStream[V] = js.native
  def default[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): EventStream[V] = js.native
}
