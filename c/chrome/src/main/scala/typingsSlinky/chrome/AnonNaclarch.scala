package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNaclarch extends js.Object {
  var nacl_arch: js.UndefOr[String] = js.native
  var sub_package_path: String = js.native
}

object AnonNaclarch {
  @scala.inline
  def apply(sub_package_path: String): AnonNaclarch = {
    val __obj = js.Dynamic.literal(sub_package_path = sub_package_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNaclarch]
  }
  @scala.inline
  implicit class AnonNaclarchOps[Self <: AnonNaclarch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSub_package_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub_package_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNacl_arch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nacl_arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNacl_arch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nacl_arch")(js.undefined)
        ret
    }
  }
  
}

