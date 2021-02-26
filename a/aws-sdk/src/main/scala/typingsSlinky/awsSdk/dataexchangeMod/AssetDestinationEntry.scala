package typingsSlinky.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetDestinationEntry extends StObject {
  
  /**
    * The unique identifier for the asset.
    */
  var AssetId: Id = js.native
  
  /**
    * The S3 bucket that is the destination for the asset.
    */
  var Bucket: string = js.native
  
  /**
    * The name of the object in Amazon S3 for the asset.
    */
  var Key: js.UndefOr[string] = js.native
}
object AssetDestinationEntry {
  
  @scala.inline
  def apply(AssetId: Id, Bucket: string): AssetDestinationEntry = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDestinationEntry]
  }
  
  @scala.inline
  implicit class AssetDestinationEntryMutableBuilder[Self <: AssetDestinationEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: Id): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: string): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: string): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
