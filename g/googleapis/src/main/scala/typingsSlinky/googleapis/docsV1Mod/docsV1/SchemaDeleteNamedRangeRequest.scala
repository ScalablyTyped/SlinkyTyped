package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a NamedRange.
  */
@js.native
trait SchemaDeleteNamedRangeRequest extends js.Object {
  /**
    * The name of the range(s) to delete. All named ranges with the given name
    * will be deleted.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the named range to delete.
    */
  var namedRangeId: js.UndefOr[String] = js.native
}

object SchemaDeleteNamedRangeRequest {
  @scala.inline
  def apply(): SchemaDeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteNamedRangeRequest]
  }
  @scala.inline
  implicit class SchemaDeleteNamedRangeRequestOps[Self <: SchemaDeleteNamedRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedRangeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedRangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRangeId")(js.undefined)
        ret
    }
  }
  
}

