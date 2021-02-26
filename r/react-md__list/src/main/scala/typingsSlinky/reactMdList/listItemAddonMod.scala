package typingsSlinky.reactMdList

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemAddonMod {
  
  object ListItemAddon {
    
    @JSImport("@react-md/list/types/ListItemAddon", "ListItemAddon")
    @js.native
    def apply(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps: ListItemAddonProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/list/types/ListItemAddon", "ListItemAddon.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/list/types/ListItemAddon", "ListItemAddon.propTypes.addon")
      @js.native
      def addon: js.Any = js.native
      
      @JSImport("@react-md/list/types/ListItemAddon", "ListItemAddon.propTypes.addonAfter")
      @js.native
      def addonAfter: js.Any = js.native
      @scala.inline
      def addonAfter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addonAfter")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def addon_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addon")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemAddon", "ListItemAddon.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemAddon", "ListItemAddon.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemAddon", "ListItemAddon.propTypes.forceAddonWrap")
      @js.native
      def forceAddonWrap: js.Any = js.native
      @scala.inline
      def forceAddonWrap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceAddonWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemAddon", "ListItemAddon.propTypes.position")
      @js.native
      def position: js.Any = js.native
      @scala.inline
      def position_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemAddon", "ListItemAddon.propTypes.type")
      @js.native
      val `type`: js.Any = js.native
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdList.reactMdListStrings.top
    - typingsSlinky.reactMdList.reactMdListStrings.middle
    - typingsSlinky.reactMdList.reactMdListStrings.bottom
  */
  trait ListItemAddonPosition extends StObject
  object ListItemAddonPosition {
    
    @scala.inline
    def bottom: typingsSlinky.reactMdList.reactMdListStrings.bottom = "bottom".asInstanceOf[typingsSlinky.reactMdList.reactMdListStrings.bottom]
    
    @scala.inline
    def middle: typingsSlinky.reactMdList.reactMdListStrings.middle = "middle".asInstanceOf[typingsSlinky.reactMdList.reactMdListStrings.middle]
    
    @scala.inline
    def top: typingsSlinky.reactMdList.reactMdListStrings.top = "top".asInstanceOf[typingsSlinky.reactMdList.reactMdListStrings.top]
  }
  
  /* Inlined parent std.Omit<@react-md/icon.@react-md/icon.TextIconSpacingProps, 'icon' | 'iconAfter' | 'forceIconWrap'> */
  @js.native
  trait ListItemAddonProps extends StObject {
    
    var aboveClassName: js.UndefOr[String] = js.native
    
    /**
      * The addon that should be rendered.
      */
    var addon: ReactElement = js.native
    
    /**
      * Boolean if the addon should appear after the `children`.
      */
    var addonAfter: js.UndefOr[Boolean] = js.native
    
    var afterClassName: js.UndefOr[String] = js.native
    
    var beforeClassName: js.UndefOr[String] = js.native
    
    var belowClassName: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the addon should be forced into a `<span>` with the class names
      * applied instead of attempting to clone into the provided icon. If the
      * `type` is set to `"media"` or `"large-media"`, this will default to `true`.
      */
    var forceAddonWrap: js.UndefOr[Boolean] = js.native
    
    /**
      * The vertical position to use for the addon.
      */
    var position: js.UndefOr[ListItemAddonPosition] = js.native
    
    var stacked: js.UndefOr[Boolean] = js.native
    
    /**
      * The addon type that is used to adjust the spacing styles.
      */
    var `type`: js.UndefOr[ListItemAddonType] = js.native
  }
  object ListItemAddonProps {
    
    @scala.inline
    def apply(): ListItemAddonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemAddonProps]
    }
    
    @scala.inline
    implicit class ListItemAddonPropsMutableBuilder[Self <: ListItemAddonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAboveClassName(value: String): Self = StObject.set(x, "aboveClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboveClassNameUndefined: Self = StObject.set(x, "aboveClassName", js.undefined)
      
      @scala.inline
      def setAddon(value: ReactElement): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonAfter(value: Boolean): Self = StObject.set(x, "addonAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonAfterUndefined: Self = StObject.set(x, "addonAfter", js.undefined)
      
      @scala.inline
      def setAddonReactElement(value: ReactElement): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
      
      @scala.inline
      def setAfterClassName(value: String): Self = StObject.set(x, "afterClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterClassNameUndefined: Self = StObject.set(x, "afterClassName", js.undefined)
      
      @scala.inline
      def setBeforeClassName(value: String): Self = StObject.set(x, "beforeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeClassNameUndefined: Self = StObject.set(x, "beforeClassName", js.undefined)
      
      @scala.inline
      def setBelowClassName(value: String): Self = StObject.set(x, "belowClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBelowClassNameUndefined: Self = StObject.set(x, "belowClassName", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
      @scala.inline
      def setPosition(value: ListItemAddonPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      @scala.inline
      def setType(value: ListItemAddonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdList.reactMdListStrings.icon
    - typingsSlinky.reactMdList.reactMdListStrings.avatar
    - typingsSlinky.reactMdList.reactMdListStrings.media
    - typingsSlinky.reactMdList.reactMdListStrings.`large-media`
  */
  trait ListItemAddonType extends StObject
  object ListItemAddonType {
    
    @scala.inline
    def avatar: typingsSlinky.reactMdList.reactMdListStrings.avatar = "avatar".asInstanceOf[typingsSlinky.reactMdList.reactMdListStrings.avatar]
    
    @scala.inline
    def icon: typingsSlinky.reactMdList.reactMdListStrings.icon = "icon".asInstanceOf[typingsSlinky.reactMdList.reactMdListStrings.icon]
    
    @scala.inline
    def `large-media`: typingsSlinky.reactMdList.reactMdListStrings.`large-media` = "large-media".asInstanceOf[typingsSlinky.reactMdList.reactMdListStrings.`large-media`]
    
    @scala.inline
    def media: typingsSlinky.reactMdList.reactMdListStrings.media = "media".asInstanceOf[typingsSlinky.reactMdList.reactMdListStrings.media]
  }
}
