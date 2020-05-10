package typingsSlinky.expressValidator.matchedDataMod

import typingsSlinky.expressValidator.baseMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchedDataOptions extends js.Object {
  var includeOptionals: Boolean = js.native
  var locations: js.Array[Location] = js.native
  var onlyValidData: Boolean = js.native
}

object MatchedDataOptions {
  @scala.inline
  def apply(includeOptionals: Boolean, locations: js.Array[Location], onlyValidData: Boolean): MatchedDataOptions = {
    val __obj = js.Dynamic.literal(includeOptionals = includeOptionals.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], onlyValidData = onlyValidData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedDataOptions]
  }
  @scala.inline
  implicit class MatchedDataOptionsOps[Self <: MatchedDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeOptionals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOptionals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyValidData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyValidData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

