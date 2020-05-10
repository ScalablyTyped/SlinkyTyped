package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IBNFDefResult
  */
@js.native
trait IBNFDefResult extends js.Object {
  /**
    * Description of the scripting language grammar.
    */
  var qBnfDefs: js.Array[IBNFDef] = js.native
  /**
    * A string hash of the BNF definition.
    */
  var qBnfHash: String = js.native
}

object IBNFDefResult {
  @scala.inline
  def apply(qBnfDefs: js.Array[IBNFDef], qBnfHash: String): IBNFDefResult = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBNFDefResult]
  }
  @scala.inline
  implicit class IBNFDefResultOps[Self <: IBNFDefResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQBnfDefs(value: js.Array[IBNFDef]): Self = {
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

