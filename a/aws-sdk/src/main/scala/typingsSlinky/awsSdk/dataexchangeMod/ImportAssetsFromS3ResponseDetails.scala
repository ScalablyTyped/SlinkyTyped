package typingsSlinky.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAssetsFromS3ResponseDetails extends StObject {
  
  /**
    * Is a list of Amazon S3 bucket and object key pairs.
    */
  var AssetSources: ListOfAssetSourceEntry = js.native
  
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id = js.native
  
  /**
    * The unique identifier for the revision associated with this import response.
    */
  var RevisionId: Id = js.native
}
object ImportAssetsFromS3ResponseDetails {
  
  @scala.inline
  def apply(AssetSources: ListOfAssetSourceEntry, DataSetId: Id, RevisionId: Id): ImportAssetsFromS3ResponseDetails = {
    val __obj = js.Dynamic.literal(AssetSources = AssetSources.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetsFromS3ResponseDetails]
  }
  
  @scala.inline
  implicit class ImportAssetsFromS3ResponseDetailsMutableBuilder[Self <: ImportAssetsFromS3ResponseDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetSources(value: ListOfAssetSourceEntry): Self = StObject.set(x, "AssetSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetSourcesVarargs(value: AssetSourceEntry*): Self = StObject.set(x, "AssetSources", js.Array(value :_*))
    
    @scala.inline
    def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
