package typingsSlinky.lambdaLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lambda-log", "error")
@js.native
object error extends js.Object {
  
  def apply(msg: String): LogMessage = js.native
  def apply(msg: String, meta: js.UndefOr[scala.Nothing], tags: js.Array[String]): LogMessage = js.native
  def apply(msg: String, meta: js.Object): LogMessage = js.native
  def apply(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  def apply(msg: js.Error): LogMessage = js.native
  def apply(msg: js.Error, meta: js.UndefOr[scala.Nothing], tags: js.Array[String]): LogMessage = js.native
  def apply(msg: js.Error, meta: js.Object): LogMessage = js.native
  def apply(msg: js.Error, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
}
