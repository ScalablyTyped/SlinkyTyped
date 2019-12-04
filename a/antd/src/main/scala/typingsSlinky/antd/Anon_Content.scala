package typingsSlinky.antd

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: TagMod[Any]
  var ellipsis: Boolean
  var text: String
}

object Anon_Content {
  @scala.inline
  def apply(content: TagMod[Any], ellipsis: Boolean, text: String): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], ellipsis = ellipsis.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Content]
  }
}

