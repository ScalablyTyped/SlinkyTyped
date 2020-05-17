package typingsSlinky.rbx.exoticMod

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.As
import typingsSlinky.rbx.anon.AsTDefaultComponent
import typingsSlinky.rbx.typesMod.Prefer
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.ComponentPropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react.react.ForwardRefExoticComponent<TDefaultComponent>, std.Exclude<keyof react.react.ForwardRefExoticComponent<TDefaultComponent>, 'defaultProps'>> & {None <TAsComponent extends react.react.ReactType<any> = TDefaultComponent>(props : rbx.rbx/types.Prefer<{  as ? :TAsComponent} & TOwnProps, react.react.ComponentProps<TAsComponent>> & react.react.RefAttributes<TAsComponent extends keyof react.react.<global>.JSX.IntrinsicElements ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps  :{  as  :TDefaultComponent} & std.Partial<TOwnProps & react.react.ComponentPropsWithoutRef<TDefaultComponent>>,   displayName  :string,   propTypes  :react.react.WeakValidationMap<{[ k in 'as' | keyof TOwnProps | keyof react.react.ComponentPropsWithoutRef<TDefaultComponent> ]: any}>} */
@js.native
trait ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent /* <: ReactComponentClass[_] */] extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var defaultProps: AsTDefaultComponent[TDefaultComponent] with (Partial[TOwnProps with ComponentPropsWithoutRef[TDefaultComponent]]) = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[
    WeakValidationMap[TDefaultComponent] with (WeakValidationMap[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in 'as' | keyof TOwnProps | keyof react.react.ComponentPropsWithoutRef<TDefaultComponent> ]: any}
    */ typingsSlinky.rbx.rbxStrings.ForwardRefAsExoticComponent with TopLevel[js.Any]
    ])
  ] = js.native
  def apply[TAsComponent /* <: ReactComponentClass[_] */](
    props: (Prefer[As[TAsComponent] with TOwnProps, ComponentProps[TAsComponent]]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): ReactElement | Null = js.native
}

