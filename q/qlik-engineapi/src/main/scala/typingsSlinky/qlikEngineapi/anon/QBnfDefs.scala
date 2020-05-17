package typingsSlinky.qlikEngineapi.anon

import typingsSlinky.qlikEngineapi.EngineAPI.IBNFDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QBnfDefs extends js.Object {
  var qBnfDefs: IBNFDef = js.native
  var qBnfHash: String = js.native
}

object QBnfDefs {
  @scala.inline
  def apply(qBnfDefs: IBNFDef, qBnfHash: String): QBnfDefs = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[QBnfDefs]
  }
  @scala.inline
  implicit class QBnfDefsOps[Self <: QBnfDefs] (val x: Self) extends AnyVal {
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

