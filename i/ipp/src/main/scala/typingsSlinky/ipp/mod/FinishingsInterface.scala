package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishingsInterface extends js.Object {
  var baling: js.UndefOr[FinishingBailing] = js.native
  var binding: js.UndefOr[FinishingBinding] = js.native
  var coating: js.UndefOr[FinishingCoating] = js.native
  var covering: js.UndefOr[FinishingCovering] = js.native
  var `finishing-template`: js.UndefOr[Finishings] = js.native
  var folding: js.UndefOr[js.Array[FinishingFolding]] = js.native
  var `imposition-template`: js.UndefOr[ImpositionTemplate] = js.native
  var laminating: js.UndefOr[FinishingLaminating] = js.native
  var `media-sheets-supported`: js.UndefOr[String] = js.native
  var `media-size`: js.UndefOr[MediaSize] = js.native
  var `media-size-name`: js.UndefOr[String] = js.native
  var punching: js.UndefOr[FinishingPunching] = js.native
  var stitching: js.UndefOr[FinishingStitching] = js.native
  var trimming: js.UndefOr[js.Array[FinishingTrimming]] = js.native
}

object FinishingsInterface {
  @scala.inline
  def apply(): FinishingsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingsInterface]
  }
  @scala.inline
  implicit class FinishingsInterfaceOps[Self <: FinishingsInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaling(value: FinishingBailing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baling")(js.undefined)
        ret
    }
    @scala.inline
    def withBinding(value: FinishingBinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(js.undefined)
        ret
    }
    @scala.inline
    def withCoating(value: FinishingCoating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coating")(js.undefined)
        ret
    }
    @scala.inline
    def withCovering(value: FinishingCovering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("covering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCovering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("covering")(js.undefined)
        ret
    }
    @scala.inline
    def `withFinishing-template`(value: Finishings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishing-template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFinishing-template`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishing-template")(js.undefined)
        ret
    }
    @scala.inline
    def withFolding(value: js.Array[FinishingFolding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding")(js.undefined)
        ret
    }
    @scala.inline
    def `withImposition-template`(value: ImpositionTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imposition-template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutImposition-template`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imposition-template")(js.undefined)
        ret
    }
    @scala.inline
    def withLaminating(value: FinishingLaminating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laminating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaminating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laminating")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-sheets-supported`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-sheets-supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-sheets-supported`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-sheets-supported")(js.undefined)
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
    def `withMedia-size-name`(value: String): Self = {
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
    def withPunching(value: FinishingPunching): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPunching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punching")(js.undefined)
        ret
    }
    @scala.inline
    def withStitching(value: FinishingStitching): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStitching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimming(value: js.Array[FinishingTrimming]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimming")(js.undefined)
        ret
    }
  }
  
}

