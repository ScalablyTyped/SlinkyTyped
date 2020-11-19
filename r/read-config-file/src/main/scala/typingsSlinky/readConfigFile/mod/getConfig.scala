package typingsSlinky.readConfigFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("read-config-file", "getConfig")
@js.native
object getConfig extends js.Object {
  
  def apply[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = js.native
  def apply[T](request: ReadConfigRequest, configPath: String): js.Promise[ReadConfigResult[T] | Null] = js.native
}
