package typingsSlinky.projectOxford.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analyze extends js.Object {
   // Detects if faces are present.If present, generate coordinates, gender and age.
  var Adult: js.UndefOr[Boolean] = js.native
   // Detects if image is pornographic in nature(nudity or sex act).Sexually suggestive content is also detected.
  var Categories: js.UndefOr[Boolean] = js.native
   // Detects if image is clipart or a line drawing.
  var Color: js.UndefOr[Boolean] = js.native
   // Determines the accent color, dominant color, if image is black& white.
  var Faces: js.UndefOr[Boolean] = js.native
   // Path to image to be analyzed
  var ImageType: js.UndefOr[Boolean] = js.native
   // Url to image to be analyzed
  var path: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object Analyze {
  @scala.inline
  def apply(): Analyze = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analyze]
  }
  @scala.inline
  implicit class AnalyzeOps[Self <: Analyze] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adult")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Categories")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(js.undefined)
        ret
    }
    @scala.inline
    def withFaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Faces")(js.undefined)
        ret
    }
    @scala.inline
    def withImageType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageType")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

