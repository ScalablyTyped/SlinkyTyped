package typingsSlinky.reactNavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type NavigationDrawerScreenComponent[Params, ScreenProps] = (slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerScreenProps[Params, ScreenProps]
  ]) with (typingsSlinky.reactNavigationDrawer.anon.NavigationOptions[Params, ScreenProps])
  
  type SceneDescriptorMap = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.reactNavigation.mod.NavigationDescriptor[
      typingsSlinky.reactNavigation.mod.NavigationParams, 
      typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerOptions, 
      typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerProp[
        typingsSlinky.reactNavigation.mod.NavigationRoute[typingsSlinky.reactNavigation.mod.NavigationParams], 
        js.Any
      ]
    ]
  ]
  
  type ThemedColor = java.lang.String | typingsSlinky.reactNavigationDrawer.anon.Dark
}
