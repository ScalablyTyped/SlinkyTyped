package typingsSlinky.reactFlagIconCss

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.csstype.mod.Properties
import typingsSlinky.csstype.mod.PropertiesHyphen
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactFlagIconCss.anon.ReadonlyFlagIconOptions
import typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-flag-icon-css", JSImport.Default)
  @js.native
  def default(react: js.Any): Instantiable0[FlagIcon] = js.native
  @JSImport("react-flag-icon-css", JSImport.Default)
  @js.native
  def default(react: js.Any, opts: ReadonlyFlagIconOptions): Instantiable0[FlagIcon] = js.native
  
  @JSImport("react-flag-icon-css", "CustomFlagIconFactory")
  @js.native
  def CustomFlagIconFactory(react: js.Any): Instantiable0[FlagIcon] = js.native
  @JSImport("react-flag-icon-css", "CustomFlagIconFactory")
  @js.native
  def CustomFlagIconFactory(react: js.Any, opts: ReadonlyFlagIconOptions): Instantiable0[FlagIcon] = js.native
  
  @JSImport("react-flag-icon-css", "FlagIcon")
  @js.native
  class FlagIcon protected ()
    extends PureComponent[FlagIconProps, js.Object, js.Any] {
    def this(props: FlagIconProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FlagIconProps, context: js.Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.horizontal
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.vertical
  */
  trait FlagIconFlip extends StObject
  object FlagIconFlip {
    
    @scala.inline
    def horizontal: typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.horizontal]
    
    @scala.inline
    def vertical: typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.vertical = "vertical".asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.vertical]
  }
  
  @js.native
  trait FlagIconOptions extends StObject {
    
    /**
      * An object literal whose keys are your custom codes.
      */
    var customCodes: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Set this if useCssModules is true and a) you want to apply styles to FlagIcon
      * using .theme-base and/or b) you are using custom flags.
      */
    var themeStyles: js.UndefOr[
        StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])]
      ] = js.native
    
    /**
      * Use CSS modules styles (your module bundler must be correctly setup).
      */
    var useCssModules: js.UndefOr[Boolean] = js.native
  }
  object FlagIconOptions {
    
    @scala.inline
    def apply(): FlagIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagIconOptions]
    }
    
    @scala.inline
    implicit class FlagIconOptionsMutableBuilder[Self <: FlagIconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomCodes(value: StringDictionary[String]): Self = StObject.set(x, "customCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCodesUndefined: Self = StObject.set(x, "customCodes", js.undefined)
      
      @scala.inline
      def setThemeStyles(value: StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])]): Self = StObject.set(x, "themeStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeStylesUndefined: Self = StObject.set(x, "themeStyles", js.undefined)
      
      @scala.inline
      def setUseCssModules(value: Boolean): Self = StObject.set(x, "useCssModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssModulesUndefined: Self = StObject.set(x, "useCssModules", js.undefined)
    }
  }
  
  @js.native
  trait FlagIconProps extends StObject {
    
    var Component: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * This is always appended as-is to class in the HTML.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * ISO 3166-1-alpha-2 code.
      */
    var code: String = js.native
    
    var flip: js.UndefOr[FlagIconFlip] = js.native
    
    var rotate: js.UndefOr[FlagIconRotate] = js.native
    
    var size: js.UndefOr[FlagIconSize] = js.native
    
    /**
      *     Uses the 1x1 image if true.
      */
    var squared: js.UndefOr[Boolean] = js.native
    
    /**
      * This is mapped to a CSS module and appended to class in the HTML.
      */
    var styleName: js.UndefOr[String] = js.native
  }
  object FlagIconProps {
    
    @scala.inline
    def apply(code: String): FlagIconProps = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlagIconProps]
    }
    
    @scala.inline
    implicit class FlagIconPropsMutableBuilder[Self <: FlagIconProps] (val x: Self) extends AnyVal {
      
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
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      @scala.inline
      def setFlip(value: FlagIconFlip): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setRotate(value: FlagIconRotate): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSize(value: FlagIconSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSquared(value: Boolean): Self = StObject.set(x, "squared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquaredUndefined: Self = StObject.set(x, "squared", js.undefined)
      
      @scala.inline
      def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`30`
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`60`
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`90`
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`180`
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`270`
  */
  trait FlagIconRotate extends StObject
  object FlagIconRotate {
    
    @scala.inline
    def `180`: typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`180` = 180.asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`180`]
    
    @scala.inline
    def `270`: typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`270` = 270.asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`270`]
    
    @scala.inline
    def `30`: typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`30` = 30.asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`30`]
    
    @scala.inline
    def `60`: typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`60` = 60.asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`60`]
    
    @scala.inline
    def `90`: typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`90` = 90.asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`90`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.lg
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`2x`
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`3x`
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`4x`
    - typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`5x`
  */
  trait FlagIconSize extends StObject
  object FlagIconSize {
    
    @scala.inline
    def `2x`: typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`2x` = "2x".asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`2x`]
    
    @scala.inline
    def `3x`: typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`3x` = "3x".asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`3x`]
    
    @scala.inline
    def `4x`: typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`4x` = "4x".asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`4x`]
    
    @scala.inline
    def `5x`: typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`5x` = "5x".asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.`5x`]
    
    @scala.inline
    def lg: typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.lg = "lg".asInstanceOf[typingsSlinky.reactFlagIconCss.reactFlagIconCssStrings.lg]
  }
}
