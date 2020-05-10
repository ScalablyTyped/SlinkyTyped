package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineOptions extends js.Object {
  /** Pass the high point color to create sparkline
    */
  var highPointColor: js.UndefOr[String] = js.native
  /** Pass the marker settings object to create sparkline
    */
  var markerSettings: js.UndefOr[js.Any] = js.native
  /** Pass the negative point color to create sparkline
    */
  var negativePointColor: js.UndefOr[String] = js.native
  /** Pass the start point color to create sparkline
    */
  var startPointColor: js.UndefOr[String] = js.native
}

object SparklineOptions {
  @scala.inline
  def apply(): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineOptions]
  }
  @scala.inline
  implicit class SparklineOptionsOps[Self <: SparklineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighPointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highPointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighPointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highPointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativePointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativePointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativePointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativePointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPointColor")(js.undefined)
        ret
    }
  }
  
}

