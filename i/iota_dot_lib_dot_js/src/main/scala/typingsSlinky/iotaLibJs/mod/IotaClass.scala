package typingsSlinky.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotaClass extends js.Object {
  var api: IotaApi = js.native
  var multisig: IotaMultisig = js.native
  var utils: IotaUtils = js.native
  var valid: IotaValid = js.native
  var version: String = js.native
}

object IotaClass {
  @scala.inline
  def apply(api: IotaApi, multisig: IotaMultisig, utils: IotaUtils, valid: IotaValid, version: String): IotaClass = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], multisig = multisig.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotaClass]
  }
  @scala.inline
  implicit class IotaClassOps[Self <: IotaClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: IotaApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultisig(value: IotaMultisig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multisig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: IotaUtils): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: IotaValid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

