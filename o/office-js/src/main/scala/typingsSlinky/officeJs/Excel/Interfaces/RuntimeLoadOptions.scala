package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel Runtime class.
  *
  * [Api set: ExcelApi 1.5]
  */
@js.native
trait RuntimeLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.native
}

object RuntimeLoadOptions {
  @scala.inline
  def apply(): RuntimeLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeLoadOptions]
  }
  @scala.inline
  implicit class RuntimeLoadOptionsOps[Self <: RuntimeLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEvents")(js.undefined)
        ret
    }
  }
  
}

