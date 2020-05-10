package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartColorRampProperties extends ColorRampProperties {
  /**
    * Define an array of algorithmic color ramps used to generate the multi part ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-MultipartColorRamp.html#colorRamps)
    */
  var colorRamps: js.UndefOr[js.Array[AlgorithmicColorRampProperties]] = js.native
}

object MultipartColorRampProperties {
  @scala.inline
  def apply(): MultipartColorRampProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartColorRampProperties]
  }
  @scala.inline
  implicit class MultipartColorRampPropertiesOps[Self <: MultipartColorRampProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorRamps(value: js.Array[AlgorithmicColorRampProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRamps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRamps")(js.undefined)
        ret
    }
  }
  
}

