package typingsSlinky.popmotion.observerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObserver extends _ObserverCandidate {
  
  def complete(): js.Any = js.native
  @JSName("complete")
  var complete_Original: Complete = js.native
  
  def error(): js.Any = js.native
  def error(err: js.Any): js.Any = js.native
  @JSName("error")
  var error_Original: Error = js.native
  
  var update: Update = js.native
}
