package typingsSlinky.compressJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressResult extends js.Object {
  var alt: String = js.native
  var data: String = js.native
  var elapsedTimeInSeconds: Double = js.native
  var endHeightInPx: Double = js.native
  var endSizeInMb: Double = js.native
  var endWidthInPx: Double = js.native
  var ext: String = js.native
  var initialHeightInPx: Double = js.native
  var initialSizeInMb: Double = js.native
  var initialWidthInPx: Double = js.native
  var iterations: Double = js.native
  var prefix: String = js.native
  var quality: Double = js.native
  var sizeReducedInPercent: Double = js.native
}

object CompressResult {
  @scala.inline
  def apply(
    alt: String,
    data: String,
    elapsedTimeInSeconds: Double,
    endHeightInPx: Double,
    endSizeInMb: Double,
    endWidthInPx: Double,
    ext: String,
    initialHeightInPx: Double,
    initialSizeInMb: Double,
    initialWidthInPx: Double,
    iterations: Double,
    prefix: String,
    quality: Double,
    sizeReducedInPercent: Double
  ): CompressResult = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], elapsedTimeInSeconds = elapsedTimeInSeconds.asInstanceOf[js.Any], endHeightInPx = endHeightInPx.asInstanceOf[js.Any], endSizeInMb = endSizeInMb.asInstanceOf[js.Any], endWidthInPx = endWidthInPx.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], initialHeightInPx = initialHeightInPx.asInstanceOf[js.Any], initialSizeInMb = initialSizeInMb.asInstanceOf[js.Any], initialWidthInPx = initialWidthInPx.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], sizeReducedInPercent = sizeReducedInPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressResult]
  }
  @scala.inline
  implicit class CompressResultOps[Self <: CompressResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElapsedTimeInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedTimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndHeightInPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endHeightInPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndSizeInMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endSizeInMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndWidthInPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endWidthInPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialHeightInPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHeightInPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialSizeInMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSizeInMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialWidthInPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialWidthInPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeReducedInPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeReducedInPercent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

