package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.SVG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettingsSVG extends ExportSettings {
  val contentsOnly: js.UndefOr[Boolean] = js.native
  val format: SVG = js.native
   // defaults to true
  val suffix: js.UndefOr[String] = js.native
   // defaults to true
  val svgIdAttribute: js.UndefOr[Boolean] = js.native
  val svgOutlineText: js.UndefOr[Boolean] = js.native
   // defaults to false
  val svgSimplifyStroke: js.UndefOr[Boolean] = js.native
}

object ExportSettingsSVG {
  @scala.inline
  def apply(format: SVG): ExportSettingsSVG = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsSVG]
  }
  @scala.inline
  implicit class ExportSettingsSVGOps[Self <: ExportSettingsSVG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: SVG): Self = {
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
    @scala.inline
    def withSvgIdAttribute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgIdAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgIdAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgIdAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgOutlineText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgOutlineText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgOutlineText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgOutlineText")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgSimplifyStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgSimplifyStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgSimplifyStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgSimplifyStroke")(js.undefined)
        ret
    }
  }
  
}

