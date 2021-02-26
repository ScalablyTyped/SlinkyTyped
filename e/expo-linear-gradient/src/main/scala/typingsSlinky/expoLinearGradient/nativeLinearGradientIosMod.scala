package typingsSlinky.expoLinearGradient

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.expoLinearGradient.nativeLinearGradientTypesMod.NativeLinearGradientProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeLinearGradientIosMod extends Shortcut {
  
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.ios", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NativeLinearGradientProps] = js.native
  
  type _To = ReactComponentClass[NativeLinearGradientProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeLinearGradientIosMod.foo` */
  override def _to: ReactComponentClass[NativeLinearGradientProps] = default
}
