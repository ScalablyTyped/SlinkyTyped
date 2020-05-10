package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlgparam extends js.Object {
  var algoid: String = js.native
  var algparam: String = js.native
  var key: String = js.native
}

object AnonAlgparam {
  @scala.inline
  def apply(algoid: String, algparam: String, key: String): AnonAlgparam = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], algparam = algparam.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgparam]
  }
  @scala.inline
  implicit class AnonAlgparamOps[Self <: AnonAlgparam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgoid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgparam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algparam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

