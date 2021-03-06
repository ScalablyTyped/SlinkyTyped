package typingsSlinky.expoLinearGradient

import slinky.core.facade.ReactElement
import typingsSlinky.expoLinearGradient.anon.Colors
import typingsSlinky.expoLinearGradient.anon.TypeofView
import typingsSlinky.expoLinearGradient.anon.X
import typingsSlinky.expoLinearGradient.nativeLinearGradientTypesMod.NativeLinearGradientPoint
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-linear-gradient", "LinearGradient")
  @js.native
  def LinearGradient(hasColorsLocationsStartEndProps: PropsWithChildren[LinearGradientProps]): ReactElement = js.native
  
  type LinearGradientPoint = X | NativeLinearGradientPoint
  
  type LinearGradientProps = Colors with ComponentProps[TypeofView]
}
