package typingsSlinky.qiniu.mod.rs

import typingsSlinky.qiniu.mod.auth.digest.Mac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qiniu", "rs.PutPolicy")
@js.native
class PutPolicy () extends js.Object {
  def this(options: PutPolicyOptions) = this()
  
  def getFlags(): js.Any = js.native
  
  def uploadToken(): String = js.native
  def uploadToken(mac: Mac): String = js.native
}
