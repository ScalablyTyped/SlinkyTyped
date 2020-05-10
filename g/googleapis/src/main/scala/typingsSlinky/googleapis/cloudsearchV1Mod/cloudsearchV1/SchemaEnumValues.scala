package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of enum values.
  */
@js.native
trait SchemaEnumValues extends js.Object {
  /**
    * The maximum allowable length for string values is 32 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaEnumValues {
  @scala.inline
  def apply(): SchemaEnumValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnumValues]
  }
  @scala.inline
  implicit class SchemaEnumValuesOps[Self <: SchemaEnumValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

