package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormInterfaceMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.antd.Anon_WrappedComponent
  import typingsSlinky.antd.antdNumbers.`true`
  import typingsSlinky.antd.libFormFormMod.WrappedFormInternalProps
  import typingsSlinky.antd.libUnderscoreUtilTypeMod.Omit
  import typingsSlinky.react.reactMod._Global_.JSX.LibraryManagedAttributes

  type ConnectedComponentClass[C /* <: ReactComponentClass[_] */, P] = (ReactComponentClass[LibraryManagedAttributes[C, P]]) with (NonReactStatics[C, js.Object]) with Anon_WrappedComponent[C]
  type FormWrappedProps[TOwnProps /* <: WrappedFormInternalProps[_] */] = js.Function1[/* component */ js.Any, ConnectedComponentClass[js.Any, Omit[TOwnProps, String]]]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.antd.antdStrings.Matching with js.Any
  type NonReactStatics[S /* <: ReactComponentClass[_] */, C /* <: StringDictionary[`true`] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof S, S extends / * Inlined react.react.MemoExoticComponent<any> * /
  {  displayName? :string,  readonly $$typeof  :symbol, None (props : react.react.ComponentPropsWithRef<any>): react.react.ReactElement | null,  readonly type  :any}? '$$typeof' | 'compare' | 'defaultProps' | 'displayName' | 'propTypes' | 'type' | keyof C : S extends react.react.ForwardRefExoticComponent<any>? '$$typeof' | 'render' | 'defaultProps' | 'displayName' | 'propTypes' | keyof C : 'childContextTypes' | 'contextType' | 'contextTypes' | 'defaultProps' | 'displayName' | 'getDefaultProps' | 'getDerivedStateFromError' | 'getDerivedStateFromProps' | 'mixins' | 'propTypes' | 'type' | 'name' | 'length' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity' | keyof C> ]: S[key]}
    */ typingsSlinky.antd.antdStrings.NonReactStatics with S
}
