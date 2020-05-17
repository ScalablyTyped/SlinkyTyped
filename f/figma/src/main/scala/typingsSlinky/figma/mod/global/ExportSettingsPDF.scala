package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.PDF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettingsPDF extends ExportSettings {
  val contentsOnly: js.UndefOr[Boolean] = js.native
  val format: PDF = js.native
   // defaults to true
  val suffix: js.UndefOr[String] = js.native
}

object ExportSettingsPDF {
  @scala.inline
  def apply(format: PDF): ExportSettingsPDF = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsPDF]
  }
  @scala.inline
  implicit class ExportSettingsPDFOps[Self <: ExportSettingsPDF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: PDF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
  }
  
}

