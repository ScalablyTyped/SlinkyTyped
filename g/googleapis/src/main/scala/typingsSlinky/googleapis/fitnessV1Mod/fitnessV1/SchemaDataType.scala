package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDataType extends js.Object {
  /**
    * A field represents one dimension of a data type.
    */
  var field: js.UndefOr[js.Array[SchemaDataTypeField]] = js.native
  /**
    * Each data type has a unique, namespaced, name. All data types in the
    * com.google namespace are shared as part of the platform.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaDataType {
  @scala.inline
  def apply(): SchemaDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataType]
  }
  @scala.inline
  implicit class SchemaDataTypeOps[Self <: SchemaDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: js.Array[SchemaDataTypeField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
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
  }
  
}

