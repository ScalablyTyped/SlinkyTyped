package typingsSlinky.reactDashRelay.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPoint
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPointProps
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.IEnvironmentProvider
import typingsSlinky.reactDashRelay.libRelayDashExperimentalLazyLoadEntryPointContainerMod.EntryPointContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LazyLoadEntryPointContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-relay/hooks", "LazyLoadEntryPointContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps](
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
  TRuntimeProps,
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (environmentProvider != null) __obj.updateDynamic("environmentProvider")(environmentProvider.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object]]
  }
  type Props = EntryPointContainerProps[js.Any, js.Any, js.Any, js.Any, js.Any]
}

