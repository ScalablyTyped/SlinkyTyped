package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaInterface extends js.Object {
  var `media-back-coating`: js.UndefOr[MediaCoating] = js.native
  var `media-bottom-margin`: js.UndefOr[Double] = js.native
  var `media-color`: js.UndefOr[MediaColor] = js.native
  var `media-front-coating`: js.UndefOr[MediaCoating] = js.native
  var `media-grain`: js.UndefOr[MediaGrain] = js.native
  var `media-hole-count`: js.UndefOr[Double] = js.native
  var `media-info`: js.UndefOr[String] = js.native
  var `media-key`: js.UndefOr[MediaSizeName | MediaName] = js.native
  var `media-left-margin`: js.UndefOr[Double] = js.native
  var `media-order-count`: js.UndefOr[Double] = js.native
  var `media-pre-printed`: js.UndefOr[MediaPrePrinted] = js.native
  var `media-recycled`: js.UndefOr[MediaPrePrinted] = js.native
  var `media-right-margin`: js.UndefOr[Double] = js.native
  var `media-size`: js.UndefOr[MediaSize] = js.native
  var `media-size-name`: js.UndefOr[MediaSizeName] = js.native
  var `media-source`: js.UndefOr[MediaSource] = js.native
  var `media-thickness`: js.UndefOr[Double] = js.native
  var `media-tooth`: js.UndefOr[MediaTooth] = js.native
  var `media-top-margin`: js.UndefOr[Double] = js.native
  var `media-type`: js.UndefOr[MediaType] = js.native
  var `media-weight-metric`: js.UndefOr[Double] = js.native
}

object MediaInterface {
  @scala.inline
  def apply(): MediaInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInterface]
  }
  @scala.inline
  implicit class MediaInterfaceOps[Self <: MediaInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withMedia-back-coating`(value: MediaCoating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-back-coating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-back-coating`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-back-coating")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-bottom-margin`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-bottom-margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-bottom-margin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-bottom-margin")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-color`(value: MediaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-front-coating`(value: MediaCoating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-front-coating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-front-coating`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-front-coating")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-grain`(value: MediaGrain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-grain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-grain`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-grain")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-hole-count`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-hole-count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-hole-count`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-hole-count")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-info`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-info`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-info")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-key`(value: MediaSizeName | MediaName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-key")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-left-margin`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-left-margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-left-margin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-left-margin")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-order-count`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-order-count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-order-count`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-order-count")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-pre-printed`(value: MediaPrePrinted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-pre-printed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-pre-printed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-pre-printed")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-recycled`(value: MediaPrePrinted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-recycled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-recycled`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-recycled")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-right-margin`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-right-margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-right-margin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-right-margin")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-size`(value: MediaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-size-name`(value: MediaSizeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-size-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-size-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-size-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-source`(value: MediaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-source`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-source")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-thickness`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-thickness`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-thickness")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-tooth`(value: MediaTooth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-tooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-tooth`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-tooth")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-top-margin`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-top-margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-top-margin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-top-margin")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-type`(value: MediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-weight-metric`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-weight-metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-weight-metric`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-weight-metric")(js.undefined)
        ret
    }
  }
  
}

