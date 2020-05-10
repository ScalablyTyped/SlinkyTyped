package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartAnnotationConfig extends dxChartCommonAnnotationConfig {
  /** Specifies the annotation's name. */
  var name: js.UndefOr[String] = js.native
}

object dxChartAnnotationConfig {
  @scala.inline
  def apply(): dxChartAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartAnnotationConfig]
  }
  @scala.inline
  implicit class dxChartAnnotationConfigOps[Self <: dxChartAnnotationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

