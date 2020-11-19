package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routeInterfaceMod {
  
  type NavigationHookCallback = js.Function0[
    typingsSlinky.ionicCore.routeInterfaceMod.NavigationHookResult | js.Promise[typingsSlinky.ionicCore.routeInterfaceMod.NavigationHookResult]
  ]
  
  type NavigationHookResult = scala.Boolean | typingsSlinky.ionicCore.routeInterfaceMod.NavigationHookOptions
}
