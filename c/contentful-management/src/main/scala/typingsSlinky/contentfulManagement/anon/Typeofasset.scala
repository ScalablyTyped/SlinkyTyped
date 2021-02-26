package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.assetMod.Asset
import typingsSlinky.contentfulManagement.assetMod.AssetProps
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofasset extends StObject {
  
  def wrapAsset(http: AxiosInstance, data: AssetProps): Asset = js.native
  
  def wrapAssetCollection(http: AxiosInstance, data: CollectionProp[AssetProps]): Collection[Asset, AssetProps] = js.native
}
object Typeofasset {
  
  @scala.inline
  def apply(
    wrapAsset: (AxiosInstance, AssetProps) => Asset,
    wrapAssetCollection: (AxiosInstance, CollectionProp[AssetProps]) => Collection[Asset, AssetProps]
  ): Typeofasset = {
    val __obj = js.Dynamic.literal(wrapAsset = js.Any.fromFunction2(wrapAsset), wrapAssetCollection = js.Any.fromFunction2(wrapAssetCollection))
    __obj.asInstanceOf[Typeofasset]
  }
  
  @scala.inline
  implicit class TypeofassetMutableBuilder[Self <: Typeofasset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapAsset(value: (AxiosInstance, AssetProps) => Asset): Self = StObject.set(x, "wrapAsset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapAssetCollection(value: (AxiosInstance, CollectionProp[AssetProps]) => Collection[Asset, AssetProps]): Self = StObject.set(x, "wrapAssetCollection", js.Any.fromFunction2(value))
  }
}
