package typingsSlinky.antDesignCompatible

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type ConnectedComponentClass[C /* <: slinky.core.ReactComponentClass[_] */, P] = (slinky.core.ReactComponentClass[typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes[C, P]]) with (typingsSlinky.antDesignCompatible.interfaceMod.NonReactStatics[C, js.Object]) with typingsSlinky.antDesignCompatible.anon.WrappedComponent[C]
  type FormWrappedProps[TOwnProps /* <: typingsSlinky.antDesignCompatible.formFormMod.WrappedFormInternalProps[_] */] = js.Function1[
    /* component */ js.Any, 
    typingsSlinky.antDesignCompatible.interfaceMod.ConnectedComponentClass[
      js.Any, 
      typingsSlinky.antDesignCompatible.typesMod.Omit[TOwnProps, typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.form]
    ]
  ]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.Matching with org.scalablytyped.runtime.TopLevel[js.Any]
  type NonReactStatics[S /* <: slinky.core.ReactComponentClass[_] */, C /* <: org.scalablytyped.runtime.StringDictionary[typingsSlinky.antDesignCompatible.antDesignCompatibleBooleans.`true`] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof S, S extends react.react.MemoExoticComponent<any>? '$$typeof' | 'compare' | 'defaultProps' | 'displayName' | 'propTypes' | 'type' | keyof C : S extends react.react.ForwardRefExoticComponent<any>? '$$typeof' | 'render' | 'defaultProps' | 'displayName' | 'propTypes' | keyof C : 'childContextTypes' | 'contextType' | 'contextTypes' | 'defaultProps' | 'displayName' | 'getDefaultProps' | 'getDerivedStateFromError' | 'getDerivedStateFromProps' | 'mixins' | 'propTypes' | 'type' | 'name' | 'length' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity' | keyof C> ]: S[key]}
    */ typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.NonReactStatics with org.scalablytyped.runtime.TopLevel[S]
}
