package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a CloseMatterRequest.
  */
@js.native
trait SchemaCloseMatterResponse extends js.Object {
  /**
    * The updated matter, with state CLOSED.
    */
  var matter: js.UndefOr[SchemaMatter] = js.native
}

object SchemaCloseMatterResponse {
  @scala.inline
  def apply(): SchemaCloseMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloseMatterResponse]
  }
  @scala.inline
  implicit class SchemaCloseMatterResponseOps[Self <: SchemaCloseMatterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatter(value: SchemaMatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matter")(js.undefined)
        ret
    }
  }
  
}

