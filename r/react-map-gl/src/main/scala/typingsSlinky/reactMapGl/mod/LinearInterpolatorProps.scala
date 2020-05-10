package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearInterpolatorProps extends js.Object {
  var around: js.UndefOr[js.Array[Double]] = js.native
  var transitionProps: js.UndefOr[js.Array[String]] = js.native
}

object LinearInterpolatorProps {
  @scala.inline
  def apply(): LinearInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearInterpolatorProps]
  }
  @scala.inline
  implicit class LinearInterpolatorPropsOps[Self <: LinearInterpolatorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAround(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("around")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("around")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionProps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionProps")(js.undefined)
        ret
    }
  }
  
}

