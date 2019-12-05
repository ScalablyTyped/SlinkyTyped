package typingsSlinky.atPollyjsNodeDashServer.atPollyjsNodeDashServerMod

import typingsSlinky.atPollyjsNodeDashServer.atPollyjsNodeDashServerStrings.recordingsDir
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/node-server", "API")
@js.native
class API protected () extends js.Object {
  def this(options: Pick[Config, recordingsDir]) = this()
  def deleteRecording(recording: String): APIResponse = js.native
  def filenameFor(recording: String): String = js.native
  def getRecordings(recording: String): APIResponse = js.native
  def respond(status: Double): APIResponse = js.native
  def respond(status: Double, data: js.Any): APIResponse = js.native
  def saveRecording(recording: String, data: js.Any): APIResponse = js.native
}

