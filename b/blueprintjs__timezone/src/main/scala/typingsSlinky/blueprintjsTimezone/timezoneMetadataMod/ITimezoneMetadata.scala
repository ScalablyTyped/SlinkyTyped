package typingsSlinky.blueprintjsTimezone.timezoneMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimezoneMetadata extends js.Object {
  var abbreviation: js.UndefOr[String] = js.native
  var offset: Double = js.native
  var offsetAsString: String = js.native
  var population: js.UndefOr[Double] = js.native
  var timezone: String = js.native
}

object ITimezoneMetadata {
  @scala.inline
  def apply(offset: Double, offsetAsString: String, timezone: String): ITimezoneMetadata = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], offsetAsString = offsetAsString.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimezoneMetadata]
  }
  @scala.inline
  implicit class ITimezoneMetadataOps[Self <: ITimezoneMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetAsString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetAsString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbbreviation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbbreviation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviation")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("population")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("population")(js.undefined)
        ret
    }
  }
  
}

