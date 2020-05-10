package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSLVerifyObject extends js.Object {
  var acceptedByOpenSSL: Boolean = js.native
  var depth: Double = js.native
  var pemCertificate: String = js.native
  var serverAddress: String = js.native
  var serverPort: Double = js.native
}

object SSLVerifyObject {
  @scala.inline
  def apply(
    acceptedByOpenSSL: Boolean,
    depth: Double,
    pemCertificate: String,
    serverAddress: String,
    serverPort: Double
  ): SSLVerifyObject = {
    val __obj = js.Dynamic.literal(acceptedByOpenSSL = acceptedByOpenSSL.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], pemCertificate = pemCertificate.asInstanceOf[js.Any], serverAddress = serverAddress.asInstanceOf[js.Any], serverPort = serverPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSLVerifyObject]
  }
  @scala.inline
  implicit class SSLVerifyObjectOps[Self <: SSLVerifyObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedByOpenSSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedByOpenSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPemCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pemCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

