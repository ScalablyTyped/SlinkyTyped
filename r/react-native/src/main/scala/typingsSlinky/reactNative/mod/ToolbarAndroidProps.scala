package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarAndroidProps extends ViewProps {
  /**
    * Sets possible actions on the toolbar as part of the action menu. These are displayed as icons
    * or text on the right side of the widget. If they don't fit they are placed in an 'overflow'
    * menu.
    *
    * This property takes an array of objects, where each object has the following keys:
    *
    * * `title`: **required**, the title of this action
    * * `icon`: the icon for this action, e.g. `require('./some_icon.png')`
    * * `show`: when to show this action as an icon or hide it in the overflow menu: `always`,
    * `ifRoom` or `never`
    * * `showWithText`: boolean, whether to show text alongside the icon or not
    */
  var actions: js.UndefOr[js.Array[ToolbarAndroidAction]] = js.native
  /**
    * Sets the content inset for the toolbar ending edge.
    * The content inset affects the valid area for Toolbar content other
    * than the navigation button and menu. Insets define the minimum
    * margin for these components and can be used to effectively align
    * Toolbar content along well-known gridlines.
    */
  var contentInsetEnd: js.UndefOr[Double] = js.native
  /**
    * Sets the content inset for the toolbar starting edge.
    * The content inset affects the valid area for Toolbar content
    * other than the navigation button and menu. Insets define the
    * minimum margin for these components and can be used to effectively
    * align Toolbar content along well-known gridlines.
    */
  var contentInsetStart: js.UndefOr[Double] = js.native
  /**
    * Sets the toolbar logo.
    */
  var logo: js.UndefOr[ImageURISource] = js.native
  /**
    * Sets the navigation icon.
    */
  var navIcon: js.UndefOr[ImageURISource] = js.native
  /**
    * Callback that is called when an action is selected. The only
    * argument that is passed to the callback is the position of the
    * action in the actions array.
    */
  var onActionSelected: js.UndefOr[js.Function1[/* position */ Double, Unit]] = js.native
  /**
    * Callback called when the icon is selected.
    */
  var onIconClicked: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Sets the overflow icon.
    */
  var overflowIcon: js.UndefOr[ImageURISource] = js.native
  /**
    * Used to set the toolbar direction to RTL.
    * In addition to this property you need to add
    * android:supportsRtl="true"
    * to your application AndroidManifest.xml and then call
    * setLayoutDirection(LayoutDirection.RTL) in your MainActivity
    * onCreate method.
    */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
    * Sets the toolbar subtitle.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * Sets the toolbar subtitle color.
    */
  var subtitleColor: js.UndefOr[String] = js.native
  /**
    * Sets the toolbar title.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Sets the toolbar title color.
    */
  var titleColor: js.UndefOr[String] = js.native
}

object ToolbarAndroidProps {
  @scala.inline
  def apply(): ToolbarAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarAndroidProps]
  }
  @scala.inline
  implicit class ToolbarAndroidPropsOps[Self <: ToolbarAndroidProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[ToolbarAndroidAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withContentInsetEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInsetEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentInsetEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInsetEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withContentInsetStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInsetStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentInsetStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInsetStart")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withNavIcon(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActionSelected(value: /* position */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActionSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIconClicked(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIconClicked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnIconClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIconClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowIcon(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(js.undefined)
        ret
    }
  }
  
}

