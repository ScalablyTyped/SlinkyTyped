package typingsSlinky.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialFormGroupProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapFormGrou
import typingsSlinky.fundamentalReact.fundamentalReactStrings.FormGroup
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formGroupMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> & {  displayName :'FormGroup'} */
  object default {
    
    @JSImport("fundamental-react/lib/Forms/FormGroup", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[FormGroupProps]): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/Forms/FormGroup", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[FormGroupProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/Forms/FormGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Forms/FormGroup", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Forms/FormGroup", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialFormGroupProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialFormGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Forms/FormGroup", "default.displayName")
    @js.native
    def displayName: js.UndefOr[FormGroup | String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[FormGroup | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Forms/FormGroup", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapFormGrou] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapFormGrou]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FormGroupProps
    extends /* x */ StringDictionary[js.Any] {
    
    var disableStyles: js.UndefOr[Boolean] = js.native
  }
  object FormGroupProps {
    
    @scala.inline
    def apply(): FormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormGroupProps]
    }
    
    @scala.inline
    implicit class FormGroupPropsMutableBuilder[Self <: FormGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    }
  }
}
