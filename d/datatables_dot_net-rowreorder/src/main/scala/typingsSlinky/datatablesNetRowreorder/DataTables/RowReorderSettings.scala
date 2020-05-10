package typingsSlinky.datatablesNetRowreorder.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowReorderSettings extends js.Object {
  /**
    * Configure the data point that will be used for the reordering data
    */
  var dataSrc: js.UndefOr[String] = js.native
  /**
    * Attach an Editor instance for database updating
    */
  var editor: js.UndefOr[js.Any] = js.native
  /**
    * Enable / disable RowReorder's user interaction
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Set the options for the Editor form when submitting data
    */
  var formOptions: js.UndefOr[js.Any] = js.native
  /**
    * Define the selector used to pick the elements that will start a drag
    */
  var selector: js.UndefOr[String] = js.native
  /**
    * Horizontal position control of the row being dragged
    */
  var snapX: js.UndefOr[Double | Boolean] = js.native
  /**
    * Control automatic of data when a row is dropped
    */
  var update: js.UndefOr[Boolean] = js.native
}

object RowReorderSettings {
  @scala.inline
  def apply(): RowReorderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowReorderSettings]
  }
  @scala.inline
  implicit class RowReorderSettingsOps[Self <: RowReorderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSrc(value: String): Self = {
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
    def withEditor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
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
    def withFormOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapX(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapX")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

