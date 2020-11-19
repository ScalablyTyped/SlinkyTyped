package typingsSlinky.baconjs.observableMod

import typingsSlinky.baconjs.describeMod.Desc
import typingsSlinky.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/observable", "newEventStreamAllowSync")
@js.native
object newEventStreamAllowSync extends js.Object {
  
  def apply[V](description: Desc, subscribe: Subscribe[V]): EventStream[V] = js.native
}
