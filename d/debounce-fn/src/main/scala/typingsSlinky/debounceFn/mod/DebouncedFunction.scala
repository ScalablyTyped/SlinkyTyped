package typingsSlinky.debounceFn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebouncedFunction[ArgumentsType /* <: js.Array[_] */, ReturnType] extends js.Object {
  
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type ArgumentsType is not an array type */ arguments: ArgumentsType
  ): ReturnType = js.native
  
  def cancel(): Unit = js.native
}
