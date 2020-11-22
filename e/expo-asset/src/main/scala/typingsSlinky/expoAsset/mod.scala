package typingsSlinky.expoAsset

import typingsSlinky.expoAsset.assetMod.AssetDescriptor
import typingsSlinky.expoAsset.assetMod.AssetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def useAssets(moduleIds: js.Array[Double]): js.Tuple2[js.UndefOr[js.Array[typingsSlinky.expoAsset.assetMod.Asset]], js.UndefOr[js.Error]] = js.native
  def useAssets(moduleIds: Double): js.Tuple2[js.UndefOr[js.Array[typingsSlinky.expoAsset.assetMod.Asset]], js.UndefOr[js.Error]] = js.native
  
  @js.native
  class Asset protected ()
    extends typingsSlinky.expoAsset.assetMod.Asset {
    def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
  }
  /* static members */
  @js.native
  object Asset extends js.Object {
    
    def fromMetadata(meta: AssetMetadata): typingsSlinky.expoAsset.assetMod.Asset = js.native
    
    def fromModule(virtualAssetModule: String): typingsSlinky.expoAsset.assetMod.Asset = js.native
    def fromModule(virtualAssetModule: Double): typingsSlinky.expoAsset.assetMod.Asset = js.native
    
    def fromURI(uri: String): typingsSlinky.expoAsset.assetMod.Asset = js.native
    
    def loadAsync(moduleId: String): js.Promise[js.Array[typingsSlinky.expoAsset.assetMod.Asset]] = js.native
    def loadAsync(moduleId: js.Array[Double | String]): js.Promise[js.Array[typingsSlinky.expoAsset.assetMod.Asset]] = js.native
    def loadAsync(moduleId: Double): js.Promise[js.Array[typingsSlinky.expoAsset.assetMod.Asset]] = js.native
  }
}
