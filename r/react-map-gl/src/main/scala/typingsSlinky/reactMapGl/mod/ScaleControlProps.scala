package typingsSlinky.reactMapGl.mod

import typingsSlinky.reactMapGl.reactMapGlStrings.imperial
import typingsSlinky.reactMapGl.reactMapGlStrings.metric
import typingsSlinky.reactMapGl.reactMapGlStrings.nautical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleControlProps extends BaseControlProps {
  var maxWidth: js.UndefOr[Double] = js.native
  var unit: js.UndefOr[imperial | metric | nautical] = js.native
}

object ScaleControlProps {
  @scala.inline
  def apply(): ScaleControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleControlProps]
  }
  @scala.inline
  implicit class ScaleControlPropsOps[Self <: ScaleControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: imperial | metric | nautical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

