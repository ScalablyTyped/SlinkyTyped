package typingsSlinky.modularScale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModularScaleOptions extends js.Object {
  /** The base font size (in pixels) to use for the type scale. Defaults to 16 */
  var base: js.UndefOr[Double | String] = js.native
  /** The ratio to use in the generated type scale function. Defaults to ModularScaleRatio.goldenSection */
  var ratio: js.UndefOr[Double] = js.native
}

object ModularScaleOptions {
  @scala.inline
  def apply(): ModularScaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModularScaleOptions]
  }
  @scala.inline
  implicit class ModularScaleOptionsOps[Self <: ModularScaleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(js.undefined)
        ret
    }
  }
  
}

