package typingsSlinky.minio.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minio", "NotificationPoller")
@js.native
class NotificationPoller () extends EventEmitter {
  
  // must to be public?
  def checkForChanges(): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
