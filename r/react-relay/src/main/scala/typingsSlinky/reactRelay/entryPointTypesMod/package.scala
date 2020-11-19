package typingsSlinky.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object entryPointTypesMod {
  
  type EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = slinky.core.ReactComponentClass[
    typingsSlinky.reactRelay.entryPointTypesMod.EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  ]
  
  type EnvironmentProviderOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ExtractEntryPointTypeHelper[TEntryPointParams] = js.Function1[
    /* entryPoint */ js.UndefOr[
      typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint[js.Any] | scala.Null
    ], 
    js.UndefOr[
      (typingsSlinky.reactRelay.entryPointTypesMod.ThinNestedEntryPointParams[
        TEntryPointParams, 
        typingsSlinky.reactRelay.entryPointTypesMod.EntryPoint[TEntryPointParams, js.Any]
      ]) | scala.Null
    ]
  ]
  
  type ExtractQueryTypeHelper[TEnvironmentProviderOptions] = js.Function1[
    /* query */ typingsSlinky.reactRelay.entryPointTypesMod.PreloadedQuery[
      typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType, 
      typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
    ], 
    typingsSlinky.reactRelay.entryPointTypesMod.ThinQueryParams[
      typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType, 
      TEnvironmentProviderOptions
    ]
  ]
  
  type PreloadableConcreteRequest[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */] = js.Object
}
