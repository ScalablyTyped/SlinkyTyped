package typingsSlinky.reactDashRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashReduxMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.hoistDashNonDashReactDashStatics.hoistDashNonDashReactDashStaticsMod.NonReactStatics
  import typingsSlinky.react.reactMod._Global_.JSX.LibraryManagedAttributes
  import typingsSlinky.reactDashRedux.Anon_WrappedComponent
  import typingsSlinky.redux.reduxMod.Action
  import typingsSlinky.redux.reduxMod.Dispatch
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[/* component */ ReactComponentClass[TProps], ReactComponentClass[TOwnProps]]
  type ConnectedComponent[C /* <: ReactComponentClass[_] */, P] = (ReactComponentClass[LibraryManagedAttributes[C, P]]) with (NonReactStatics[C, js.Object]) with Anon_WrappedComponent[C]
  type ConnectedProps[TConnector] = js.Any
  type GetProps[C] = js.Any
  type HandleThunkActionCreator[TActionCreator] = TActionCreator | InferThunkActionCreatorType[TActionCreator]
  type InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ js.Any, _] */] = TActionCreator | (js.Function1[/* args */ js.Any, js.Any])
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ js.Any, 
    ConnectedComponent[js.Any, (Omit[GetProps[_], String]) with TNeedsProps]
  ]
  type MapDispatchToProps[TDispatchProps, TOwnProps] = (MapDispatchToPropsFunction[TDispatchProps, TOwnProps]) | TDispatchProps
  type MapDispatchToPropsFactory[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ Dispatch[Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    MapDispatchToPropsFunction[TDispatchProps, TOwnProps]
  ]
  type MapDispatchToPropsFunction[TDispatchProps, TOwnProps] = js.Function2[/* dispatch */ Dispatch[Action[js.Any]], /* ownProps */ TOwnProps, TDispatchProps]
  type MapDispatchToPropsNonObject[TDispatchProps, TOwnProps] = (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToPropsFunction[TDispatchProps, TOwnProps])
  type MapDispatchToPropsParam[TDispatchProps, TOwnProps] = (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToProps[TDispatchProps, TOwnProps])
  type MapStateToProps[TStateProps, TOwnProps, State] = js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]
  type MapStateToPropsFactory[TStateProps, TOwnProps, State] = js.Function2[
    /* initialState */ State, 
    /* ownProps */ TOwnProps, 
    MapStateToProps[TStateProps, TOwnProps, State]
  ]
  type MapStateToPropsParam[TStateProps, TOwnProps, State] = js.UndefOr[
    (MapStateToPropsFactory[TStateProps, TOwnProps, State]) | (MapStateToProps[TStateProps, TOwnProps, State]) | Null
  ]
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.reactDashRedux.reactDashReduxStrings.Matching with js.Any
  type MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function3[
    /* stateProps */ TStateProps, 
    /* dispatchProps */ TDispatchProps, 
    /* ownProps */ TOwnProps, 
    TMergedProps
  ]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type ResolveArrayThunks[TDispatchProps /* <: js.Array[_] */] = js.Array[HandleThunkActionCreator[js.Any]] | (js.Tuple2[HandleThunkActionCreator[js.Any], HandleThunkActionCreator[js.Any]]) | (js.Tuple3[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple4[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple5[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple6[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple7[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple8[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple9[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ])
  type ResolveThunks[TDispatchProps] = TDispatchProps | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ C in keyof TDispatchProps ]: react-redux.react-redux.HandleThunkActionCreator<TDispatchProps[C]>}
    */ typingsSlinky.reactDashRedux.reactDashReduxStrings.ResolveThunks with TDispatchProps)
  type Selector[S, TProps, TOwnProps] = (js.Function2[/* state */ S, /* ownProps */ TOwnProps, TProps]) | (js.Function1[/* state */ S, TProps])
  type SelectorFactory[S, TProps, TOwnProps, TFactoryOptions] = js.Function2[
    /* dispatch */ Dispatch[Action[js.Any]], 
    /* factoryOptions */ TFactoryOptions, 
    Selector[S, TProps, TOwnProps]
  ]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typingsSlinky.reactDashRedux.reactDashReduxStrings.Shared with js.Any
  type TypedUseSelectorHook[TState] = js.Function2[
    /* selector */ js.Function1[/* state */ TState, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]], 
    js.Any
  ]
}
