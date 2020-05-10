package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProperty extends js.Object {
  val Property: String = js.native
}

object AnonProperty {
  @scala.inline
  def apply(Property: String): AnonProperty = {
    val __obj = js.Dynamic.literal(Property = Property.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProperty]
  }
  @scala.inline
  implicit class AnonPropertyOps[Self <: AnonProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Property")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

