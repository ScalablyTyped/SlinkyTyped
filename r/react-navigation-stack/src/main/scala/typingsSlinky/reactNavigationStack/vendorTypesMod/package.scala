package typingsSlinky.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vendorTypesMod {
  type NavigationStackState = typingsSlinky.reactNavigation.mod.NavigationState
  type Route[T /* <: java.lang.String */] = typingsSlinky.reactNavigation.mod.NavigationRoute[typingsSlinky.reactNavigation.mod.NavigationParams]
  type StackCardStyleInterpolator = js.Function1[
    /* props */ typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps, 
    typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
  ]
  type StackDescriptor = typingsSlinky.reactNavigation.mod.NavigationDescriptor[
    typingsSlinky.reactNavigation.mod.NavigationParams, 
    typingsSlinky.reactNavigationStack.vendorTypesMod.StackNavigationOptions, 
    typingsSlinky.reactNavigationStack.vendorTypesMod.StackNavigationProp[
      typingsSlinky.reactNavigation.mod.NavigationRoute[typingsSlinky.reactNavigation.mod.NavigationParams], 
      typingsSlinky.reactNavigation.mod.NavigationParams
    ]
  ]
  type StackDescriptorMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactNavigationStack.vendorTypesMod.StackDescriptor]
  type StackHeaderStyleInterpolator = js.Function1[
    /* props */ typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps, 
    typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
  ]
  type StackNavigationHelpers = typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigationStack.vendorTypesMod.NavigationStackState]
}
