package typingsSlinky.baconjs.sourceMod

import typingsSlinky.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/internal/source", "fromObservable")
@js.native
object fromObservable extends js.Object {
  
  def apply[V](s: default[V]): Source[V, V] = js.native
  def apply[V](s: Source[V, V]): Source[V, V] = js.native
}
