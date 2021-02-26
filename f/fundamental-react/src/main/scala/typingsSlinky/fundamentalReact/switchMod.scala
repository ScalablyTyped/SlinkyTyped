package typingsSlinky.fundamentalReact

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.Checked
import typingsSlinky.fundamentalReact.anon.PartialSwitchProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapSwitchPr
import typingsSlinky.fundamentalReact.fundamentalReactStrings.Switch
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Switch/Switch.SwitchProps> & {  displayName :'Switch'} */
  object default {
    
    @JSImport("fundamental-react/lib/Switch/Switch", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[SwitchProps]): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/Switch/Switch", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[SwitchProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/Switch/Switch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Switch/Switch", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Switch/Switch", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialSwitchProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialSwitchProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Switch/Switch", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String | Switch] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String | Switch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Switch/Switch", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapSwitchPr] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapSwitchPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SwitchProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inputProps: js.UndefOr[js.Any] = js.native
    
    var internalLabels: js.UndefOr[Checked] = js.native
    
    var labelProps: js.UndefOr[js.Any] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var semantic: js.UndefOr[Boolean] = js.native
  }
  object SwitchProps {
    
    @scala.inline
    def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputProps(value: js.Any): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setInternalLabels(value: Checked): Self = StObject.set(x, "internalLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalLabelsUndefined: Self = StObject.set(x, "internalLabels", js.undefined)
      
      @scala.inline
      def setLabelProps(value: js.Any): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSemantic(value: Boolean): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemanticUndefined: Self = StObject.set(x, "semantic", js.undefined)
    }
  }
}
