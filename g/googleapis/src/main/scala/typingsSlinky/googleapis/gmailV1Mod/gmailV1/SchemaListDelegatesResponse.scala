package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListDelegates method.
  */
@js.native
trait SchemaListDelegatesResponse extends js.Object {
  /**
    * List of the user&#39;s delegates (with any verification status).
    */
  var delegates: js.UndefOr[js.Array[SchemaDelegate]] = js.native
}

object SchemaListDelegatesResponse {
  @scala.inline
  def apply(): SchemaListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDelegatesResponse]
  }
  @scala.inline
  implicit class SchemaListDelegatesResponseOps[Self <: SchemaListDelegatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegates(value: js.Array[SchemaDelegate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegates")(js.undefined)
        ret
    }
  }
  
}

