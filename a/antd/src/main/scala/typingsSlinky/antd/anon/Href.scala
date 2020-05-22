package typingsSlinky.antd.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends js.Object {
  var href: String
  var title: TagMod[Any]
}

object Href {
  @scala.inline
  def apply(href: String, title: TagMod[Any] = null): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}

