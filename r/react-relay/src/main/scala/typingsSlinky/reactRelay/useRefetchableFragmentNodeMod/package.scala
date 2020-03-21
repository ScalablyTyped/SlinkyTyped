package typingsSlinky.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useRefetchableFragmentNodeMod {
  type RefetchExact[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = js.Function1[
    /* data */ js.UndefOr[js.Any | scala.Null], 
    typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchFnExact[TQuery, TOptions]
  ]
  type RefetchExactDynamicResponse[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsSlinky.std.ReturnType[
    typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchExact[TQuery, TOptions]
  ]
  type RefetchFn[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchFnExact[TQuery, TOptions]
  type RefetchFnBase[TVars, TOptions] = js.Function2[
    /* vars */ TVars, 
    /* options */ js.UndefOr[TOptions], 
    typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
  type RefetchFnDynamic[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TKey /* <: org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null */, TOptions] = (typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchInexactDynamicResponse[TQuery, TOptions]) with (typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchExactDynamicResponse[TQuery, TOptions])
  type RefetchFnExact[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchFnBase[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  type RefetchFnInexact[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchFnBase[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  type RefetchInexact[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = js.Function1[
    /* data */ js.UndefOr[js.Any], 
    typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchFnInexact[TQuery, TOptions]
  ]
  type RefetchInexactDynamicResponse[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsSlinky.std.ReturnType[
    typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchInexact[TQuery, TOptions]
  ]
}
