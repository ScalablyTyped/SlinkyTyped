package typingsSlinky.redlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompatibleRedisClient extends js.Object {
  
  def eval(args: js.Array[EvalArg]): js.Any = js.native
  def eval(args: js.Array[EvalArg], callback: js.Function2[/* err */ js.Error | Null, /* res */ js.Any, Unit]): js.Any = js.native
}
