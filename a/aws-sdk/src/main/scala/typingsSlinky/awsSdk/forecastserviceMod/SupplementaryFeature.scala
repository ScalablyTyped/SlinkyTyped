package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupplementaryFeature extends js.Object {
  /**
    * The name of the feature. This must be "holiday".
    */
  var Name: typingsSlinky.awsSdk.forecastserviceMod.Name = js.native
  /**
    * One of the following 2 letter country codes:   "AU" - AUSTRALIA   "DE" - GERMANY   "JP" - JAPAN   "US" - UNITED_STATES   "UK" - UNITED_KINGDOM  
    */
  var Value: typingsSlinky.awsSdk.forecastserviceMod.Value = js.native
}

object SupplementaryFeature {
  @scala.inline
  def apply(Name: Name, Value: Value): SupplementaryFeature = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplementaryFeature]
  }
  @scala.inline
  implicit class SupplementaryFeatureOps[Self <: SupplementaryFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

