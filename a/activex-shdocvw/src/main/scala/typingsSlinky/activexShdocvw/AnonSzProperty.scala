package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSzProperty extends js.Object {
  val szProperty: String = js.native
}

object AnonSzProperty {
  @scala.inline
  def apply(szProperty: String): AnonSzProperty = {
    val __obj = js.Dynamic.literal(szProperty = szProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSzProperty]
  }
  @scala.inline
  implicit class AnonSzPropertyOps[Self <: AnonSzProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSzProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("szProperty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

