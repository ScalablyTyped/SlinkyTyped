package typingsSlinky.baseui

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.baseuiStrings.button
import typingsSlinky.baseui.baseuiStrings.circle
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.minimal
import typingsSlinky.baseui.baseuiStrings.pill
import typingsSlinky.baseui.baseuiStrings.primary
import typingsSlinky.baseui.baseuiStrings.reset
import typingsSlinky.baseui.baseuiStrings.round
import typingsSlinky.baseui.baseuiStrings.secondary
import typingsSlinky.baseui.baseuiStrings.square
import typingsSlinky.baseui.baseuiStrings.submit
import typingsSlinky.baseui.baseuiStrings.tertiary
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.styletronReact.mod.StyletronComponent
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("baseui/button", "Button")
  @js.native
  val Button: ForwardRefExoticComponent[PropsWithoutRef[ButtonProps] with RefAttributes[HTMLButtonElement]] = js.native
  
  @js.native
  trait KIND extends StObject {
    
    var minimal: typingsSlinky.baseui.baseuiStrings.minimal = js.native
    
    var primary: typingsSlinky.baseui.baseuiStrings.primary = js.native
    
    var secondary: typingsSlinky.baseui.baseuiStrings.secondary = js.native
    
    var tertiary: typingsSlinky.baseui.baseuiStrings.tertiary = js.native
  }
  object KIND {
    
    @JSImport("baseui/button", "KIND")
    @js.native
    val ^ : KIND = js.native
    
    @scala.inline
    implicit class KINDMutableBuilder[Self <: KIND] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinimal(value: minimal): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary(value: primary): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondary(value: secondary): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTertiary(value: tertiary): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SHAPE extends StObject {
    
    var default: default_ = js.native
    
    var circle: typingsSlinky.baseui.baseuiStrings.circle = js.native
    
    var pill: typingsSlinky.baseui.baseuiStrings.pill = js.native
    
    var round: typingsSlinky.baseui.baseuiStrings.round = js.native
    
    var square: typingsSlinky.baseui.baseuiStrings.square = js.native
  }
  object SHAPE {
    
    @JSImport("baseui/button", "SHAPE")
    @js.native
    val ^ : SHAPE = js.native
    
    @scala.inline
    implicit class SHAPEMutableBuilder[Self <: SHAPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: circle): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPill(value: pill): Self = StObject.set(x, "pill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRound(value: round): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquare(value: square): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SIZE extends StObject {
    
    var default: default_ = js.native
    
    var compact: typingsSlinky.baseui.baseuiStrings.compact = js.native
    
    var large: large_ = js.native
    
    var mini: typingsSlinky.baseui.baseuiStrings.mini = js.native
  }
  object SIZE {
    
    @JSImport("baseui/button", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    @scala.inline
    implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMini(value: mini): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/button", "StyledBaseButton")
  @js.native
  val StyledBaseButton: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/button", "StyledEndEnhancer")
  @js.native
  val StyledEndEnhancer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/button", "StyledLoadingSpinner")
  @js.native
  val StyledLoadingSpinner: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/button", "StyledLoadingSpinnerContainer")
  @js.native
  val StyledLoadingSpinnerContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/button", "StyledStartEnhancer")
  @js.native
  val StyledStartEnhancer: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait ButtonOverrides extends StObject {
    
    var BaseButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var EndEnhancer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var LoadingSpinner: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var LoadingSpinnerContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var StartEnhancer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object ButtonOverrides {
    
    @scala.inline
    def apply(): ButtonOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonOverrides]
    }
    
    @scala.inline
    implicit class ButtonOverridesMutableBuilder[Self <: ButtonOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "BaseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseButtonUndefined: Self = StObject.set(x, "BaseButton", js.undefined)
      
      @scala.inline
      def setEndEnhancer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "EndEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEnhancerUndefined: Self = StObject.set(x, "EndEnhancer", js.undefined)
      
      @scala.inline
      def setLoadingSpinner(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "LoadingSpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingSpinnerContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "LoadingSpinnerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingSpinnerContainerUndefined: Self = StObject.set(x, "LoadingSpinnerContainer", js.undefined)
      
      @scala.inline
      def setLoadingSpinnerUndefined: Self = StObject.set(x, "LoadingSpinner", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setStartEnhancer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "StartEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnhancerUndefined: Self = StObject.set(x, "StartEnhancer", js.undefined)
    }
  }
  
  @js.native
  trait ButtonProps extends StyletronComponentInjectedProps[ButtonProps] {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var endEnhancer: js.UndefOr[ReactElement] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var isLoading: js.UndefOr[Boolean] = js.native
    
    var isSelected: js.UndefOr[Boolean] = js.native
    
    var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], _]] = js.native
    
    var overrides: js.UndefOr[ButtonOverrides] = js.native
    
    var shape: js.UndefOr[pill | default_ | square | round | circle] = js.native
    
    var size: js.UndefOr[compact | default_ | large_ | mini] = js.native
    
    var startEnhancer: js.UndefOr[ReactElement] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[submit | reset | button] = js.native
  }
  object ButtonProps {
    
    @scala.inline
    def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEndEnhancer(value: ReactElement): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEnhancerReactElement(value: ReactElement): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setKind(value: primary | secondary | tertiary | minimal): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOverrides(value: ButtonOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setShape(value: pill | default_ | square | round | circle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: compact | default_ | large_ | mini): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStartEnhancer(value: ReactElement): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnhancerReactElement(value: ReactElement): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
