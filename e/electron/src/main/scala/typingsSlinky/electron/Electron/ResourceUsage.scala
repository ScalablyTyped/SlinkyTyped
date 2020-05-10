package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceUsage extends js.Object {
  var cssStyleSheets: MemoryUsageDetails = js.native
  var fonts: MemoryUsageDetails = js.native
  var images: MemoryUsageDetails = js.native
  var other: MemoryUsageDetails = js.native
  var scripts: MemoryUsageDetails = js.native
  var xslStyleSheets: MemoryUsageDetails = js.native
}

object ResourceUsage {
  @scala.inline
  def apply(
    cssStyleSheets: MemoryUsageDetails,
    fonts: MemoryUsageDetails,
    images: MemoryUsageDetails,
    other: MemoryUsageDetails,
    scripts: MemoryUsageDetails,
    xslStyleSheets: MemoryUsageDetails
  ): ResourceUsage = {
    val __obj = js.Dynamic.literal(cssStyleSheets = cssStyleSheets.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], xslStyleSheets = xslStyleSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceUsage]
  }
  @scala.inline
  implicit class ResourceUsageOps[Self <: ResourceUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssStyleSheets(value: MemoryUsageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssStyleSheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFonts(value: MemoryUsageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: MemoryUsageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: MemoryUsageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScripts(value: MemoryUsageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXslStyleSheets(value: MemoryUsageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xslStyleSheets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

