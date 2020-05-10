package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response of duplicating an object.
  */
@js.native
trait SchemaDuplicateObjectResponse extends js.Object {
  /**
    * The ID of the new duplicate object.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaDuplicateObjectResponse {
  @scala.inline
  def apply(): SchemaDuplicateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateObjectResponse]
  }
  @scala.inline
  implicit class SchemaDuplicateObjectResponseOps[Self <: SchemaDuplicateObjectResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
  }
  
}

