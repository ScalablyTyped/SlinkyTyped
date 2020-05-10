package typingsSlinky.reactToolbox.buttonBrowseButtonMod

import typingsSlinky.reactToolbox.buttonBaseMod.ButtonBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowseButtonProps extends ButtonBaseProps {
  /**
    * If true, the button will have a flat look.
    * @default false
    */
  var flat: js.UndefOr[Boolean] = js.native
  /**
    * If true, the button will have a floating look.
    * @default false
    */
  var floating: js.UndefOr[Boolean] = js.native
  /**
    * Creates a link for the button.
    */
  var href: js.UndefOr[String] = js.native
  /**
    * The text string to use for the name of the button.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * To be used with floating button. If true, the button will be smaller.
    * @default false
    */
  var mini: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * If true, the button will have a raised look.
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[BrowseButtonTheme] = js.native
}

object BrowseButtonProps {
  @scala.inline
  def apply(): BrowseButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowseButtonProps]
  }
  @scala.inline
  implicit class BrowseButtonPropsOps[Self <: BrowseButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(js.undefined)
        ret
    }
    @scala.inline
    def withFloating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMini(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMini: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRaised(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raised")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaised: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raised")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: BrowseButtonTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

