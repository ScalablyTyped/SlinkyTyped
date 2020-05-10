package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Randomizes the order of the rows in a range.
  */
@js.native
trait SchemaRandomizeRangeRequest extends js.Object {
  /**
    * The range to randomize.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaRandomizeRangeRequest {
  @scala.inline
  def apply(): SchemaRandomizeRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRandomizeRangeRequest]
  }
  @scala.inline
  implicit class SchemaRandomizeRangeRequestOps[Self <: SchemaRandomizeRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: SchemaGridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

