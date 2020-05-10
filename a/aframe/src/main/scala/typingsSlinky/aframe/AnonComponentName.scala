package typingsSlinky.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentName extends js.Object {
  var componentName: String = js.native
}

object AnonComponentName {
  @scala.inline
  def apply(componentName: String): AnonComponentName = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentName]
  }
  @scala.inline
  implicit class AnonComponentNameOps[Self <: AnonComponentName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

