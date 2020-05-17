package typingsSlinky.devcert.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaCertPath extends js.Object {
  var caCertPath: String = js.native
  var caKeyPath: String = js.native
}

object CaCertPath {
  @scala.inline
  def apply(caCertPath: String, caKeyPath: String): CaCertPath = {
    val __obj = js.Dynamic.literal(caCertPath = caCertPath.asInstanceOf[js.Any], caKeyPath = caKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaCertPath]
  }
  @scala.inline
  implicit class CaCertPathOps[Self <: CaCertPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaCertPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaKeyPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caKeyPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

