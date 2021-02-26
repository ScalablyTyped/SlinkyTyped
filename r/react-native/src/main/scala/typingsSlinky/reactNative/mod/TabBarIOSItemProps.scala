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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarIOSItemProps extends ViewProps {
  
  /**
    * Little red bubble that sits at the top right of the icon.
    */
  var badge: js.UndefOr[String | Double] = js.native
  
  /**
    * Background color for the badge. Available since iOS 10.
    */
  var badgeColor: js.UndefOr[ColorValue] = js.native
  
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
    * Note that if you are using them, the title and selectedIcon will be overridden with the system ones.
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
  implicit class TabBarIOSItemPropsMutableBuilder[Self <: TabBarIOSItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeColor(value: ColorValue): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setIcon(value: ImageURISource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setRenderAsOriginal(value: Boolean): Self = StObject.set(x, "renderAsOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAsOriginalUndefined: Self = StObject.set(x, "renderAsOriginal", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIcon(value: ImageURISource): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSystemIcon(
      value: bookmarks | contacts | downloads | favorites | featured | history | more | `most-recent` | `most-viewed` | recents | search | `top-rated`
    ): Self = StObject.set(x, "systemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemIconUndefined: Self = StObject.set(x, "systemIcon", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
