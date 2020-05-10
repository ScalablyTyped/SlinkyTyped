package typingsSlinky.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeatures extends js.Object {
  /** Description of the input features in the data set. */
  var features: js.UndefOr[js.Array[AnonCategorical]] = js.native
  /** Description of the output value or label. */
  var outputFeature: js.UndefOr[AnonNumeric] = js.native
}

object AnonFeatures {
  @scala.inline
  def apply(): AnonFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFeatures]
  }
  @scala.inline
  implicit class AnonFeaturesOps[Self <: AnonFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[AnonCategorical]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFeature(value: AnonNumeric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFeature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFeature")(js.undefined)
        ret
    }
  }
  
}

