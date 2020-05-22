package typingsSlinky.reactMdl.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRenderedComponent extends js.Object {
  var component: js.UndefOr[String | ReactElement | js.Function] = js.undefined
}

object CustomRenderedComponent {
  @scala.inline
  def apply(component: String | ReactElement | js.Function = null): CustomRenderedComponent = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRenderedComponent]
  }
}

