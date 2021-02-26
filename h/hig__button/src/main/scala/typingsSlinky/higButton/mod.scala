package typingsSlinky.higButton

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.higButton.higButtonStrings._blank
import typingsSlinky.higButton.higButtonStrings._parent
import typingsSlinky.higButton.higButtonStrings._self
import typingsSlinky.higButton.higButtonStrings._top
import typingsSlinky.higButton.higButtonStrings.flat
import typingsSlinky.higButton.higButtonStrings.grow
import typingsSlinky.higButton.higButtonStrings.outline
import typingsSlinky.higButton.higButtonStrings.primary
import typingsSlinky.higButton.higButtonStrings.secondary
import typingsSlinky.higButton.higButtonStrings.shrink
import typingsSlinky.higButton.higButtonStrings.solid
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hig/button", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  @JSImport("@hig/button", "availableTargets")
  @js.native
  val availableTargets: AvailableTargets_ = js.native
  
  @JSImport("@hig/button", "availableTypes")
  @js.native
  val availableTypes: AvailableTypes_ = js.native
  
  @JSImport("@hig/button", "availableWidths")
  @js.native
  val availableWidths: AvailableWidths_ = js.native
  
  @JSImport("@hig/button", "targets")
  @js.native
  val targets: Targets_ = js.native
  
  @JSImport("@hig/button", "types")
  @js.native
  val types: Types_ = js.native
  
  @JSImport("@hig/button", "widths")
  @js.native
  val widths: Widths_ = js.native
  
  /* Inlined @hig/button.@hig/button.Targets[keyof @hig/button.@hig/button.Targets] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.higButton.higButtonStrings._self
    - typingsSlinky.higButton.higButtonStrings._blank
    - typingsSlinky.higButton.higButtonStrings._parent
    - typingsSlinky.higButton.higButtonStrings._top
  */
  trait AvailableTargets_ extends StObject
  object AvailableTargets_ {
    
    @scala.inline
    def _blank: typingsSlinky.higButton.higButtonStrings._blank = "_blank".asInstanceOf[typingsSlinky.higButton.higButtonStrings._blank]
    
    @scala.inline
    def _parent: typingsSlinky.higButton.higButtonStrings._parent = "_parent".asInstanceOf[typingsSlinky.higButton.higButtonStrings._parent]
    
    @scala.inline
    def _self: typingsSlinky.higButton.higButtonStrings._self = "_self".asInstanceOf[typingsSlinky.higButton.higButtonStrings._self]
    
    @scala.inline
    def _top: typingsSlinky.higButton.higButtonStrings._top = "_top".asInstanceOf[typingsSlinky.higButton.higButtonStrings._top]
  }
  
  /* Inlined @hig/button.@hig/button.Types[keyof @hig/button.@hig/button.Types] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.higButton.higButtonStrings.primary
    - typingsSlinky.higButton.higButtonStrings.solid
    - typingsSlinky.higButton.higButtonStrings.flat
    - typingsSlinky.higButton.higButtonStrings.secondary
    - typingsSlinky.higButton.higButtonStrings.outline
  */
  trait AvailableTypes_ extends StObject
  object AvailableTypes_ {
    
    @scala.inline
    def flat: typingsSlinky.higButton.higButtonStrings.flat = "flat".asInstanceOf[typingsSlinky.higButton.higButtonStrings.flat]
    
    @scala.inline
    def outline: typingsSlinky.higButton.higButtonStrings.outline = "outline".asInstanceOf[typingsSlinky.higButton.higButtonStrings.outline]
    
    @scala.inline
    def primary: typingsSlinky.higButton.higButtonStrings.primary = "primary".asInstanceOf[typingsSlinky.higButton.higButtonStrings.primary]
    
    @scala.inline
    def secondary: typingsSlinky.higButton.higButtonStrings.secondary = "secondary".asInstanceOf[typingsSlinky.higButton.higButtonStrings.secondary]
    
    @scala.inline
    def solid: typingsSlinky.higButton.higButtonStrings.solid = "solid".asInstanceOf[typingsSlinky.higButton.higButtonStrings.solid]
  }
  
  /* Inlined @hig/button.@hig/button.Widths[keyof @hig/button.@hig/button.Widths] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.higButton.higButtonStrings.shrink
    - typingsSlinky.higButton.higButtonStrings.grow
  */
  trait AvailableWidths_ extends StObject
  object AvailableWidths_ {
    
    @scala.inline
    def grow: typingsSlinky.higButton.higButtonStrings.grow = "grow".asInstanceOf[typingsSlinky.higButton.higButtonStrings.grow]
    
    @scala.inline
    def shrink: typingsSlinky.higButton.higButtonStrings.shrink = "shrink".asInstanceOf[typingsSlinky.higButton.higButtonStrings.shrink]
  }
  
  type Button = ReactComponentClass[Props]
  
  type Callback = js.Function0[Unit]
  
  @js.native
  trait Props extends StObject {
    
    /** Prevents user interaction with the button */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** A @hig/icon element */
    var icon: js.UndefOr[ReactElement] = js.native
    
    /** Sets the link of a button */
    var link: js.UndefOr[String] = js.native
    
    /** Triggers blur when focus is moved away from icon */
    var onBlur: js.UndefOr[Callback] = js.native
    
    /** Triggers when you click the button */
    var onClick: js.UndefOr[Callback] = js.native
    
    /** Triggers when focus is moved to button */
    var onFocus: js.UndefOr[Callback] = js.native
    
    /** Triggers when you hover over the button */
    var onHover: js.UndefOr[Callback] = js.native
    
    /** Triggers when the user's mouse is pressed over the button */
    var onMouseDown: js.UndefOr[Callback] = js.native
    
    /** Triggers when the user's mouse is over the button */
    var onMouseEnter: js.UndefOr[Callback] = js.native
    
    /** Triggers when the user's mouse is no longer over the button */
    var onMouseLeave: js.UndefOr[Callback] = js.native
    
    /** Triggers when the user's mouse is no longer pressed over the button */
    var onMouseUp: js.UndefOr[Callback] = js.native
    
    /** Adds custom/overriding styles */
    var stylesheet: js.UndefOr[js.Any] = js.native
    
    /** Specifies where to display the linked URL */
    var target: js.UndefOr[AvailableTargets_] = js.native
    
    /** Sets the title of a button */
    var title: String = js.native
    
    /** Specifies type of button */
    var `type`: js.UndefOr[AvailableTypes_] = js.native
    
    /** Specifies width of button */
    var width: js.UndefOr[AvailableWidths_] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(title: String): Props = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnHover(value: () => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: () => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: () => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setStylesheet(value: js.Any): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
      
      @scala.inline
      def setTarget(value: AvailableTargets_): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: AvailableTypes_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: AvailableWidths_): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Targets_ extends StObject {
    
    var BLANK: _blank = js.native
    
    var PARENT: _parent = js.native
    
    var SELF: _self = js.native
    
    var TOP: _top = js.native
  }
  object Targets_ {
    
    @scala.inline
    def apply(BLANK: _blank, PARENT: _parent, SELF: _self, TOP: _top): Targets_ = {
      val __obj = js.Dynamic.literal(BLANK = BLANK.asInstanceOf[js.Any], PARENT = PARENT.asInstanceOf[js.Any], SELF = SELF.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any])
      __obj.asInstanceOf[Targets_]
    }
    
    @scala.inline
    implicit class Targets_MutableBuilder[Self <: Targets_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBLANK(value: _blank): Self = StObject.set(x, "BLANK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPARENT(value: _parent): Self = StObject.set(x, "PARENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSELF(value: _self): Self = StObject.set(x, "SELF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOP(value: _top): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Types_ extends StObject {
    
    var FLAT: flat = js.native
    
    var OUTLINE: outline = js.native
    
    /** @deprecated */
    var PRIMARY: primary = js.native
    
    /** @deprecated */
    var SECONDARY: secondary = js.native
    
    var SOLID: solid = js.native
  }
  object Types_ {
    
    @scala.inline
    def apply(FLAT: flat, OUTLINE: outline, PRIMARY: primary, SECONDARY: secondary, SOLID: solid): Types_ = {
      val __obj = js.Dynamic.literal(FLAT = FLAT.asInstanceOf[js.Any], OUTLINE = OUTLINE.asInstanceOf[js.Any], PRIMARY = PRIMARY.asInstanceOf[js.Any], SECONDARY = SECONDARY.asInstanceOf[js.Any], SOLID = SOLID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types_]
    }
    
    @scala.inline
    implicit class Types_MutableBuilder[Self <: Types_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFLAT(value: flat): Self = StObject.set(x, "FLAT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOUTLINE(value: outline): Self = StObject.set(x, "OUTLINE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRIMARY(value: primary): Self = StObject.set(x, "PRIMARY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSECONDARY(value: secondary): Self = StObject.set(x, "SECONDARY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSOLID(value: solid): Self = StObject.set(x, "SOLID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Widths_ extends StObject {
    
    var GROW: grow = js.native
    
    var SHRINK: shrink = js.native
  }
  object Widths_ {
    
    @scala.inline
    def apply(GROW: grow, SHRINK: shrink): Widths_ = {
      val __obj = js.Dynamic.literal(GROW = GROW.asInstanceOf[js.Any], SHRINK = SHRINK.asInstanceOf[js.Any])
      __obj.asInstanceOf[Widths_]
    }
    
    @scala.inline
    implicit class Widths_MutableBuilder[Self <: Widths_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGROW(value: grow): Self = StObject.set(x, "GROW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHRINK(value: shrink): Self = StObject.set(x, "SHRINK", value.asInstanceOf[js.Any])
    }
  }
}
