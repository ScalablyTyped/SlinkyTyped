package typingsSlinky.reactFauxDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetPropertyValue extends js.Object {
  def getPropertyValue(name: String): String = js.native
}

object AnonGetPropertyValue {
  @scala.inline
  def apply(getPropertyValue: String => String): AnonGetPropertyValue = {
    val __obj = js.Dynamic.literal(getPropertyValue = js.Any.fromFunction1(getPropertyValue))
    __obj.asInstanceOf[AnonGetPropertyValue]
  }
  @scala.inline
  implicit class AnonGetPropertyValueOps[Self <: AnonGetPropertyValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPropertyValue(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

