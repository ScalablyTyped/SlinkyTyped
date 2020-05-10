package typingsSlinky.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportDescriptorOptions extends ReportDescriptorOptionsBase {
  var suggest: js.UndefOr[js.Array[SuggestionReportDescriptor] | Null] = js.native
}

object ReportDescriptorOptions {
  @scala.inline
  def apply(): ReportDescriptorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportDescriptorOptions]
  }
  @scala.inline
  implicit class ReportDescriptorOptionsOps[Self <: ReportDescriptorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuggest(value: js.Array[SuggestionReportDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest")(null)
        ret
    }
  }
  
}

