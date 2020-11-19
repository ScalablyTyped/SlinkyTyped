package typingsSlinky.electron.Electron

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextBridge extends EventEmitter {
  
  // Docs: http://electronjs.org/docs/api/context-bridge
  def exposeInMainWorld(apiKey: String, api: Record[String, _]): Unit = js.native
}
