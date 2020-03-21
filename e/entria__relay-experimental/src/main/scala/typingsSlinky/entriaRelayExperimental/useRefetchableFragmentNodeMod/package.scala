package typingsSlinky.entriaRelayExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useRefetchableFragmentNodeMod {
  type RefetchExact[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = js.Function1[
    /* data */ js.UndefOr[js.Any | scala.Null], 
    typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnExact[TQuery, TOptions]
  ]
  type RefetchExactDynamicResponse[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsSlinky.std.ReturnType[
    typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchExact[TQuery, TOptions]
  ]
  type RefetchFn[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnExact[TQuery, TOptions]
  type RefetchFnBase[TVars, TOptions] = js.Function2[
    /* vars */ TVars, 
    /* options */ js.UndefOr[TOptions], 
    typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
  type RefetchFnDynamic[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TKey /* <: org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null */, TOptions] = (typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchInexactDynamicResponse[TQuery, TOptions]) with (typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchExactDynamicResponse[TQuery, TOptions])
  type RefetchFnExact[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnBase[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  type RefetchFnInexact[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnBase[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  type RefetchInexact[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = js.Function1[
    /* data */ js.UndefOr[js.Any], 
    typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnInexact[TQuery, TOptions]
  ]
  type RefetchInexactDynamicResponse[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsSlinky.std.ReturnType[
    typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchInexact[TQuery, TOptions]
  ]
}
