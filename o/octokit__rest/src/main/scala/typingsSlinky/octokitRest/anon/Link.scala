package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit._Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends _Link {
  var link: String
}

object Link {
  @scala.inline
  def apply(link: String): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

