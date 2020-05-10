package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a ReopenMatterRequest.
  */
@js.native
trait SchemaReopenMatterResponse extends js.Object {
  /**
    * The updated matter, with state OPEN.
    */
  var matter: js.UndefOr[SchemaMatter] = js.native
}

object SchemaReopenMatterResponse {
  @scala.inline
  def apply(): SchemaReopenMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReopenMatterResponse]
  }
  @scala.inline
  implicit class SchemaReopenMatterResponseOps[Self <: SchemaReopenMatterResponse] (val x: Self) extends AnyVal {
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

