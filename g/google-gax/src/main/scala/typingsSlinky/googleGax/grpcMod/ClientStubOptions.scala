package typingsSlinky.googleGax.grpcMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientStubOptions
  extends /* index */ StringDictionary[js.UndefOr[String | Double | js.Object]] {
  var port: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[String] = js.native
  var servicePath: js.UndefOr[String] = js.native
  var sslCreds: js.UndefOr[js.Any] = js.native
}

object ClientStubOptions {
  @scala.inline
  def apply(): ClientStubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientStubOptions]
  }
  @scala.inline
  implicit class ClientStubOptionsOps[Self <: ClientStubOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSslCreds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCreds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCreds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCreds")(js.undefined)
        ret
    }
  }
  
}

