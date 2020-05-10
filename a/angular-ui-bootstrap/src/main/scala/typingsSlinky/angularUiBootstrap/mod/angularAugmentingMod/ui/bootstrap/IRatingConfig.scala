package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRatingConfig extends js.Object {
  /**
    * Changes the number of icons.
    *
    * @default: 5
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * A variable used in the template to specify the state for unselected icons.
    *
    * @default: null
    */
  var stateOff: js.UndefOr[String] = js.native
  /**
    * A variable used in the template to specify the state for selected icons.
    *
    * @default: null
    */
  var stateOn: js.UndefOr[String] = js.native
  /**
    * An array of strings defining titles for all icons.
    *
    * @default: ["one", "two", "three", "four", "five"]
    */
  var titles: js.UndefOr[js.Array[String]] = js.native
}

object IRatingConfig {
  @scala.inline
  def apply(): IRatingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRatingConfig]
  }
  @scala.inline
  implicit class IRatingConfigOps[Self <: IRatingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withStateOff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOff")(js.undefined)
        ret
    }
    @scala.inline
    def withStateOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOn")(js.undefined)
        ret
    }
    @scala.inline
    def withTitles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titles")(js.undefined)
        ret
    }
  }
  
}

