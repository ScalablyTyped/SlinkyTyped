package typingsSlinky.expoDashAsset

import typingsSlinky.expoDashAsset.buildAssetMod.AssetDescriptor
import typingsSlinky.expoDashAsset.buildAssetMod.AssetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-asset", JSImport.Namespace)
@js.native
object expoDashAssetMod extends js.Object {
  @js.native
  class Asset protected ()
    extends typingsSlinky.expoDashAsset.buildAssetMod.Asset {
    def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
  }
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromMetadata(meta: AssetMetadata): typingsSlinky.expoDashAsset.buildAssetMod.Asset = js.native
    def fromModule(virtualAssetModule: String): typingsSlinky.expoDashAsset.buildAssetMod.Asset = js.native
    def fromModule(virtualAssetModule: Double): typingsSlinky.expoDashAsset.buildAssetMod.Asset = js.native
    def fromURI(uri: String): typingsSlinky.expoDashAsset.buildAssetMod.Asset = js.native
    def loadAsync(moduleId: js.Array[Double]): js.Promise[js.Array[Unit]] = js.native
    def loadAsync(moduleId: Double): js.Promise[js.Array[Unit]] = js.native
  }
  
}

