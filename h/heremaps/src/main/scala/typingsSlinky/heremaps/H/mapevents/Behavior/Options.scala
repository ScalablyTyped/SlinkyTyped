package typingsSlinky.heremaps.H.mapevents.Behavior

import typingsSlinky.heremaps.H.math.BitMask
import typingsSlinky.heremaps.H.util.kinetics.IKinetics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize the Behavior class.
  * @property kinetics {H.util.kinetics.IKinetics=} - The parameters for the kinetic movement.
  * @property enable {number=} - The bitmask of behaviors to enable like H.mapevents.Behavior.DRAGGING. All are enabled by default.
  */
@js.native
trait Options extends js.Object {
  var enable: js.UndefOr[BitMask] = js.native
  var kinetics: js.UndefOr[IKinetics] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: BitMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withKinetics(value: IKinetics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinetics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinetics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinetics")(js.undefined)
        ret
    }
  }
  
}

