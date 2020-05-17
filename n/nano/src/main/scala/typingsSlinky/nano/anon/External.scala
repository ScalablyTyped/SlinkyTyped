package typingsSlinky.nano.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait External extends js.Object {
  var active: Double = js.native
  var external: Double = js.native
}

object External {
  @scala.inline
  def apply(active: Double, external: Double): External = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any])
    __obj.asInstanceOf[External]
  }
  @scala.inline
  implicit class ExternalOps[Self <: External] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

