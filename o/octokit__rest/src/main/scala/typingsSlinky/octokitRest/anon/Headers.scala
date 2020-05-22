package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit._Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends _Link {
  var headers: Link
}

object Headers {
  @scala.inline
  def apply(headers: Link): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

