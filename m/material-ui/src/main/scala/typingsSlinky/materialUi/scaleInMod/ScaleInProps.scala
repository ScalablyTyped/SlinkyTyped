package typingsSlinky.materialUi.scaleInMod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleInProps extends Props[ScaleIn] {
  var childStyle: js.UndefOr[CSSProperties] = js.native
  var enterDelay: js.UndefOr[Double] = js.native
  var maxScale: js.UndefOr[Double] = js.native
  var minScale: js.UndefOr[Double] = js.native
}

object ScaleInProps {
  @scala.inline
  def apply(): ScaleInProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleInProps]
  }
  @scala.inline
  implicit class ScaleInPropsOps[Self <: ScaleInProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(js.undefined)
        ret
    }
  }
  
}

