package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.ScrollView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponent extends js.Object {
  var _component: ScrollView = js.native
}

object AnonComponent {
  @scala.inline
  def apply(_component: ScrollView): AnonComponent = {
    val __obj = js.Dynamic.literal(_component = _component.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent]
  }
  @scala.inline
  implicit class AnonComponentOps[Self <: AnonComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_component(value: ScrollView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_component")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

