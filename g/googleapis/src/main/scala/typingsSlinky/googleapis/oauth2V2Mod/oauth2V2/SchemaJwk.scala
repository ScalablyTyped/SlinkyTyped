package typingsSlinky.googleapis.oauth2V2Mod.oauth2V2

import typingsSlinky.googleapis.AnonAlg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJwk extends js.Object {
  var keys: js.UndefOr[js.Array[AnonAlg]] = js.native
}

object SchemaJwk {
  @scala.inline
  def apply(): SchemaJwk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwk]
  }
  @scala.inline
  implicit class SchemaJwkOps[Self <: SchemaJwk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeys(value: js.Array[AnonAlg]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
  }
  
}

