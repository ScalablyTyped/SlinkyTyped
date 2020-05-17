package typingsSlinky.reactMosaicComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimumPaneSizePercentage extends js.Object {
  var minimumPaneSizePercentage: Double = js.native
  def onChange(): js.UndefOr[scala.Nothing] = js.native
  def onRelease(): js.UndefOr[scala.Nothing] = js.native
}

object MinimumPaneSizePercentage {
  @scala.inline
  def apply(
    minimumPaneSizePercentage: Double,
    onChange: () => js.UndefOr[scala.Nothing],
    onRelease: () => js.UndefOr[scala.Nothing]
  ): MinimumPaneSizePercentage = {
    val __obj = js.Dynamic.literal(minimumPaneSizePercentage = minimumPaneSizePercentage.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onRelease = js.Any.fromFunction0(onRelease))
    __obj.asInstanceOf[MinimumPaneSizePercentage]
  }
  @scala.inline
  implicit class MinimumPaneSizePercentageOps[Self <: MinimumPaneSizePercentage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimumPaneSizePercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPaneSizePercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnRelease(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

