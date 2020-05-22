package typingsSlinky.ethersprojectAbi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.Error
  var path: js.Array[String | Double]
}

object Error {
  @scala.inline
  def apply(error: js.Error, path: js.Array[String | Double]): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

