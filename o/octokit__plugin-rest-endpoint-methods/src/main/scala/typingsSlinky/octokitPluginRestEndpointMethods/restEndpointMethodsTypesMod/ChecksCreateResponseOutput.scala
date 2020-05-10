package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksCreateResponseOutput extends js.Object {
  var annotations_count: js.UndefOr[Double] = js.native
  var annotations_url: js.UndefOr[String] = js.native
  var summary: String = js.native
  var text: String = js.native
  var title: String = js.native
}

object ChecksCreateResponseOutput {
  @scala.inline
  def apply(summary: String, text: String, title: String): ChecksCreateResponseOutput = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateResponseOutput]
  }
  @scala.inline
  implicit class ChecksCreateResponseOutputOps[Self <: ChecksCreateResponseOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotations_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations_count")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotations_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations_url")(js.undefined)
        ret
    }
  }
  
}

