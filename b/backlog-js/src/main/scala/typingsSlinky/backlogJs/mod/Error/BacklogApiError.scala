package typingsSlinky.backlogJs.mod.Error

import org.scalajs.dom.experimental.Response
import typingsSlinky.backlogJs.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backlog-js", "Error.BacklogApiError")
@js.native
class BacklogApiError protected () extends BacklogError {
  def this(response: Response) = this()
  def this(response: Response, body: Errors) = this()
}
