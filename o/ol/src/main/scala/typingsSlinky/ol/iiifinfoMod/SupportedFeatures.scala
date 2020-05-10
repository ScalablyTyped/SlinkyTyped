package typingsSlinky.ol.iiifinfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedFeatures extends js.Object {
  var formats: js.UndefOr[js.Array[String]] = js.native
  var qualities: js.UndefOr[js.Array[String]] = js.native
  var supports: js.UndefOr[js.Array[String]] = js.native
}

object SupportedFeatures {
  @scala.inline
  def apply(): SupportedFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedFeatures]
  }
  @scala.inline
  implicit class SupportedFeaturesOps[Self <: SupportedFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withQualities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualities")(js.undefined)
        ret
    }
    @scala.inline
    def withSupports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports")(js.undefined)
        ret
    }
  }
  
}

