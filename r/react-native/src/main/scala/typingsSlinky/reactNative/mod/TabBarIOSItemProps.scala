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

trait TabBarIOSItemProps extends ViewProps {
  /**
    * Little red bubble that sits at the top right of the icon.
    */
  var badge: js.UndefOr[String | Double] = js.undefined
  /**
    * Background color for the badge. Available since iOS 10.
    */
  var badgeColor: js.UndefOr[String] = js.undefined
  /**
    * A custom icon for the tab. It is ignored when a system icon is defined.
    */
  var icon: js.UndefOr[ImageURISource] = js.undefined
  /**
    * Callback when this tab is being selected,
    * you should change the state of your component to set selected={true}.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If set to true it renders the image as original,
    * it defaults to being displayed as a template
    */
  var renderAsOriginal: js.UndefOr[Boolean] = js.undefined
  /**
    * It specifies whether the children are visible or not. If you see a blank content, you probably forgot to add a selected one.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * A custom icon when the tab is selected.
    * It is ignored when a system icon is defined. If left empty, the icon will be tinted in blue.
    */
  var selectedIcon: js.UndefOr[ImageURISource] = js.undefined
  /**
    * Items comes with a few predefined system icons.
    * Note that if you are using them, the title and selectedIcon will be overriden with the system ones.
    *
    *  enum('bookmarks', 'contacts', 'downloads', 'favorites', 'featured', 'history', 'more', 'most-recent', 'most-viewed', 'recents', 'search', 'top-rated')
    */
  var systemIcon: js.UndefOr[
    bookmarks | contacts | downloads | favorites | featured | history | more | `most-recent` | `most-viewed` | recents | search | `top-rated`
  ] = js.undefined
  /**
    * Text that appears under the icon. It is ignored when a system icon is defined.
    */
  var title: js.UndefOr[String] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBadge(value: String | Double): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setBadgeColor(value: String): Self = this.set("badgeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeColor: Self = this.set("badgeColor", js.undefined)
    @scala.inline
    def setIcon(value: ImageURISource): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setRenderAsOriginal(value: Boolean): Self = this.set("renderAsOriginal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAsOriginal: Self = this.set("renderAsOriginal", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSelectedIcon(value: ImageURISource): Self = this.set("selectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIcon: Self = this.set("selectedIcon", js.undefined)
    @scala.inline
    def setSystemIcon(
      value: bookmarks | contacts | downloads | favorites | featured | history | more | `most-recent` | `most-viewed` | recents | search | `top-rated`
    ): Self = this.set("systemIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemIcon: Self = this.set("systemIcon", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

