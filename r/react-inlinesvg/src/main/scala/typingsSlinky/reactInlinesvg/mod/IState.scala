package typingsSlinky.reactInlinesvg.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var content: String
  var element: TagMod[Any]
  var hasCache: Boolean
  var status: String
}

object IState {
  @scala.inline
  def apply(content: String, hasCache: Boolean, status: String, element: TagMod[Any] = null): IState = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], hasCache = hasCache.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

