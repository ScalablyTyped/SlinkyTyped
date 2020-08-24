package typingsSlinky.reactNativeAppearance

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeAppearance.appearanceTypesMod.AppearancePreferences
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-appearance/lib/typescript/NativeAppearance.web", JSImport.Namespace)
@js.native
object nativeAppearanceWebMod extends js.Object {
  def NativeAppearanceProvider(props: js.Any): ReactElement = js.native
  @js.native
  object NativeAppearance extends js.Object {
    val initialPreferences: AppearancePreferences = js.native
    val name: String = js.native
  }
  
}

