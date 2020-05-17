package typingsSlinky.projectOxford.mod.VisionResponses

import typingsSlinky.projectOxford.anon.Lines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ocr extends js.Object {
  var language: String = js.native
  var orientation: String = js.native
  var regions: js.Array[Lines] = js.native
  var textAngle: Double = js.native
}

object Ocr {
  @scala.inline
  def apply(language: String, orientation: String, regions: js.Array[Lines], textAngle: Double): Ocr = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any], textAngle = textAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ocr]
  }
  @scala.inline
  implicit class OcrOps[Self <: Ocr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[Lines]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAngle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

