package typingsSlinky.reactMdAppBar

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarMod {
  
  @JSImport("@react-md/app-bar/types/AppBar", "AppBar")
  @js.native
  val AppBar: ForwardRefExoticComponent[AppBarProps with RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.none
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.normal
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.prominent
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.dense
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.`prominent-dense`
  */
  trait AppBarHeight extends StObject
  object AppBarHeight {
    
    @scala.inline
    def dense: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.dense = "dense".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.dense]
    
    @scala.inline
    def none: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.none = "none".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.none]
    
    @scala.inline
    def normal: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.normal = "normal".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.normal]
    
    @scala.inline
    def prominent: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.prominent = "prominent".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.prominent]
    
    @scala.inline
    def `prominent-dense`: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.`prominent-dense` = "prominent-dense".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.`prominent-dense`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.top
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.bottom
  */
  trait AppBarPosition extends StObject
  object AppBarPosition {
    
    @scala.inline
    def bottom: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.bottom = "bottom".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.bottom]
    
    @scala.inline
    def top: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.top = "top".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.top]
  }
  
  @js.native
  trait AppBarProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * The component for the `AppBar` to render as. This should normally either
      * just be the default `"header"` or a `"div"` component.
      *
      * It is generally recommended to not provide other React components for this
      * prop even though it is possible since it leads to bad practice and props
      * might not get passed as one would expect.
      */
    var component: js.UndefOr[ReactElement] = js.native
    
    /**
      * Boolean if the `AppBar` should be fixed to the top or bottom of the page.
      */
    var fixed: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the fixed `AppBar` should gain elevation. This is recommended to
      * stay enabled unless you manually apply a border to help separate the
      * `AppBar` from other content.
      */
    var fixedElevation: js.UndefOr[Boolean] = js.native
    
    /**
      * The position within the page to "fix" the `AppBar` when the `fixed` prop is
      * enabled.
      */
    var fixedPosition: js.UndefOr[AppBarPosition] = js.native
    
    /**
      * Boolean if the content of the `AppBar` should be allowed to wrap. When this
      * is omitted, it will be considered true for `"none"`, `"prominent"` and
      * `"prominent-dense"` heights
      */
    var flexWrap: js.UndefOr[Boolean] = js.native
    
    /**
      * The height to use for the app bar. See the `AppBarHeight` type for more
      * information.
      */
    var height: js.UndefOr[AppBarHeight] = js.native
    
    /**
      * Boolean if the `AppBarNav`, `AppBarTitle`, and `AppBarActions` should
      * inherit the color that for the provided `theme`. If this value is
      * `undefined`, the color will only be inherited when the theme is set to
      * `primary` or `secondary`. However if this value is a boolean, it will be
      * used instead. So if you set this to `false` and set the `theme` to
      * `"primary"`, the defined primary text color will not be inherited.
      */
    var inheritColor: js.UndefOr[Boolean] = js.native
    
    /**
      * The theme to apply to the `AppBar`.
      */
    var theme: js.UndefOr[AppBarTheme] = js.native
  }
  object AppBarProps {
    
    @scala.inline
    def apply(): AppBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarProps]
    }
    
    @scala.inline
    implicit class AppBarPropsMutableBuilder[Self <: AppBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedElevation(value: Boolean): Self = StObject.set(x, "fixedElevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedElevationUndefined: Self = StObject.set(x, "fixedElevation", js.undefined)
      
      @scala.inline
      def setFixedPosition(value: AppBarPosition): Self = StObject.set(x, "fixedPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedPositionUndefined: Self = StObject.set(x, "fixedPosition", js.undefined)
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFlexWrap(value: Boolean): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      @scala.inline
      def setHeight(value: AppBarHeight): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInheritColor(value: Boolean): Self = StObject.set(x, "inheritColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritColorUndefined: Self = StObject.set(x, "inheritColor", js.undefined)
      
      @scala.inline
      def setTheme(value: AppBarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.clear
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.primary
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.secondary
    - typingsSlinky.reactMdAppBar.reactMdAppBarStrings.default
  */
  trait AppBarTheme extends StObject
  object AppBarTheme {
    
    @scala.inline
    def default: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.default = "default".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.default]
    
    @scala.inline
    def clear: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.clear = "clear".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.clear]
    
    @scala.inline
    def primary: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.primary = "primary".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.primary]
    
    @scala.inline
    def secondary: typingsSlinky.reactMdAppBar.reactMdAppBarStrings.secondary = "secondary".asInstanceOf[typingsSlinky.reactMdAppBar.reactMdAppBarStrings.secondary]
  }
}
