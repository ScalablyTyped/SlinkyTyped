package typingsSlinky.officeUiFabricReact.keytipManagerMod

import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUniqueKeytip extends js.Object {
  var keytip: IKeytipProps = js.native
  var uniqueID: String = js.native
}

object IUniqueKeytip {
  @scala.inline
  def apply(keytip: IKeytipProps, uniqueID: String): IUniqueKeytip = {
    val __obj = js.Dynamic.literal(keytip = keytip.asInstanceOf[js.Any], uniqueID = uniqueID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUniqueKeytip]
  }
  @scala.inline
  implicit class IUniqueKeytipOps[Self <: IUniqueKeytip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeytip(value: IKeytipProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

