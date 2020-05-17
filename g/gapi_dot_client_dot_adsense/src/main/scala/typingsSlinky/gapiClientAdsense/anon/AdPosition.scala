package typingsSlinky.gapiClientAdsense.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdPosition extends js.Object {
  /** The position of the ads relative to the feed entries. */
  var adPosition: js.UndefOr[String] = js.native
  /** The frequency at which ads should appear in the feed (i.e. every N entries). */
  var frequency: js.UndefOr[Double] = js.native
  /** The minimum length an entry should be in order to have attached ads. */
  var minimumWordCount: js.UndefOr[Double] = js.native
  /** The type of ads which should appear. */
  var `type`: js.UndefOr[String] = js.native
}

object AdPosition {
  @scala.inline
  def apply(): AdPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdPosition]
  }
  @scala.inline
  implicit class AdPositionOps[Self <: AdPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumWordCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumWordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWordCount")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

