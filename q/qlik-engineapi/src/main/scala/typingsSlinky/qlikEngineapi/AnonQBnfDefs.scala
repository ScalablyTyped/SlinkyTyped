package typingsSlinky.qlikEngineapi

import typingsSlinky.qlikEngineapi.EngineAPI.IBNFDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQBnfDefs extends js.Object {
  var qBnfDefs: IBNFDef = js.native
  var qBnfHash: String = js.native
}

object AnonQBnfDefs {
  @scala.inline
  def apply(qBnfDefs: IBNFDef, qBnfHash: String): AnonQBnfDefs = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQBnfDefs]
  }
  @scala.inline
  implicit class AnonQBnfDefsOps[Self <: AnonQBnfDefs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQBnfDefs(value: IBNFDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBnfDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQBnfHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBnfHash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

