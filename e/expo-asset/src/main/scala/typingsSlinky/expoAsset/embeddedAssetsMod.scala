package typingsSlinky.expoAsset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset/build/EmbeddedAssets", JSImport.Namespace)
@js.native
object embeddedAssetsMod extends js.Object {
  
  def getEmbeddedAssetUri(hash: String): String | Null = js.native
  def getEmbeddedAssetUri(hash: String, `type`: String): String | Null = js.native
}
