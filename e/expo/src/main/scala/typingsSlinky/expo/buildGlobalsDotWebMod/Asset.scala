package typingsSlinky.expo.buildGlobalsDotWebMod

import typingsSlinky.expoDashAsset.buildAssetMod.AssetDescriptor
import typingsSlinky.expoDashAsset.buildAssetMod.AssetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/globals.web", "Asset")
@js.native
class Asset protected ()
  extends typingsSlinky.expoDashAsset.expoDashAssetMod.Asset {
  def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
}

/* static members */
@JSImport("expo/build/globals.web", "Asset")
@js.native
object Asset extends js.Object {
  def fromMetadata(meta: AssetMetadata): typingsSlinky.expoDashAsset.buildAssetMod.Asset = js.native
  def fromModule(virtualAssetModule: String): typingsSlinky.expoDashAsset.buildAssetMod.Asset = js.native
  def fromModule(virtualAssetModule: Double): typingsSlinky.expoDashAsset.buildAssetMod.Asset = js.native
  def fromURI(uri: String): typingsSlinky.expoDashAsset.buildAssetMod.Asset = js.native
  def loadAsync(moduleId: js.Array[Double]): js.Promise[js.Array[Unit]] = js.native
  def loadAsync(moduleId: Double): js.Promise[js.Array[Unit]] = js.native
}

