package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for batch create held accounts.
  */
@js.native
trait SchemaAddHeldAccountsResponse extends js.Object {
  /**
    * The list of responses, in the same order as the batch request.
    */
  var responses: js.UndefOr[js.Array[SchemaAddHeldAccountResult]] = js.native
}

object SchemaAddHeldAccountsResponse {
  @scala.inline
  def apply(): SchemaAddHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddHeldAccountsResponse]
  }
  @scala.inline
  implicit class SchemaAddHeldAccountsResponseOps[Self <: SchemaAddHeldAccountsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: js.Array[SchemaAddHeldAccountResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(js.undefined)
        ret
    }
  }
  
}

