package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartsProcessed extends js.Object {
  /**
    * The number of parts of the video that YouTube has already processed.
    */
  var partsProcessed: Double = js.native
  /**
    * An estimate of the total number of parts that need to be processed for the video. The number may be updated with more precise estimates while YouTube processes the video.
    */
  var partsTotal: Double = js.native
  /**
    * An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the video.
    */
  var timeLeftMs: Double = js.native
}

object PartsProcessed {
  @scala.inline
  def apply(partsProcessed: Double, partsTotal: Double, timeLeftMs: Double): PartsProcessed = {
    val __obj = js.Dynamic.literal(partsProcessed = partsProcessed.asInstanceOf[js.Any], partsTotal = partsTotal.asInstanceOf[js.Any], timeLeftMs = timeLeftMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartsProcessed]
  }
  @scala.inline
  implicit class PartsProcessedOps[Self <: PartsProcessed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartsProcessed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partsProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartsTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partsTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLeftMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLeftMs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

