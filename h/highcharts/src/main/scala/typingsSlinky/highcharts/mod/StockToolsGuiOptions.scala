package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * toolbar items. Each name refers to unique key from definitions object.
    */
  var buttons: js.UndefOr[js.Array[_]] = js.native
  /**
    * (Highstock) A CSS class name to apply to the stocktools' div, allowing
    * unique CSS styling for each chart.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highstock) An options object of the buttons definitions. Each name
    * refers to unique key from buttons array.
    */
  var definitions: js.UndefOr[js.Object | StockToolsGuiDefinitionsOptions] = js.native
  /**
    * (Highstock) Enable or disable the stockTools gui.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) A CSS class name to apply to the container of buttons,
    * allowing unique CSS styling for each chart.
    */
  var toolbarClassName: js.UndefOr[String] = js.native
}

object StockToolsGuiOptions {
  @scala.inline
  def apply(): StockToolsGuiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiOptions]
  }
  @scala.inline
  implicit class StockToolsGuiOptionsOps[Self <: StockToolsGuiOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
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
    def withDefinitions(value: js.Object | StockToolsGuiDefinitionsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClassName")(js.undefined)
        ret
    }
  }
  
}

