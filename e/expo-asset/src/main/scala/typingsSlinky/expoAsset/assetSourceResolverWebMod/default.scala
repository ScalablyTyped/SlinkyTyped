package typingsSlinky.expoAsset.assetSourceResolverWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
@js.native
class default protected () extends AssetSourceResolver {
  def this(serverUrl: js.UndefOr[Null | String], jsbundleUrl: js.UndefOr[Null | String], asset: PackagerAsset) = this()
}

/* static members */
@JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
@js.native
object default extends js.Object {
  def pickScale(scales: js.Array[Double], deviceScale: Double): Double = js.native
}

