package typingsSlinky.reactRelay.entryPointTypesMod

import typingsSlinky.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsSlinky.reactRelay.reactRelayStrings.entryPoints
import typingsSlinky.reactRelay.reactRelayStrings.extraProps
import typingsSlinky.reactRelay.reactRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-relay.react-relay/lib/relay-experimental/EntryPointTypes.InternalEntryPointRepresentation<TEntryPointParams, react.react._Global_.JSX.LibraryManagedAttributes<TEntryPointComponent, 'queries'>, react.react._Global_.JSX.LibraryManagedAttributes<TEntryPointComponent, 'entryPoints'>, react.react._Global_.JSX.LibraryManagedAttributes<TEntryPointComponent, 'props'>, react.react._Global_.JSX.LibraryManagedAttributes<TEntryPointComponent, 'extraProps'>> */
trait EntryPoint[TEntryPointParams, TEntryPointComponent] extends js.Object {
  val getPreloadProps: js.Function1[
    /* entryPointParams */ TEntryPointParams, 
    PreloadProps[
      TEntryPointParams, 
      LibraryManagedAttributes[TEntryPointComponent, queries], 
      LibraryManagedAttributes[TEntryPointComponent, entryPoints], 
      LibraryManagedAttributes[TEntryPointComponent, extraProps], 
      EnvironmentProviderOptions
    ]
  ]
  val root: js.Any
}

object EntryPoint {
  @scala.inline
  def apply[TEntryPointParams, TEntryPointComponent](
    getPreloadProps: /* entryPointParams */ TEntryPointParams => PreloadProps[
      TEntryPointParams, 
      LibraryManagedAttributes[TEntryPointComponent, queries], 
      LibraryManagedAttributes[TEntryPointComponent, entryPoints], 
      LibraryManagedAttributes[TEntryPointComponent, extraProps], 
      EnvironmentProviderOptions
    ],
    root: js.Any
  ): EntryPoint[TEntryPointParams, TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(getPreloadProps = js.Any.fromFunction1(getPreloadProps), root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntryPoint[TEntryPointParams, TEntryPointComponent]]
  }
}

