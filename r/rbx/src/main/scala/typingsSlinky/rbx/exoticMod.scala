package typingsSlinky.rbx

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.As
import typingsSlinky.rbx.anon.AsTDefaultComponent
import typingsSlinky.rbx.anon.`0`
import typingsSlinky.rbx.typesMod.Prefer
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.ComponentPropsWithoutRef
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rbx/base/exotic", JSImport.Namespace)
@js.native
object exoticMod extends js.Object {
  
  def forwardRefAs[TOwnProps, TDefaultComponent /* <: ReactType[_] */](
    factory: ReactComponentClass[HTMLElement | SVGElement | ReactComponentClass[js.Object]],
    defaultProps: Partial[
      Prefer[
        (PropsWithoutRef[TOwnProps with `0`[TDefaultComponent]]) with RefAttributes[FromReactType[TDefaultComponent]], 
        ComponentPropsWithoutRef[TDefaultComponent]
      ]
    ]
  ): ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent] = js.native
  
  /* Inlined std.Pick<react.react.ForwardRefExoticComponent<TDefaultComponent>, std.Exclude<keyof react.react.ForwardRefExoticComponent<TDefaultComponent>, 'defaultProps'>> & {None <TAsComponent extends react.react.ReactType<any> = TDefaultComponent>(props : rbx.rbx/types.Prefer<{  as :TAsComponent | undefined} & TOwnProps, react.react.ComponentProps<TAsComponent>> & react.react.RefAttributes<TAsComponent extends keyof react.react.<global>.JSX.IntrinsicElements ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps :{  as :TDefaultComponent} & std.Partial<TOwnProps & react.react.ComponentPropsWithoutRef<TDefaultComponent>>,   displayName :string,   propTypes :react.react.WeakValidationMap<{[ k in 'as' | keyof TOwnProps | keyof react.react.ComponentPropsWithoutRef<TDefaultComponent> ]: any}>} */
  @js.native
  trait ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent /* <: ReactType[_] */] extends js.Object {
    
    def apply[TAsComponent /* <: ReactType[_] */](
      props: (Prefer[As[TAsComponent] with TOwnProps, ComponentProps[TAsComponent]]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var defaultProps: AsTDefaultComponent[TDefaultComponent] with (Partial[TOwnProps with ComponentPropsWithoutRef[TDefaultComponent]]) = js.native
    
    var displayName: js.UndefOr[String] with String = js.native
    
    var propTypes: js.UndefOr[WeakValidationMap[TDefaultComponent]] with (WeakValidationMap[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in 'as' | keyof TOwnProps | keyof react.react.ComponentPropsWithoutRef<TDefaultComponent> ]: any}
      */ typingsSlinky.rbx.rbxStrings.ForwardRefAsExoticComponent with TopLevel[js.Any]
      ]) = js.native
  }
  
  type FromReactType[T /* <: ReactType[_] */] = T | js.Any
}
