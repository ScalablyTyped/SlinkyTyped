package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriangulationStatusChangedEventUIParam extends js.Object {
  /**
  	 * Used to get current status.
  	 */
  var currentStatus: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to map object.
  	 */
  var map: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to current series object.
  	 */
  var series: js.UndefOr[js.Any] = js.native
}

object TriangulationStatusChangedEventUIParam {
  @scala.inline
  def apply(): TriangulationStatusChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriangulationStatusChangedEventUIParam]
  }
  @scala.inline
  implicit class TriangulationStatusChangedEventUIParamOps[Self <: TriangulationStatusChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
  }
  
}

