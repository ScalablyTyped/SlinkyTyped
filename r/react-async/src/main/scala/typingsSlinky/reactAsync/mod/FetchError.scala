package typingsSlinky.reactAsync.mod

import org.scalajs.dom.experimental.Response
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", "FetchError")
@js.native
class FetchError protected () extends Error {
  def this(response: Response) = this()
  var response: Response = js.native
}

