package typingsSlinky.antd

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends js.Object {
  var href: String
  var title: TagMod[Any]
}

object AnonHref {
  @scala.inline
  def apply(href: String, title: TagMod[Any]): AnonHref = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHref]
  }
}

