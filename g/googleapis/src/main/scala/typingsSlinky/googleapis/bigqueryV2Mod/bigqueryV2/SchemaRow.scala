package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single row in the confusion matrix.
  */
@js.native
trait SchemaRow extends js.Object {
  /**
    * The original label of this row.
    */
  var actualLabel: js.UndefOr[String] = js.native
  /**
    * Info describing predicted label distribution.
    */
  var entries: js.UndefOr[js.Array[SchemaEntry]] = js.native
}

object SchemaRow {
  @scala.inline
  def apply(): SchemaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRow]
  }
  @scala.inline
  implicit class SchemaRowOps[Self <: SchemaRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withEntries(value: js.Array[SchemaEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
  }
  
}

