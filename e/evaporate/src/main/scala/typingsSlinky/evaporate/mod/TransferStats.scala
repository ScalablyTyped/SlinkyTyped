package typingsSlinky.evaporate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferStats extends js.Object {
  var fileSize: Double = js.native
  var loaded: Double = js.native
  var readableSpeed: String = js.native
  var remainingSize: Double = js.native
  var secondsLeft: Double = js.native
  var speed: Double = js.native
  var totalUploaded: Double = js.native
}

object TransferStats {
  @scala.inline
  def apply(
    fileSize: Double,
    loaded: Double,
    readableSpeed: String,
    remainingSize: Double,
    secondsLeft: Double,
    speed: Double,
    totalUploaded: Double
  ): TransferStats = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], readableSpeed = readableSpeed.asInstanceOf[js.Any], remainingSize = remainingSize.asInstanceOf[js.Any], secondsLeft = secondsLeft.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], totalUploaded = totalUploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferStats]
  }
  @scala.inline
  implicit class TransferStatsOps[Self <: TransferStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadableSpeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemainingSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondsLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalUploaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalUploaded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

