package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents array of string values.
  */
@js.native
trait SchemaStringValues extends js.Object {
  /**
    * Required.  String values.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaStringValues {
  @scala.inline
  def apply(): SchemaStringValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringValues]
  }
  @scala.inline
  implicit class SchemaStringValuesOps[Self <: SchemaStringValues] (val x: Self) extends AnyVal {
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

