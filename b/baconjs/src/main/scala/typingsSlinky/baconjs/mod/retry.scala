package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.retryMod.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "retry")
@js.native
object retry extends js.Object {
  
  def apply[V](options: RetryOptions[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
}
