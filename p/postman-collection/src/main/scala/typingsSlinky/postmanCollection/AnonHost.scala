package typingsSlinky.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: String
  var path: js.RegExp
  var protocols: js.Array[String]
}

object AnonHost {
  @scala.inline
  def apply(host: String, path: js.RegExp, protocols: js.Array[String]): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHost]
  }
}

