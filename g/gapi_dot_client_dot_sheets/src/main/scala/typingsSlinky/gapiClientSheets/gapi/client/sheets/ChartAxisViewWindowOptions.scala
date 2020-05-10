package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAxisViewWindowOptions extends js.Object {
  /**
    * The maximum numeric value to be shown in this view window. If unset, will
    * automatically determine a maximum value that looks good for the data.
    */
  var viewWindowMax: js.UndefOr[Double] = js.native
  /**
    * The minimum numeric value to be shown in this view window. If unset, will
    * automatically determine a minimum value that looks good for the data.
    */
  var viewWindowMin: js.UndefOr[Double] = js.native
  /** The view window's mode. */
  var viewWindowMode: js.UndefOr[String] = js.native
}

object ChartAxisViewWindowOptions {
  @scala.inline
  def apply(): ChartAxisViewWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisViewWindowOptions]
  }
  @scala.inline
  implicit class ChartAxisViewWindowOptionsOps[Self <: ChartAxisViewWindowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewWindowMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewWindowMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewWindowMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewWindowMax")(js.undefined)
        ret
    }
    @scala.inline
    def withViewWindowMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewWindowMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewWindowMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewWindowMin")(js.undefined)
        ret
    }
    @scala.inline
    def withViewWindowMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewWindowMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewWindowMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewWindowMode")(js.undefined)
        ret
    }
  }
  
}

