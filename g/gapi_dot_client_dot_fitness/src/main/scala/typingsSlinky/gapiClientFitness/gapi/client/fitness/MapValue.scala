package typingsSlinky.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapValue extends js.Object {
  /** Floating point value. */
  var fpVal: js.UndefOr[Double] = js.native
}

object MapValue {
  @scala.inline
  def apply(): MapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapValue]
  }
  @scala.inline
  implicit class MapValueOps[Self <: MapValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFpVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpVal")(js.undefined)
        ret
    }
  }
  
}

