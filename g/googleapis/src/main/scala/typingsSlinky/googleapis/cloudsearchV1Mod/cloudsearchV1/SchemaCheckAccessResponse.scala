package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCheckAccessResponse extends js.Object {
  /**
    * Returns true if principal has access.  Returns false otherwise.
    */
  var hasAccess: js.UndefOr[Boolean] = js.native
}

object SchemaCheckAccessResponse {
  @scala.inline
  def apply(): SchemaCheckAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckAccessResponse]
  }
  @scala.inline
  implicit class SchemaCheckAccessResponseOps[Self <: SchemaCheckAccessResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAccess")(js.undefined)
        ret
    }
  }
  
}

