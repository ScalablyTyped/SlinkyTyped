package typingsSlinky.reactIntl

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactIntl.anon.ForwardedRef
import typingsSlinky.reactIntl.anon.WrappedComponent
import typingsSlinky.reactIntl.reactIntlBooleans.`false`
import typingsSlinky.reactIntl.reactIntlBooleans.`true`
import typingsSlinky.reactIntl.reactIntlStrings.intl
import typingsSlinky.reactIntl.srcTypesMod.IntlShape
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInjectIntlMod {
  
  @JSImport("react-intl/src/components/injectIntl", JSImport.Default)
  @js.native
  def default[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[WithIntlProps[P]] with (WrappedComponent[P, IntlPropName]) = js.native
  
  @JSImport("react-intl/src/components/injectIntl", "Context")
  @js.native
  val Context: typingsSlinky.react.mod.Context[IntlShape] = js.native
  
  @JSImport("react-intl/src/components/injectIntl", "Provider")
  @js.native
  val Provider: ReactComponentClass[ProviderProps[IntlShape]] = js.native
  
  @JSImport("react-intl/src/components/injectIntl", JSImport.Default)
  @js.native
  def default_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponent[P, IntlPropName]) = js.native
  @JSImport("react-intl/src/components/injectIntl", JSImport.Default)
  @js.native
  def default_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `false`]): ReactComponentClass[WithIntlProps[P]] with (WrappedComponent[P, IntlPropName]) = js.native
  @JSImport("react-intl/src/components/injectIntl", JSImport.Default)
  @js.native
  def default_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponent[P, IntlPropName]) = js.native
  
  @js.native
  trait Opts[IntlPropName /* <: String */, ForwardRef /* <: Boolean */] extends StObject {
    
    var enforceContext: js.UndefOr[Boolean] = js.native
    
    var forwardRef: js.UndefOr[ForwardRef] = js.native
    
    var intlPropName: js.UndefOr[IntlPropName] = js.native
  }
  object Opts {
    
    @scala.inline
    def apply[IntlPropName /* <: String */, ForwardRef /* <: Boolean */](): Opts[IntlPropName, ForwardRef] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts[IntlPropName, ForwardRef]]
    }
    
    @scala.inline
    implicit class OptsMutableBuilder[Self <: Opts[_, _], IntlPropName /* <: String */, ForwardRef /* <: Boolean */] (val x: Self with (Opts[IntlPropName, ForwardRef])) extends AnyVal {
      
      @scala.inline
      def setEnforceContext(value: Boolean): Self = StObject.set(x, "enforceContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceContextUndefined: Self = StObject.set(x, "enforceContext", js.undefined)
      
      @scala.inline
      def setForwardRef(value: ForwardRef): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      @scala.inline
      def setIntlPropName(value: IntlPropName): Self = StObject.set(x, "intlPropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntlPropNameUndefined: Self = StObject.set(x, "intlPropName", js.undefined)
    }
  }
  
  type WithIntlProps[P] = (Omit[P, intl]) with ForwardedRef
  
  type WrappedComponentProps[IntlPropName /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl/src/types.IntlShape}
    */ typingsSlinky.reactIntl.reactIntlStrings.WrappedComponentProps with TopLevel[js.Any]
}
