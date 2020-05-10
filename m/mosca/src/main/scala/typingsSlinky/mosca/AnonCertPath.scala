package typingsSlinky.mosca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCertPath extends js.Object {
  var certPath: String = js.native
  var keyPath: String = js.native
  var port: Double = js.native
}

object AnonCertPath {
  @scala.inline
  def apply(certPath: String, keyPath: String, port: Double): AnonCertPath = {
    val __obj = js.Dynamic.literal(certPath = certPath.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCertPath]
  }
  @scala.inline
  implicit class AnonCertPathOps[Self <: AnonCertPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

