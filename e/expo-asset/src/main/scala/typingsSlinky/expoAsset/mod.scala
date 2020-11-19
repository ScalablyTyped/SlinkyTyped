package typingsSlinky.expoAsset

import typingsSlinky.expoAsset.assetMod.AssetDescriptor
import typingsSlinky.expoAsset.assetMod.AssetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
    
    def loadAsync(moduleId: js.Array[Double]): js.Promise[js.Array[Unit]] = js.native
    def loadAsync(moduleId: Double): js.Promise[js.Array[Unit]] = js.native
  }
}
