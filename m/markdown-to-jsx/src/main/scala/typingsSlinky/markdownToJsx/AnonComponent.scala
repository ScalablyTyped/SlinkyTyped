package typingsSlinky.markdownToJsx

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent[P, S] extends js.Object {
  var component: String | ReactComponentClass[P] | ReactComponentClass[P]
  var props: js.UndefOr[js.Any] = js.undefined
}

object AnonComponent {
  @scala.inline
  def apply[P, S](component: String | ReactComponentClass[P] | ReactComponentClass[P], props: js.Any = null): AnonComponent[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent[P, S]]
  }
}

