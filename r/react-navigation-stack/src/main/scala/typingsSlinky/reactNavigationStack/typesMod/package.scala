package typingsSlinky.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type NavigationStackScreenComponent[Params, ScreenProps] = (slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigationStack.typesMod.NavigationStackScreenProps[Params, ScreenProps]
  ]) with (typingsSlinky.reactNavigationStack.anon.NavigationOptions[Params, ScreenProps])
  type NavigationStackState = typingsSlinky.reactNavigation.mod.NavigationState
  type SceneDescriptorMap = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.reactNavigation.mod.NavigationDescriptor[
      typingsSlinky.reactNavigation.mod.NavigationParams, 
      typingsSlinky.reactNavigationStack.typesMod.NavigationStackOptions, 
      typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp[
        typingsSlinky.reactNavigation.mod.NavigationRoute[typingsSlinky.reactNavigation.mod.NavigationParams], 
        typingsSlinky.reactNavigation.mod.NavigationParams
      ]
    ]
  ]
  type SceneInterpolator = js.Function1[
    /* props */ typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps, 
    js.Any
  ]
}
