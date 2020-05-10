package typingsSlinky.node.http2Mod

import typingsSlinky.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureServerOptions
  extends TlsOptions
     with ServerSessionOptions {
  var allowHTTP1: js.UndefOr[Boolean] = js.native
  var origins: js.UndefOr[js.Array[String]] = js.native
}

object SecureServerOptions {
  @scala.inline
  def apply(): SecureServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureServerOptions]
  }
  @scala.inline
  implicit class SecureServerOptionsOps[Self <: SecureServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHTTP1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHTTP1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHTTP1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHTTP1")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(js.undefined)
        ret
    }
  }
  
}

