package typingsSlinky.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Application.
  *
  * [Api set:  1.1]
  */
@js.native
trait ApplicationLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Show or hide the iFrame application borders.
    *
    * [Api set:  1.1]
    */
  var showBorders: js.UndefOr[Boolean] = js.native
  /**
    *
    * Show or hide the standard toolbars.
    *
    * [Api set:  1.1]
    */
  var showToolbars: js.UndefOr[Boolean] = js.native
}

object ApplicationLoadOptions {
  @scala.inline
  def apply(): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
  @scala.inline
  implicit class ApplicationLoadOptionsOps[Self <: ApplicationLoadOptions] (val x: Self) extends AnyVal {
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
    def withShowBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToolbars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolbars")(js.undefined)
        ret
    }
  }
  
}

