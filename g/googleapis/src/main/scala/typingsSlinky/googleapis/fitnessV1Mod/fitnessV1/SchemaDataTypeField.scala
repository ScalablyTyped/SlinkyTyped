package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In case of multi-dimensional data (such as an accelerometer with x, y, and
  * z axes) each field represents one dimension. Each data type field has a
  * unique name which identifies it. The field also defines the format of the
  * data (int, float, etc.).  This message is only instantiated in code and not
  * used for wire comms or stored in any way.
  */
@js.native
trait SchemaDataTypeField extends js.Object {
  /**
    * The different supported formats for each field in a data type.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Defines the name and format of data. Unlike data type names, field names
    * are not namespaced, and only need to be unique within the data type.
    */
  var name: js.UndefOr[String] = js.native
  var optional: js.UndefOr[Boolean] = js.native
}

object SchemaDataTypeField {
  @scala.inline
  def apply(): SchemaDataTypeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataTypeField]
  }
  @scala.inline
  implicit class SchemaDataTypeFieldOps[Self <: SchemaDataTypeField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
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
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
  }
  
}

