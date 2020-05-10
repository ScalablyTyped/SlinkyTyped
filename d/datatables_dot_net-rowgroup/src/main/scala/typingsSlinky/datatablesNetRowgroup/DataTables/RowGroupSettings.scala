package typingsSlinky.datatablesNetRowgroup.DataTables

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.datatablesNet.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * RowGroup extension options
	 */
@js.native
trait RowGroupSettings extends js.Object {
  /**
  		 * Set the class name to be used for the grouping rows
  		 */
  var className: js.UndefOr[String] = js.native
  /**
  		 * Set the data point to use as the grouping data source
  		 */
  var dataSrc: js.UndefOr[Double | String] = js.native
  /**
  		 * Provides the ability to disable row grouping at initialisation
  		 */
  var enable: js.UndefOr[Boolean] = js.native
  /**
  		 * Set the class name to be used for the grouping end rows
  		 */
  var endClassName: js.UndefOr[String] = js.native
  /**
  		 * Provide a function that can be used to control the data shown in the end grouping row
  		 */
  var endRender: js.UndefOr[js.Function2[/* rows */ Api, /* group */ String, String | HTMLElement | JQuery]] = js.native
  /**
  		 * Provide a function that can be used to control the data shown in the start grouping row
  		 */
  var startRender: js.UndefOr[js.Function2[/* rows */ Api, /* group */ String, String | HTMLElement | JQuery]] = js.native
}

object RowGroupSettings {
  @scala.inline
  def apply(): RowGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowGroupSettings]
  }
  @scala.inline
  implicit class RowGroupSettingsOps[Self <: RowGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSrc(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEndClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEndRender(value: (/* rows */ Api, /* group */ String) => String | HTMLElement | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEndRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRender")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRender(value: (/* rows */ Api, /* group */ String) => String | HTMLElement | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStartRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRender")(js.undefined)
        ret
    }
  }
  
}

