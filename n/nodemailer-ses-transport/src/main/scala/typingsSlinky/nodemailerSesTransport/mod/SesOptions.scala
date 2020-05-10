package typingsSlinky.nodemailerSesTransport.mod

import typingsSlinky.awsSdk.mod.SES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SesOptions extends js.Object {
  var SES: typingsSlinky.awsSdk.mod.SES = js.native
  var component: js.UndefOr[String] = js.native
  var maxConnections: js.UndefOr[Double] = js.native
  var sendingRate: js.UndefOr[Double] = js.native
}

object SesOptions {
  @scala.inline
  def apply(SES: SES): SesOptions = {
    val __obj = js.Dynamic.literal(SES = SES.asInstanceOf[js.Any])
    __obj.asInstanceOf[SesOptions]
  }
  @scala.inline
  implicit class SesOptionsOps[Self <: SesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSES(value: SES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withSendingRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendingRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendingRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendingRate")(js.undefined)
        ret
    }
  }
  
}

