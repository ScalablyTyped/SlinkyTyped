package typingsSlinky.backlogJs.mod.Error

import org.scalajs.dom.experimental.Response
import typingsSlinky.backlogJs.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Error.BacklogAuthError")
@js.native
class BacklogAuthError protected () extends BacklogError {
  def this(response: Response) = this()
  def this(response: Response, body: AnonErrors) = this()
}

