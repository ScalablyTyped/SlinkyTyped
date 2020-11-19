package typingsSlinky.reactNativeDrawerLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DrawerLayoutCloseEventHandler = js.Function0[scala.Unit]
  
  type DrawerLayoutOpenEventHandler = js.Function0[scala.Unit]
  
  type DrawerLayoutSlideEventHandler = js.Function1[
    /* event */ typingsSlinky.reactNativeDrawerLayout.mod.DrawerLayoutSlideEvent, 
    scala.Unit
  ]
  
  type DrawerLayoutStateChangeEventHandler = js.Function1[/* state */ java.lang.String, scala.Unit]
}
