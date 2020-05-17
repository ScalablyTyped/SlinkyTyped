package typingsSlinky.reactRelay.entryPointTypesMod

import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.reactRelay.reactRelayStrings.entryPoints
import typingsSlinky.reactRelay.reactRelayStrings.extraProps
import typingsSlinky.reactRelay.reactRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-relay.react-relay/lib/relay-experimental/EntryPointTypes.InternalEntryPointRepresentation<TEntryPointParams, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'queries'>, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'entryPoints'>, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'props'>, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'extraProps'>> */
@js.native
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
  ] = js.native
  val root: js.Any = js.native
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
  @scala.inline
  implicit class EntryPointOps[Self[tentrypointparams, tentrypointcomponent] <: EntryPoint[tentrypointparams, tentrypointcomponent], TEntryPointParams, TEntryPointComponent] (val x: Self[TEntryPointParams, TEntryPointComponent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntryPointParams, TEntryPointComponent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntryPointParams, TEntryPointComponent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TEntryPointParams, TEntryPointComponent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TEntryPointParams, TEntryPointComponent]) with Other]
    @scala.inline
    def withGetPreloadProps(
      value: /* entryPointParams */ TEntryPointParams => PreloadProps[
          TEntryPointParams, 
          LibraryManagedAttributes[TEntryPointComponent, queries], 
          LibraryManagedAttributes[TEntryPointComponent, entryPoints], 
          LibraryManagedAttributes[TEntryPointComponent, extraProps], 
          EnvironmentProviderOptions
        ]
    ): Self[TEntryPointParams, TEntryPointComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreloadProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoot(value: js.Any): Self[TEntryPointParams, TEntryPointComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

