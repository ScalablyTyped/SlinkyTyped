package typingsSlinky.backlogDashJs.backlogDashJsMod.Error

import org.scalajs.dom.experimental.Response
import typingsSlinky.backlogDashJs.Anon_Errors
import typingsSlinky.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Error.BacklogError")
@js.native
class BacklogError protected () extends ErrorConstructor {
  def this(name: BacklogErrorNameType, response: Response) = this()
  def this(name: BacklogErrorNameType, response: Response, body: Anon_Errors) = this()
  var _body: js.Any = js.native
  var _name: js.Any = js.native
  var _response: js.Any = js.native
  var _status: js.Any = js.native
  var _url: js.Any = js.native
  var body: Anon_Errors = js.native
  var name: BacklogErrorNameType = js.native
  var response: Response = js.native
  var status: Double = js.native
  var url: String = js.native
}

