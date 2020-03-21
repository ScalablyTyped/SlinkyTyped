package typingsSlinky.backlogJs.mod.Error

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Error.UnexpectedError")
@js.native
class UnexpectedError protected () extends BacklogError {
  def this(response: Response) = this()
}

