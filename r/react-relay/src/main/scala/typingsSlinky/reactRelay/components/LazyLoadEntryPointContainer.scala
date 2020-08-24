package typingsSlinky.reactRelay.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPoint
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPointProps
import typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typingsSlinky.reactRelay.lazyLoadEntryPointContainerMod.EntryPointContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LazyLoadEntryPointContainer {
  @JSImport("react-relay/hooks", "LazyLoadEntryPointContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: js.Object */ TEntryPointParams, /* <: js.Object */ TPreloadedQueries, /* <: js.Object */ TPreloadedEntryPoints, /* <: js.Object */ TRuntimeProps, TExtraProps] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def environmentProvider(value: IEnvironmentProvider[EnvironmentProviderOptions]): this.type = set("environmentProvider", value.asInstanceOf[js.Any])
  }
  
  def withProps[/* <: js.Object */ TEntryPointParams, /* <: js.Object */ TPreloadedQueries, /* <: js.Object */ TPreloadedEntryPoints, /* <: js.Object */ TRuntimeProps, TExtraProps](
    p: EntryPointContainerProps[
      // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ]
  ): Builder[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = new Builder[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: js.Object */ TEntryPointParams, /* <: js.Object */ TPreloadedQueries, /* <: js.Object */ TPreloadedEntryPoints, /* <: js.Object */ TRuntimeProps, TExtraProps](
    entryPoint: EntryPoint[
      // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
      ReactComponentClass[
        EntryPointProps[
          // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
          // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
          // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
          // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
        ]
      ]
    ],
    entryPointParams: // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams,
    props: // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps
  ): Builder[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __props = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    new Builder[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](js.Array(this.component, __props.asInstanceOf[EntryPointContainerProps[
      // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ]]))
  }
}

