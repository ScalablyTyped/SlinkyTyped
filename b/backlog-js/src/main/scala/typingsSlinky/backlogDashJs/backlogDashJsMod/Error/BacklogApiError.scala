package typingsSlinky.backlogDashJs.backlogDashJsMod.Error

import org.scalajs.dom.experimental.Response
import typingsSlinky.backlogDashJs.Anon_Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Error.BacklogApiError")
@js.native
class BacklogApiError protected () extends BacklogError {
  def this(response: Response) = this()
  def this(response: Response, body: Anon_Errors) = this()
}

