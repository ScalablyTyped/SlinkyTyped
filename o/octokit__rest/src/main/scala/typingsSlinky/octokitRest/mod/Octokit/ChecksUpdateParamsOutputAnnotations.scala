package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.failure
import typingsSlinky.octokitRest.octokitRestStrings.notice
import typingsSlinky.octokitRest.octokitRestStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksUpdateParamsOutputAnnotations extends js.Object {
  var annotation_level: notice | warning | failure = js.native
  var end_column: js.UndefOr[Double] = js.native
  var end_line: Double = js.native
  var message: String = js.native
  var path: String = js.native
  var raw_details: js.UndefOr[String] = js.native
  var start_column: js.UndefOr[Double] = js.native
  var start_line: Double = js.native
  var title: js.UndefOr[String] = js.native
}

object ChecksUpdateParamsOutputAnnotations {
  @scala.inline
  def apply(
    annotation_level: notice | warning | failure,
    end_line: Double,
    message: String,
    path: String,
    start_line: Double
  ): ChecksUpdateParamsOutputAnnotations = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutputAnnotations]
  }
  @scala.inline
  implicit class ChecksUpdateParamsOutputAnnotationsOps[Self <: ChecksUpdateParamsOutputAnnotations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation_level(value: notice | warning | failure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation_level")(value.asInstanceOf[js.Any])
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
    def withStart_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_column(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_column: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_column")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw_details(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_details")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_column(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_column: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_column")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

