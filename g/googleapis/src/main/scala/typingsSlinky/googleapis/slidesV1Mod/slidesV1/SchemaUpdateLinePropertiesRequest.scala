package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the properties of a Line.
  */
@js.native
trait SchemaUpdateLinePropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `lineProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the line solid fill color, set `fields` to
    * `&quot;lineFill.solidFill.color&quot;`.  To reset a property to its
    * default value, include its field name in the field mask but leave the
    * field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The line properties to update.
    */
  var lineProperties: js.UndefOr[SchemaLineProperties] = js.native
  /**
    * The object ID of the line the update is applied to.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaUpdateLinePropertiesRequest {
  @scala.inline
  def apply(): SchemaUpdateLinePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateLinePropertiesRequest]
  }
  @scala.inline
  implicit class SchemaUpdateLinePropertiesRequestOps[Self <: SchemaUpdateLinePropertiesRequest] (val x: Self) extends AnyVal {
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
    def withLineProperties(value: SchemaLineProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineProperties")(js.undefined)
        ret
    }
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

