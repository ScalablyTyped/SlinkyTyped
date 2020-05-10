package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The holds for a matter.
  */
@js.native
trait SchemaListHoldsResponse extends js.Object {
  /**
    * The list of holds.
    */
  var holds: js.UndefOr[js.Array[SchemaHold]] = js.native
  /**
    * Page token to retrieve the next page of results in the list. If this is
    * empty, then there are no more holds to list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListHoldsResponse {
  @scala.inline
  def apply(): SchemaListHoldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHoldsResponse]
  }
  @scala.inline
  implicit class SchemaListHoldsResponseOps[Self <: SchemaListHoldsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHolds(value: js.Array[SchemaHold]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holds")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

