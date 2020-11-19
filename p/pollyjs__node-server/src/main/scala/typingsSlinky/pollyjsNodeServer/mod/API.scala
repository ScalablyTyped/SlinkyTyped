package typingsSlinky.pollyjsNodeServer.mod

import typingsSlinky.pollyjsNodeServer.anon.PickConfigrecordingsDir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pollyjs/node-server", "API")
@js.native
class API protected () extends js.Object {
  def this(options: PickConfigrecordingsDir) = this()
  
  def deleteRecording(recording: String): APIResponse = js.native
  
  def filenameFor(recording: String): String = js.native
  
  def getRecordings(recording: String): APIResponse = js.native
  
  def respond(status: Double): APIResponse = js.native
  def respond(status: Double, data: js.Any): APIResponse = js.native
  
  def saveRecording(recording: String, data: js.Any): APIResponse = js.native
}
