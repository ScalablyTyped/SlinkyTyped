package typingsSlinky.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurations extends js.Object {
  /**
    * the CSS class names object
    */
  var classNames: js.UndefOr[ClassnamesConfigurations] = js.native
  /**
    * Whether or not the menu should be cloned (and the original menu kept intact).
    * Default: false
    */
  @JSName("clone")
  var clone_FConfigurations: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds between opening/closing the menu and panels,
    * needed to force CSS transitions.
    * Default: 25
    */
  var openingInterval: js.UndefOr[Double] = js.native
  /**
    * jQuery selector containing the node-type of panels.
    * Default: "div, ul, ol"
    */
  var panelNodetype: js.UndefOr[String] = js.native
  /**
    * The number of milliseconds used in the CSS transitions.
    * Default: 400 (The value should match the associated CSS value.)
    */
  var transitionDuration: js.UndefOr[Double] = js.native
}

object Configurations {
  @scala.inline
  def apply(): Configurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurations]
  }
  @scala.inline
  implicit class ConfigurationsOps[Self <: Configurations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassNames(value: ClassnamesConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withOpeningInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpeningInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelNodetype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelNodetype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelNodetype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelNodetype")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
  }
  
}

