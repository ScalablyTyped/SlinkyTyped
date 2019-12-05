package typingsSlinky.reactDashDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDecoratorsInterfacesMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.hoistDashNonDashReactDashStatics.hoistDashNonDashReactDashStaticsMod.NonReactStatics
  import typingsSlinky.react.reactMod._Global_.JSX.LibraryManagedAttributes
  import typingsSlinky.reactDashDnd.Anon_DecoratedComponent
  import typingsSlinky.reactDashDnd.libInterfacesMonitorsMod.DragLayerMonitor
  import typingsSlinky.reactDashDnd.libInterfacesMonitorsMod.DragSourceMonitor
  import typingsSlinky.reactDashDnd.libInterfacesMonitorsMod.DropTargetMonitor
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type DndComponentClass[C /* <: ReactComponentClass[_] */, P] = (ReactComponentClass[LibraryManagedAttributes[C, P]]) with (NonReactStatics[C, js.Object]) with Anon_DecoratedComponent[C]
  type DndComponentEnhancer[CollectedProps] = js.Function1[/* component */ js.Any, DndComponentClass[js.Any, Omit[GetProps[js.Any], String]]]
  type DragLayerCollector[TargetProps, CollectedProps] = js.Function2[/* monitor */ DragLayerMonitor, /* props */ TargetProps, CollectedProps]
  type DragSourceCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ DragSourceConnector, 
    /* monitor */ DragSourceMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DropTargetCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ DropTargetConnector, 
    /* monitor */ DropTargetMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.reactDashDnd.reactDashDndStrings.Matching with js.Any
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typingsSlinky.reactDashDnd.reactDashDndStrings.Shared with js.Any
}
