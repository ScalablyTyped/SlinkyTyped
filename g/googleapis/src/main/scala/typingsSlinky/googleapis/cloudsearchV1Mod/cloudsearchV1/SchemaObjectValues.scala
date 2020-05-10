package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of object values.
  */
@js.native
trait SchemaObjectValues extends js.Object {
  var values: js.UndefOr[js.Array[SchemaStructuredDataObject]] = js.native
}

object SchemaObjectValues {
  @scala.inline
  def apply(): SchemaObjectValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectValues]
  }
  @scala.inline
  implicit class SchemaObjectValuesOps[Self <: SchemaObjectValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[SchemaStructuredDataObject]): Self = {
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

