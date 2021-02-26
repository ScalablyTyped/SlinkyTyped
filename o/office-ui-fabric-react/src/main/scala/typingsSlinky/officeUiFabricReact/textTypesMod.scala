package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.large
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.medium
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.mediumPlus
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.mega
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.small
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.smallPlus
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.superLarge
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.tiny
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.xLarge
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.xLargePlus
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.xSmall
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.xxLarge
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.xxLargePlus
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Extract
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricFoundation.anon.Slots
import typingsSlinky.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import typingsSlinky.uifabricFoundation.libIcomponentMod.IComponent
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotProp
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textTypesMod {
  
  type ITextComponent = IComponent[ITextProps, ITextTokens, ITextStyles, ITextProps, js.Object]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.uifabricFoundation.libIcomponentMod.IStyleableComponentProps because var conflicts: className. Inlined theme, tokens, styles */ @js.native
  trait ITextProps
    extends HTMLAttributes[HTMLElement]
       with ITextSlots
       with Slots[ITextSlots] {
    
    /**
      * Optionally render the component as another component type or primitive.
      */
    var as: js.UndefOr[ReactElement] = js.native
    
    /**
      * Whether the text is displayed as a block element.
      *
      * Note that in order for ellipsis on overflow to work properly,
      * `block` and `nowrap` should be set to true.
      */
    var block: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the text is not wrapped.
      *
      * Note that in order for ellipsis on overflow to work properly,
      * `block` and `nowrap` should be set to true.
      */
    var nowrap: js.UndefOr[Boolean] = js.native
    
    var styles: js.UndefOr[IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles]] = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
    
    var tokens: js.UndefOr[ITokenFunctionOrObject[ITextProps, ITextTokens]] = js.native
    
    /**
      * Optional font type for Text.
      */
    var variant: js.UndefOr[
        tiny | xSmall | small | smallPlus | medium | mediumPlus | large | xLarge | xLargePlus | xxLarge | xxLargePlus | superLarge | mega
      ] = js.native
  }
  object ITextProps {
    
    @scala.inline
    def apply(): ITextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextProps]
    }
    
    @scala.inline
    implicit class ITextPropsMutableBuilder[Self <: ITextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: ReactElement): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsComponentClass(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsFunctionComponent(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setNowrap(value: Boolean): Self = StObject.set(x, "nowrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowrapUndefined: Self = StObject.set(x, "nowrap", js.undefined)
      
      @scala.inline
      def setStyles(value: IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction3(value: (ITextProps, /* theme */ ITheme, ITextTokens) => ITextStyles): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTokens(value: ITokenFunctionOrObject[ITextProps, ITextTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      @scala.inline
      def setVariant(
        value: tiny | xSmall | small | smallPlus | medium | mediumPlus | large | xLarge | xLargePlus | xxLarge | xxLargePlus | superLarge | mega
      ): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type ITextSlot = ISlotProp[ITextProps, String]
  
  @js.native
  trait ITextSlots extends StObject {
    
    var root: js.UndefOr[IHTMLSlot] = js.native
  }
  object ITextSlots {
    
    @scala.inline
    def apply(): ITextSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextSlots]
    }
    
    @scala.inline
    implicit class ITextSlotsMutableBuilder[Self <: ITextSlots] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IHTMLSlot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  /* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/Foundation.IComponentStyles<office-ui-fabric-react.office-ui-fabric-react/lib/components/Text/Text.types.ITextSlots> */
  @js.native
  trait ITextStyles extends StObject {
    
    var root: js.UndefOr[IStyle] = js.native
  }
  object ITextStyles {
    
    @scala.inline
    def apply(): ITextStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextStyles]
    }
    
    @scala.inline
    implicit class ITextStylesMutableBuilder[Self <: ITextStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type ITextStylesReturnType = ReturnType[
    Extract[IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles], js.Function]
  ]
  
  type ITextTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[ITextProps, ITextTokens], js.Function]]
  
  @js.native
  trait ITextTokens extends StObject
}
