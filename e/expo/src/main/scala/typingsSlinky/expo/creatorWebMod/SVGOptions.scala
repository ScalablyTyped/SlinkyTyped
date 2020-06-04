package typingsSlinky.expo.creatorWebMod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGOptions extends js.Object {
  var bgcolor: js.UndefOr[FillStyle] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var missingImageSource: js.UndefOr[String] = js.undefined
  var preventCaching: js.UndefOr[Boolean] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SVGOptions {
  @scala.inline
  def apply(): SVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGOptions]
  }
  @scala.inline
  implicit class SVGOptionsOps[Self <: SVGOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBgcolorCanvasPattern(value: CanvasPattern): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgcolorCanvasGradient(value: CanvasGradient): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgcolor(value: FillStyle): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMissingImageSource(value: String): Self = this.set("missingImageSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingImageSource: Self = this.set("missingImageSource", js.undefined)
    @scala.inline
    def setPreventCaching(value: Boolean): Self = this.set("preventCaching", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventCaching: Self = this.set("preventCaching", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

