package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksListAnnotationsResponseItem extends js.Object {
  var annotation_level: String = js.native
  var end_column: Double = js.native
  var end_line: Double = js.native
  var message: String = js.native
  var path: String = js.native
  var raw_details: String = js.native
  var start_column: Double = js.native
  var start_line: Double = js.native
  var title: String = js.native
}

object ChecksListAnnotationsResponseItem {
  @scala.inline
  def apply(
    annotation_level: String,
    end_column: Double,
    end_line: Double,
    message: String,
    path: String,
    raw_details: String,
    start_column: Double,
    start_line: Double,
    title: String
  ): ChecksListAnnotationsResponseItem = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_column = end_column.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw_details = raw_details.asInstanceOf[js.Any], start_column = start_column.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListAnnotationsResponseItem]
  }
  @scala.inline
  implicit class ChecksListAnnotationsResponseItemOps[Self <: ChecksListAnnotationsResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation_level(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_column(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw_details(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_column(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

