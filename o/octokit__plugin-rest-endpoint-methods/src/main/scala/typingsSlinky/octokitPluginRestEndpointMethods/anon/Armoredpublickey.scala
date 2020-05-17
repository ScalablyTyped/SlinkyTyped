package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Armoredpublickey extends js.Object {
  var armored_public_key: Type = js.native
}

object Armoredpublickey {
  @scala.inline
  def apply(armored_public_key: Type): Armoredpublickey = {
    val __obj = js.Dynamic.literal(armored_public_key = armored_public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Armoredpublickey]
  }
  @scala.inline
  implicit class ArmoredpublickeyOps[Self <: Armoredpublickey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArmored_public_key(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armored_public_key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

