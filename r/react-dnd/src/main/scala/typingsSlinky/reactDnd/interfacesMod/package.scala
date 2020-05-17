package typingsSlinky.reactDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type DndComponentClass[C /* <: slinky.core.ReactComponentClass[_] */, P] = (slinky.core.ReactComponentClass[typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes[C, P]]) with (typingsSlinky.hoistNonReactStatics.mod.NonReactStatics[C, js.Object]) with typingsSlinky.reactDnd.anon.DecoratedComponent[C]
  type DndComponentEnhancer[CollectedProps] = js.Function1[
    /* component */ js.Any, 
    typingsSlinky.reactDnd.interfacesMod.DndComponentClass[
      js.Any, 
      typingsSlinky.reactDnd.interfacesMod.Omit[
        typingsSlinky.reactDnd.interfacesMod.GetProps[js.Any], 
        /* keyof react-dnd.react-dnd/lib/decorators/interfaces.Shared<CollectedProps, react-dnd.react-dnd/lib/decorators/interfaces.GetProps<any>> */ java.lang.String
      ]
    ]
  ]
  type DragLayerCollector[TargetProps, CollectedProps] = js.Function2[
    /* monitor */ typingsSlinky.reactDnd.monitorsMod.DragLayerMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DragSourceCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ typingsSlinky.reactDnd.interfacesMod.DragSourceConnector, 
    /* monitor */ typingsSlinky.reactDnd.monitorsMod.DragSourceMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DropTargetCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ typingsSlinky.reactDnd.interfacesMod.DropTargetConnector, 
    /* monitor */ typingsSlinky.reactDnd.monitorsMod.DropTargetMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.reactDnd.reactDndStrings.Matching with org.scalablytyped.runtime.TopLevel[js.Any]
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typingsSlinky.reactDnd.reactDndStrings.Shared with org.scalablytyped.runtime.TopLevel[js.Any]
}
