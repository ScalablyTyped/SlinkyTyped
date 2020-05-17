package typingsSlinky.cfenv.mod

import typingsSlinky.cfenv.anon.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppEnvOptions extends js.Object {
  var name: js.UndefOr[String] = js.native
  var protocol: js.UndefOr[String] = js.native
  var vcap: js.UndefOr[Application] = js.native
  var vcapFile: js.UndefOr[String] = js.native
}

object GetAppEnvOptions {
  @scala.inline
  def apply(): GetAppEnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppEnvOptions]
  }
  @scala.inline
  implicit class GetAppEnvOptionsOps[Self <: GetAppEnvOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withVcap(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVcap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcap")(js.undefined)
        ret
    }
    @scala.inline
    def withVcapFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcapFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVcapFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcapFile")(js.undefined)
        ret
    }
  }
  
}

