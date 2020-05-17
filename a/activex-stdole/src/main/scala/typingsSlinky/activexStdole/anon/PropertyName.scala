package typingsSlinky.activexStdole.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyName extends js.Object {
  val PropertyName: String = js.native
}

object PropertyName {
  @scala.inline
  def apply(PropertyName: String): PropertyName = {
    val __obj = js.Dynamic.literal(PropertyName = PropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyName]
  }
  @scala.inline
  implicit class PropertyNameOps[Self <: PropertyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

