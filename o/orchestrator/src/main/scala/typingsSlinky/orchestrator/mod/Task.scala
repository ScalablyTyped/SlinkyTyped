package typingsSlinky.orchestrator.mod

import typingsSlinky.node.streamMod.Stream
import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends js.Object {
  
  var dep: js.Array[String] = js.native
  
  var done: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  def fn(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Promise[_] | Stream | js.Any = js.native
  @JSName("fn")
  var fn_Original: TaskFunc = js.native
  
  var hrDuration: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var name: String = js.native
  
  var running: js.UndefOr[Boolean] = js.native
}
