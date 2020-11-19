package typingsSlinky.reactNativeSafeAreaContext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object safeAreaTypesMod {
  
  type InsetChangeNativeCallback = js.Function1[
    slinky.core.SyntheticEvent[
      typingsSlinky.reactNative.mod.NodeHandle, 
      typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
    ], 
    scala.Unit
  ]
  
  type InsetChangedEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
  ]
}
