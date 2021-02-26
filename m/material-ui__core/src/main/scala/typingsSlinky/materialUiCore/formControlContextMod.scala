package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.materialUiCore.materialUiCoreStrings.filled
import typingsSlinky.materialUiCore.materialUiCoreStrings.outlined
import typingsSlinky.materialUiCore.materialUiCoreStrings.standard
import typingsSlinky.materialUiCore.mod.PropTypes.Margin
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlContextMod extends Shortcut {
  
  @JSImport("@material-ui/core/FormControl/FormControlContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[FormControlContextProps | Null]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiCore.materialUiCoreStrings.disabled
    - typingsSlinky.materialUiCore.materialUiCoreStrings.error
    - typingsSlinky.materialUiCore.materialUiCoreStrings.margin
    - typingsSlinky.materialUiCore.materialUiCoreStrings.required
    - typingsSlinky.materialUiCore.materialUiCoreStrings.variant
  */
  trait ContextFromPropsKey extends StObject
  object ContextFromPropsKey {
    
    @scala.inline
    def disabled: typingsSlinky.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.disabled]
    
    @scala.inline
    def error: typingsSlinky.materialUiCore.materialUiCoreStrings.error = "error".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.error]
    
    @scala.inline
    def margin: typingsSlinky.materialUiCore.materialUiCoreStrings.margin = "margin".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.margin]
    
    @scala.inline
    def required: typingsSlinky.materialUiCore.materialUiCoreStrings.required = "required".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.required]
    
    @scala.inline
    def variant: typingsSlinky.materialUiCore.materialUiCoreStrings.variant = "variant".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.variant]
  }
  
  /* Inlined parent std.Pick<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps, @material-ui/core.@material-ui/core/FormControl/FormControlContext.ContextFromPropsKey> */
  @js.native
  trait FormControlContextProps extends StObject {
    
    var adornedStart: Boolean = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var filled: Boolean = js.native
    
    var focused: Boolean = js.native
    
    var margin: js.UndefOr[Margin] = js.native
    
    def onBlur(): Unit = js.native
    
    def onEmpty(): Unit = js.native
    
    def onFilled(): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var variant: js.UndefOr[standard | outlined | filled] = js.native
  }
  object FormControlContextProps {
    
    @scala.inline
    def apply(
      adornedStart: Boolean,
      filled: Boolean,
      focused: Boolean,
      onBlur: () => Unit,
      onEmpty: () => Unit,
      onFilled: () => Unit,
      onFocus: () => Unit
    ): FormControlContextProps = {
      val __obj = js.Dynamic.literal(adornedStart = adornedStart.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onEmpty = js.Any.fromFunction0(onEmpty), onFilled = js.Any.fromFunction0(onFilled), onFocus = js.Any.fromFunction0(onFocus))
      __obj.asInstanceOf[FormControlContextProps]
    }
    
    @scala.inline
    implicit class FormControlContextPropsMutableBuilder[Self <: FormControlContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdornedStart(value: Boolean): Self = StObject.set(x, "adornedStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEmpty(value: () => Unit): Self = StObject.set(x, "onEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFilled(value: () => Unit): Self = StObject.set(x, "onFilled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = Context[js.UndefOr[FormControlContextProps | Null]]
  
  /* This means you don't have to write `default`, but can instead just say `formControlContextMod.foo` */
  override def _to: Context[js.UndefOr[FormControlContextProps | Null]] = default
}
