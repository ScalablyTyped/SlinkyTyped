package typingsSlinky.reactNativeNavigation

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonElementId extends js.Object {
  var elementId: Validator[String] = js.native
  var resizeMode: Requireable[String] = js.native
}

object AnonElementId {
  @scala.inline
  def apply(elementId: Validator[String], resizeMode: Requireable[String]): AnonElementId = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementId]
  }
  @scala.inline
  implicit class AnonElementIdOps[Self <: AnonElementId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementId(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeMode(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

