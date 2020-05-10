package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates properties of the named range with the specified namedRangeId.
  */
@js.native
trait SchemaUpdateNamedRangeRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `namedRange` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The named range to update with the new properties.
    */
  var namedRange: js.UndefOr[SchemaNamedRange] = js.native
}

object SchemaUpdateNamedRangeRequest {
  @scala.inline
  def apply(): SchemaUpdateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateNamedRangeRequest]
  }
  @scala.inline
  implicit class SchemaUpdateNamedRangeRequestOps[Self <: SchemaUpdateNamedRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedRange(value: SchemaNamedRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRange")(js.undefined)
        ret
    }
  }
  
}

