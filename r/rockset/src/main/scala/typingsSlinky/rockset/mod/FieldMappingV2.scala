package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldMappingV2 extends js.Object {
  // A List of InputField for this mapping
  var input_fields: js.UndefOr[js.Array[InputField]] = js.native
  // A user specified string that is a name for this mapping
  var name: js.UndefOr[String] = js.native
  // An OutputField for this mapping
  var output_field: js.UndefOr[OutputField] = js.native
}

object FieldMappingV2 {
  @scala.inline
  def apply(): FieldMappingV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldMappingV2]
  }
  @scala.inline
  implicit class FieldMappingV2Ops[Self <: FieldMappingV2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput_fields(value: js.Array[InputField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_fields")(js.undefined)
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
    def withOutput_field(value: OutputField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput_field: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_field")(js.undefined)
        ret
    }
  }
  
}

