package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.ltr
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsLayout extends js.Object {
  /**
    * Set the screen background color
    */
  var backgroundColor: js.UndefOr[Color] = js.native
  /**
    * Set background color only for components, helps reduce overdraw if background color is set in default options.
    * #### (Android specific)
    */
  var componentBackgroundColor: js.UndefOr[Color] = js.native
  /**
    * Set language direction.
    * only works with DefaultOptions
    */
  var direction: js.UndefOr[rtl | ltr] = js.native
  /**
    * Set the allowed orientations
    */
  var orientation: js.UndefOr[js.Array[LayoutOrientation]] = js.native
  /**
    * Layout top margin
    * #### (Android specific)
    */
  var topMargin: js.UndefOr[Double] = js.native
}

object OptionsLayout {
  @scala.inline
  def apply(): OptionsLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsLayout]
  }
  @scala.inline
  implicit class OptionsLayoutOps[Self <: OptionsLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: rtl | ltr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: js.Array[LayoutOrientation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(js.undefined)
        ret
    }
  }
  
}

