package typingsSlinky.reactNativeModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AnimationEvent = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type OnOrientationChange = js.Function1[
    slinky.core.SyntheticEvent[typingsSlinky.reactNative.mod.NodeHandle, js.Any], 
    scala.Unit
  ]
  
  type OrNull[T] = scala.Null | T
  
  type SupportedAnimation = typingsSlinky.reactNativeAnimatable.mod.Animation | (typingsSlinky.reactNativeAnimatable.mod.CustomAnimation[
    typingsSlinky.reactNative.mod.TextStyle with typingsSlinky.reactNative.mod.ViewStyle with typingsSlinky.reactNative.mod.ImageStyle
  ])
}
