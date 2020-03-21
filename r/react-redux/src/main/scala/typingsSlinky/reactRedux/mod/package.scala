package typingsSlinky.reactRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[
    /* component */ slinky.core.ReactComponentClass[TProps], 
    slinky.core.ReactComponentClass[TOwnProps]
  ]
  type AnyIfEmpty[T /* <: js.Object */] = T
  type ConnectedComponent[C /* <: slinky.core.ReactComponentClass[_] */, P] = (slinky.core.ReactComponentClass[typingsSlinky.react.mod._Global_.JSX.LibraryManagedAttributes[C, P]]) with (typingsSlinky.hoistNonReactStatics.mod.NonReactStatics[C, js.Object]) with typingsSlinky.reactRedux.AnonWrappedComponent[C]
  type ConnectedProps[TConnector] = js.Any
  type GetProps[C] = js.Any
  type HandleThunkActionCreator[TActionCreator] = TActionCreator | typingsSlinky.reactRedux.mod.InferThunkActionCreatorType[TActionCreator]
  type InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ js.Any, _] */] = TActionCreator | (js.Function1[/* args */ js.Any, js.Any])
  type InferableComponentEnhancer[TInjectedProps] = typingsSlinky.reactRedux.mod.InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ js.Any, 
    typingsSlinky.reactRedux.mod.ConnectedComponent[
      js.Any, 
      (typingsSlinky.reactRedux.mod.Omit[typingsSlinky.reactRedux.mod.GetProps[_], java.lang.String]) with TNeedsProps
    ]
  ]
  type MapDispatchToProps[TDispatchProps, TOwnProps] = (typingsSlinky.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps]) | TDispatchProps
  type MapDispatchToPropsFactory[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ typingsSlinky.redux.mod.Dispatch[typingsSlinky.redux.mod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    typingsSlinky.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps]
  ]
  type MapDispatchToPropsFunction[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ typingsSlinky.redux.mod.Dispatch[typingsSlinky.redux.mod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    TDispatchProps
  ]
  type MapDispatchToPropsNonObject[TDispatchProps, TOwnProps] = (typingsSlinky.reactRedux.mod.MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (typingsSlinky.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps])
  type MapDispatchToPropsParam[TDispatchProps, TOwnProps] = (typingsSlinky.reactRedux.mod.MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (typingsSlinky.reactRedux.mod.MapDispatchToProps[TDispatchProps, TOwnProps])
  type MapStateToProps[TStateProps, TOwnProps, State] = js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]
  type MapStateToPropsFactory[TStateProps, TOwnProps, State] = js.Function2[
    /* initialState */ State, 
    /* ownProps */ TOwnProps, 
    typingsSlinky.reactRedux.mod.MapStateToProps[TStateProps, TOwnProps, State]
  ]
  type MapStateToPropsParam[TStateProps, TOwnProps, State] = js.UndefOr[
    (typingsSlinky.reactRedux.mod.MapStateToPropsFactory[TStateProps, TOwnProps, State]) | (typingsSlinky.reactRedux.mod.MapStateToProps[TStateProps, TOwnProps, State]) | scala.Null
  ]
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.reactRedux.reactReduxStrings.Matching with js.Any
  type MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function3[
    /* stateProps */ TStateProps, 
    /* dispatchProps */ TDispatchProps, 
    /* ownProps */ TOwnProps, 
    TMergedProps
  ]
  type Omit[T, K /* <: java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
  type ResolveArrayThunks[TDispatchProps /* <: js.Array[_] */] = js.Array[typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any]] | (js.Tuple2[
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple3[
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple4[
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple5[
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple6[
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple7[
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple8[
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple9[
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsSlinky.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ])
  type ResolveThunks[TDispatchProps] = TDispatchProps | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ C in keyof TDispatchProps ]: react-redux.react-redux.HandleThunkActionCreator<TDispatchProps[C]>}
    */ typingsSlinky.reactRedux.reactReduxStrings.ResolveThunks with TDispatchProps)
  type RootStateOrAny = typingsSlinky.reactRedux.mod.AnyIfEmpty[typingsSlinky.reactRedux.mod.DefaultRootState]
  type Selector[S, TProps, TOwnProps] = (js.Function2[/* state */ S, /* ownProps */ TOwnProps, TProps]) | (js.Function1[/* state */ S, TProps])
  type SelectorFactory[S, TProps, TOwnProps, TFactoryOptions] = js.Function2[
    /* dispatch */ typingsSlinky.redux.mod.Dispatch[typingsSlinky.redux.mod.Action[js.Any]], 
    /* factoryOptions */ TFactoryOptions, 
    typingsSlinky.reactRedux.mod.Selector[S, TProps, TOwnProps]
  ]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typingsSlinky.reactRedux.reactReduxStrings.Shared with js.Any
  type TypedUseSelectorHook[TState] = js.Function2[
    /* selector */ js.Function1[/* state */ TState, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, scala.Boolean]], 
    js.Any
  ]
}
