package typingsSlinky.jestCore

import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/lib/log_debug_messages", JSImport.Namespace)
@js.native
object logDebugMessagesMod extends js.Object {
  
  def default(globalConfig: GlobalConfig, configs: js.Array[ProjectConfig], outputStream: WriteStream): Unit = js.native
  def default(globalConfig: GlobalConfig, configs: ProjectConfig, outputStream: WriteStream): Unit = js.native
}
