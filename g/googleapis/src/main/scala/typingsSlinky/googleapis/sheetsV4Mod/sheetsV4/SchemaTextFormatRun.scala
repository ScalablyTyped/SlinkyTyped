package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A run of a text format. The format of this run continues until the start
  * index of the next run. When updating, all fields must be set.
  */
@js.native
trait SchemaTextFormatRun extends js.Object {
  /**
    * The format of this run.  Absent values inherit the cell&#39;s format.
    */
  var format: js.UndefOr[SchemaTextFormat] = js.native
  /**
    * The character index where this run starts.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object SchemaTextFormatRun {
  @scala.inline
  def apply(): SchemaTextFormatRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextFormatRun]
  }
  @scala.inline
  implicit class SchemaTextFormatRunOps[Self <: SchemaTextFormatRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: SchemaTextFormat): Self = {
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
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
  }
  
}

