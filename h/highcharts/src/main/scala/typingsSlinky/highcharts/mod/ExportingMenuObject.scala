package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportingMenuObject extends js.Object {
  /**
    * The click handler for the menu item.
    */
  var onclick: js.UndefOr[EventCallbackFunction[Chart_]] = js.native
  /**
    * Indicates a separator line instead of an item.
    */
  var separator: js.UndefOr[Boolean] = js.native
  /**
    * The text for the menu item.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * If internationalization is required, the key to a language string.
    */
  var textKey: js.UndefOr[String] = js.native
}

object ExportingMenuObject {
  @scala.inline
  def apply(): ExportingMenuObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingMenuObject]
  }
  @scala.inline
  implicit class ExportingMenuObjectOps[Self <: ExportingMenuObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnclick(value: EventCallbackFunction[Chart_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textKey")(js.undefined)
        ret
    }
  }
  
}

