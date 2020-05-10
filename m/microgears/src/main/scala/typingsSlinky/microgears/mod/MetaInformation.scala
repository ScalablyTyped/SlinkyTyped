package typingsSlinky.microgears.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaInformation extends js.Object {
  var error: js.UndefOr[js.Error] = js.native
  var extra: js.Any = js.native
  var methodName: String = js.native
  var serviceName: String = js.native
  var serviceNameSpace: String = js.native
}

object MetaInformation {
  @scala.inline
  def apply(extra: js.Any, methodName: String, serviceName: String, serviceNameSpace: String): MetaInformation = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceNameSpace = serviceNameSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaInformation]
  }
  @scala.inline
  implicit class MetaInformationOps[Self <: MetaInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceNameSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceNameSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

