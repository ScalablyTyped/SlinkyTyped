package typingsSlinky.reactNativeNavigation

import typingsSlinky.reactNative.mod.ImageRequireSource
import typingsSlinky.reactNative.mod.ImageResolvedAssetSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/adapters/AssetResolver", JSImport.Namespace)
@js.native
object assetResolverMod extends js.Object {
  @js.native
  class AssetService () extends js.Object {
    def resolveFromRequire(value: ImageRequireSource): ImageResolvedAssetSource = js.native
  }
  
}

