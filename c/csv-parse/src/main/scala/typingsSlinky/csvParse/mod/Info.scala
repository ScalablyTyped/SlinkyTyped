package typingsSlinky.csvParse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Info extends js.Object {
  /**
    * Count the number of lines being fully commented.
    */
  val comment_lines: Double = js.native
  /**
    * Count the number of processed empty lines.
    */
  val empty_lines: Double = js.native
  /**
    * Number of non uniform records when `relax_column_count` is true.
    */
  val invalid_field_length: Double = js.native
  /**
    * The number of lines encountered in the source dataset, start at 1 for the first line.
    */
  val lines: Double = js.native
  /**
    * Count the number of processed records.
    */
  val records: Double = js.native
}

object Info {
  @scala.inline
  def apply(
    comment_lines: Double,
    empty_lines: Double,
    invalid_field_length: Double,
    lines: Double,
    records: Double
  ): Info = {
    val __obj = js.Dynamic.literal(comment_lines = comment_lines.asInstanceOf[js.Any], empty_lines = empty_lines.asInstanceOf[js.Any], invalid_field_length = invalid_field_length.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment_lines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmpty_lines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty_lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid_field_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid_field_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

