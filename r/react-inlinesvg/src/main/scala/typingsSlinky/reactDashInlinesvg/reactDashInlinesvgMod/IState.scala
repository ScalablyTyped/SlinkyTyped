package typingsSlinky.reactDashInlinesvg.reactDashInlinesvgMod

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
  def apply(content: String, element: TagMod[Any], hasCache: Boolean, status: String): IState = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hasCache = hasCache.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IState]
  }
}

