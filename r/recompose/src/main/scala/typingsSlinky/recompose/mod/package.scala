package typingsSlinky.recompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentEnhancer[TInner, TOutter] = js.Function1[
    /* component */ slinky.core.ReactComponentClass[TInner], 
    slinky.core.ReactComponentClass[TOutter]
  ]
  type DefaultingInferableComponentEnhancer[TInjectedProps] = typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps[TInjectedProps, typingsSlinky.std.Partial[TInjectedProps]]
  // withHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
  type EventHandler = js.Function
  type HandleCreators[TOutter, THandlers] = typingsSlinky.recompose.mod.HandleCreatorsStructure[TOutter] with (typingsSlinky.recompose.mod.HandleCreatorsHandlers[TOutter, THandlers])
  type HandleCreatorsFactory[TOutter, THandlers] = js.Function1[
    /* initialProps */ TOutter, 
    typingsSlinky.recompose.mod.HandleCreators[TOutter, THandlers]
  ]
  // This type is required to infer THandlers
  type HandleCreatorsHandlers[TOutter, THandlers] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof THandlers ]: (props : TOutter): THandlers[P]}
    */ typingsSlinky.recompose.recomposeStrings.HandleCreatorsHandlers with org.scalablytyped.runtime.TopLevel[THandlers]
  // This type is required to infer TOutter
  type HandleCreatorsStructure[TOutter] = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.recompose.mod.mapper[TOutter, typingsSlinky.recompose.mod.EventHandler]
  ]
  type InferableComponentEnhancer[TInjectedProps] = typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ slinky.core.ReactComponentClass[TInjectedProps], 
    slinky.core.ReactComponentClass[
      (typingsSlinky.recompose.mod.Omit[TInjectedProps, /* keyof TInjectedProps */ java.lang.String]) with TNeedsProps
    ]
  ]
  // renameProps: https://github.com/acdlite/recompose/blob/master/docs/API.md#renameProps
  type NameMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  // Diff / Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance] = (typingsSlinky.recompose.mod._ReactLifeCycleFunctionsThisArguments[TProps, TState]) with TInstance
  // withStateHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
  type StateHandler[TState] = js.Function1[/* repeated */ js.Any, js.UndefOr[typingsSlinky.std.Partial[TState]]]
  type StateHandlerMap[TState] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.recompose.mod.StateHandler[TState]]
  type StateUpdaters[TOutter, TState, TUpdaters] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ updaterName in keyof TUpdaters ]: (state : TState, props : TOutter): TUpdaters[updaterName]}
    */ typingsSlinky.recompose.recomposeStrings.StateUpdaters with org.scalablytyped.runtime.TopLevel[TUpdaters]
  // createEagerFactory: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEagerFactory
  type componentFactory = js.Function2[
    /* props */ js.UndefOr[js.Object], 
    /* children */ js.UndefOr[slinky.core.TagMod[scala.Any]], 
    slinky.core.facade.ReactElement
  ]
  type mapper[TInner, TOutter] = js.Function1[/* input */ TInner, TOutter]
  type predicate[T] = typingsSlinky.recompose.mod.mapper[T, scala.Boolean]
  type predicateDiff[T] = js.Function2[/* current */ T, /* next */ T, scala.Boolean]
  // withReducer: https://github.com/acdlite/recompose/blob/master/docs/API.md#withReducer
  type reducer[TState, TAction] = js.Function2[/* s */ TState, /* a */ TAction, TState]
}
