package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkNumber extends js.Object {
  var pk: Double = js.native
}

object PkNumber {
  @scala.inline
  def apply(pk: Double): PkNumber = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkNumber]
  }
  @scala.inline
  implicit class PkNumberOps[Self <: PkNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

