package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesOutlierSettings extends js.Object {
  /** Specifies the shape of the outlier.
    * @Default {circle. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.native
  /** Options for customizing the size of the outlier shape.
    */
  var size: js.UndefOr[SeriesOutlierSettingsSize] = js.native
}

object SeriesOutlierSettings {
  @scala.inline
  def apply(): SeriesOutlierSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesOutlierSettings]
  }
  @scala.inline
  implicit class SeriesOutlierSettingsOps[Self <: SeriesOutlierSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShape(value: Shape | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SeriesOutlierSettingsSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

