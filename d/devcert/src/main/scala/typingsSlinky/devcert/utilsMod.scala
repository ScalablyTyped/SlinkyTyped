package typingsSlinky.devcert

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.childProcessMod.ExecFileSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devcert/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def mktmp(): String = js.native
  
  def openssl(args: js.Array[String]): Buffer = js.native
  
  def reportableError(message: String): js.Error = js.native
  
  def run(cmd: String, args: js.Array[String]): Buffer = js.native
  def run(cmd: String, args: js.Array[String], options: ExecFileSyncOptions): Buffer = js.native
  
  def sudo(cmd: String): js.Promise[String | Null] = js.native
  
  def sudoAppend(file: String): Unit = js.native
  def sudoAppend(file: String, input: String): Unit = js.native
  def sudoAppend(file: String, input: ArrayBufferView): Unit = js.native
  
  def waitForUser(): js.Promise[js.Object] = js.native
}
