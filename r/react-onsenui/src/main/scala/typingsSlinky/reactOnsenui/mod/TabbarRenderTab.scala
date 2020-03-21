package typingsSlinky.reactOnsenui.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbarRenderTab extends js.Object {
  var content: ReactElement
  var tab: ReactElement
}

object TabbarRenderTab {
  @scala.inline
  def apply(content: ReactElement, tab: ReactElement): TabbarRenderTab = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabbarRenderTab]
  }
}

