package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.initial
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.unset
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

object stackTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.center
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`space-between`
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`space-around`
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`space-evenly`
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.baseline
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.stretch
  */
  trait Alignment extends StObject
  object Alignment {
    
    @scala.inline
    def baseline: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.baseline = "baseline".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.baseline]
    
    @scala.inline
    def center: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.center = "center".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.center]
    
    @scala.inline
    def end: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end = "end".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end]
    
    @scala.inline
    def `space-around`: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`space-around` = "space-around".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`space-around`]
    
    @scala.inline
    def `space-between`: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`space-between` = "space-between".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`space-between`]
    
    @scala.inline
    def `space-evenly`: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`space-evenly` = "space-evenly".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`space-evenly`]
    
    @scala.inline
    def start: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start = "start".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start]
    
    @scala.inline
    def stretch: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.stretch = "stretch".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.stretch]
  }
  
  type IStackComponent = IComponent[IStackProps, IStackTokens, IStackStyles, IStackProps, js.Object]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.uifabricFoundation.libIcomponentMod.IStyleableComponentProps because var conflicts: className. Inlined theme, tokens, styles */ @js.native
  trait IStackProps
    extends HTMLAttributes[HTMLElement]
       with IStackSlots
       with Slots[IStackSlots] {
    
    /**
      * Defines how to render the Stack.
      */
    var as: js.UndefOr[ReactElement] = js.native
    
    /**
      * Defines whether Stack children should not shrink to fit the available space.
      * @defaultvalue false
      */
    var disableShrink: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the spacing between Stack children.
      * The property is specified as a value for 'row gap', followed optionally by a value for 'column gap'.
      * If 'column gap' is omitted, it's set to the same value as 'row gap'.
      * @deprecated Use `childrenGap` token in `IStackTokens` instead.
      */
    var gap: js.UndefOr[Double | String] = js.native
    
    /**
      * Defines how much to grow the Stack in proportion to its siblings.
      */
    var grow: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.native
    
    /**
      * Defines whether to render Stack children horizontally.
      * @defaultvalue false
      */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines how to align Stack children horizontally (along the x-axis).
      */
    var horizontalAlign: js.UndefOr[Alignment] = js.native
    
    /**
      * Defines the maximum height that the Stack can take.
      * @deprecated Use `maxHeight` token in `IStackTokens` instead.
      */
    var maxHeight: js.UndefOr[Double | String] = js.native
    
    /**
      * Defines the maximum width that the Stack can take.
      * @deprecated Use `maxWidth` token in `IStackTokens` instead.
      */
    var maxWidth: js.UndefOr[Double | String] = js.native
    
    /**
      * Defines the inner padding of the Stack.
      * @deprecated Use `padding` token in `IStackTokens` instead.
      */
    var padding: js.UndefOr[Double | String] = js.native
    
    /**
      * Defines whether to render Stack children in the opposite direction (bottom-to-top if it's a vertical Stack and
      * right-to-left if it's a horizontal Stack).
      * @defaultvalue false
      */
    var reversed: js.UndefOr[Boolean] = js.native
    
    var styles: js.UndefOr[IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles]] = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
    
    var tokens: js.UndefOr[ITokenFunctionOrObject[IStackProps, IStackTokens]] = js.native
    
    /**
      * Defines how to align Stack children vertically (along the y-axis).
      */
    var verticalAlign: js.UndefOr[Alignment] = js.native
    
    /**
      * Defines whether the Stack should take up 100% of the height of its parent.
      * This property is required to be set to true when using the `grow` flag on children in vertical oriented Stacks.
      * Stacks are rendered as block elements and grow horizontally to the container already.
      * @defaultvalue false
      */
    var verticalFill: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether Stack children should wrap onto multiple rows or columns when they are about to overflow
      * the size of the Stack.
      * @defaultvalue false
      */
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object IStackProps {
    
    @scala.inline
    def apply(): IStackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackProps]
    }
    
    @scala.inline
    implicit class IStackPropsMutableBuilder[Self <: IStackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: ReactElement): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsComponentClass(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsFunctionComponent(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setDisableShrink(value: Boolean): Self = StObject.set(x, "disableShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableShrinkUndefined: Self = StObject.set(x, "disableShrink", js.undefined)
      
      @scala.inline
      def setGap(value: Double | String): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setGrow(value: Boolean | Double | inherit | initial | unset): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlign(value: Alignment): Self = StObject.set(x, "horizontalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignUndefined: Self = StObject.set(x, "horizontalAlign", js.undefined)
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setStyles(value: IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction3(value: (IStackProps, /* theme */ ITheme, IStackTokens) => IStackStyles): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTokens(value: ITokenFunctionOrObject[IStackProps, IStackTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: Alignment): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setVerticalFill(value: Boolean): Self = StObject.set(x, "verticalFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalFillUndefined: Self = StObject.set(x, "verticalFill", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type IStackSlot = ISlotProp[IStackProps, scala.Nothing]
  
  @js.native
  trait IStackSlots extends StObject {
    
    /**
      * Defines a slot that is placed inside the root slot in order to achieve wrapping. Only used when the wrap
      * property is set to true.
      */
    var inner: js.UndefOr[IHTMLSlot] = js.native
    
    /**
      * Defines root slot of the component.
      */
    var root: js.UndefOr[IHTMLSlot] = js.native
  }
  object IStackSlots {
    
    @scala.inline
    def apply(): IStackSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackSlots]
    }
    
    @scala.inline
    implicit class IStackSlotsMutableBuilder[Self <: IStackSlots] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInner(value: IHTMLSlot): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
      
      @scala.inline
      def setRoot(value: IHTMLSlot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  /* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/Foundation.IComponentStyles<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/Stack.types.IStackSlots> */
  @js.native
  trait IStackStyles extends StObject {
    
    var inner: js.UndefOr[IStyle] = js.native
    
    var root: js.UndefOr[IStyle] = js.native
  }
  object IStackStyles {
    
    @scala.inline
    def apply(): IStackStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackStyles]
    }
    
    @scala.inline
    implicit class IStackStylesMutableBuilder[Self <: IStackStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInner(value: IStyle): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerNull: Self = StObject.set(x, "inner", null)
      
      @scala.inline
      def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type IStackStylesReturnType = ReturnType[
    Extract[IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles], js.Function]
  ]
  
  type IStackTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[IStackProps, IStackTokens], js.Function]]
  
  @js.native
  trait IStackTokens extends StObject {
    
    /**
      * Defines the spacing between Stack children.
      * The property is specified as a value for 'row gap', followed optionally by a value for 'column gap'.
      * If 'column gap' is omitted, it's set to the same value as 'row gap'.
      */
    var childrenGap: js.UndefOr[Double | String] = js.native
    
    /**
      * Defines a maximum height for the Stack.
      */
    var maxHeight: js.UndefOr[Double | String] = js.native
    
    /**
      * Defines a maximum width for the Stack.
      */
    var maxWidth: js.UndefOr[Double | String] = js.native
    
    /**
      * Defines the padding to be applied to the Stack contents relative to its border.
      */
    var padding: js.UndefOr[Double | String] = js.native
  }
  object IStackTokens {
    
    @scala.inline
    def apply(): IStackTokens = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackTokens]
    }
    
    @scala.inline
    implicit class IStackTokensMutableBuilder[Self <: IStackTokens] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrenGap(value: Double | String): Self = StObject.set(x, "childrenGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenGapUndefined: Self = StObject.set(x, "childrenGap", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
}
