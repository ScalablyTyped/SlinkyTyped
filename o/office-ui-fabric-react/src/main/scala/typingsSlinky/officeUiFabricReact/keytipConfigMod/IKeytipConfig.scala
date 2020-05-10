package typingsSlinky.officeUiFabricReact.keytipConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipConfig extends js.Object {
  var keytips: js.Array[IKeytipConfigItem] = js.native
}

object IKeytipConfig {
  @scala.inline
  def apply(keytips: js.Array[IKeytipConfigItem]): IKeytipConfig = {
    val __obj = js.Dynamic.literal(keytips = keytips.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipConfig]
  }
  @scala.inline
  implicit class IKeytipConfigOps[Self <: IKeytipConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeytips(value: js.Array[IKeytipConfigItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytips")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

