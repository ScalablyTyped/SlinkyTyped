package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.`most-recent`
import typingsSlinky.reactNative.reactNativeStrings.`most-viewed`
import typingsSlinky.reactNative.reactNativeStrings.`top-rated`
import typingsSlinky.reactNative.reactNativeStrings.bookmarks
import typingsSlinky.reactNative.reactNativeStrings.contacts
import typingsSlinky.reactNative.reactNativeStrings.downloads
import typingsSlinky.reactNative.reactNativeStrings.favorites
import typingsSlinky.reactNative.reactNativeStrings.featured
import typingsSlinky.reactNative.reactNativeStrings.history
import typingsSlinky.reactNative.reactNativeStrings.more
import typingsSlinky.reactNative.reactNativeStrings.recents
import typingsSlinky.reactNative.reactNativeStrings.search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarIOSItemProps extends ViewProps {
  /**
    * Little red bubble that sits at the top right of the icon.
    */
  var badge: js.UndefOr[String | Double] = js.native
  /**
    * Background color for the badge. Available since iOS 10.
    */
  var badgeColor: js.UndefOr[String] = js.native
  /**
    * A custom icon for the tab. It is ignored when a system icon is defined.
    */
  var icon: js.UndefOr[ImageURISource] = js.native
  /**
    * Callback when this tab is being selected,
    * you should change the state of your component to set selected={true}.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If set to true it renders the image as original,
    * it defaults to being displayed as a template
    */
  var renderAsOriginal: js.UndefOr[Boolean] = js.native
  /**
    * It specifies whether the children are visible or not. If you see a blank content, you probably forgot to add a selected one.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * A custom icon when the tab is selected.
    * It is ignored when a system icon is defined. If left empty, the icon will be tinted in blue.
    */
  var selectedIcon: js.UndefOr[ImageURISource] = js.native
  /**
    * Items comes with a few predefined system icons.
    * Note that if you are using them, the title and selectedIcon will be overriden with the system ones.
    *
    *  enum('bookmarks', 'contacts', 'downloads', 'favorites', 'featured', 'history', 'more', 'most-recent', 'most-viewed', 'recents', 'search', 'top-rated')
    */
  var systemIcon: js.UndefOr[
    bookmarks | contacts | downloads | favorites | featured | history | more | `most-recent` | `most-viewed` | recents | search | `top-rated`
  ] = js.native
  /**
    * Text that appears under the icon. It is ignored when a system icon is defined.
    */
  var title: js.UndefOr[String] = js.native
}

object TabBarIOSItemProps {
  @scala.inline
  def apply(): TabBarIOSItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarIOSItemProps]
  }
  @scala.inline
  implicit class TabBarIOSItemPropsOps[Self <: TabBarIOSItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAsOriginal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAsOriginal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAsOriginal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAsOriginal")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIcon(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemIcon(
      value: bookmarks | contacts | downloads | favorites | featured | history | more | `most-recent` | `most-viewed` | recents | search | `top-rated`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemIcon")(js.undefined)
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
  }
  
}

