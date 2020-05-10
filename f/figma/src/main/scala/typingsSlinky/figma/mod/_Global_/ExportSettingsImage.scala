package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.JPG
import typingsSlinky.figma.figmaStrings.PNG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettingsImage extends ExportSettings {
  val constraint: js.UndefOr[ExportSettingsConstraints] = js.native
  val contentsOnly: js.UndefOr[Boolean] = js.native
  val format: JPG | PNG = js.native
   // defaults to true
  val suffix: js.UndefOr[String] = js.native
}

object ExportSettingsImage {
  @scala.inline
  def apply(format: JPG | PNG): ExportSettingsImage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsImage]
  }
  @scala.inline
  implicit class ExportSettingsImageOps[Self <: ExportSettingsImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: JPG | PNG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraint(value: ExportSettingsConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(js.undefined)
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

