package typingsSlinky.phantom.phantomMod

import typingsSlinky.phantom.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestData extends js.Object {
  var headers: js.Array[Anon_Name]
  var id: Double
  var method: String
  var time: js.Date
  var url: String
}

object IRequestData {
  @scala.inline
  def apply(headers: js.Array[Anon_Name], id: Double, method: String, time: js.Date, url: String): IRequestData = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRequestData]
  }
}

