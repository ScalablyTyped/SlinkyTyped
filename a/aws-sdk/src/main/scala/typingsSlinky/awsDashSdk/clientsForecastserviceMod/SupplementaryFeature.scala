package typingsSlinky.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupplementaryFeature extends js.Object {
  /**
    * The name of the feature. This must be "holiday".
    */
  var Name: typingsSlinky.awsDashSdk.clientsForecastserviceMod.Name = js.native
  /**
    * One of the following 2 letter country codes:   "AU" - AUSTRALIA   "DE" - GERMANY   "JP" - JAPAN   "US" - UNITED_STATES   "UK" - UNITED_KINGDOM  
    */
  var Value: typingsSlinky.awsDashSdk.clientsForecastserviceMod.Value = js.native
}

object SupplementaryFeature {
  @scala.inline
  def apply(Name: Name, Value: Value): SupplementaryFeature = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SupplementaryFeature]
  }
}

