package typingsSlinky.expoAsset

import typingsSlinky.expoAsset.assetMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset/build/AssetHooks", JSImport.Namespace)
@js.native
object assetHooksMod extends js.Object {
  
  def useAssets(moduleIds: js.Array[Double]): js.Tuple2[js.UndefOr[js.Array[Asset]], js.UndefOr[js.Error]] = js.native
  def useAssets(moduleIds: Double): js.Tuple2[js.UndefOr[js.Array[Asset]], js.UndefOr[js.Error]] = js.native
}
