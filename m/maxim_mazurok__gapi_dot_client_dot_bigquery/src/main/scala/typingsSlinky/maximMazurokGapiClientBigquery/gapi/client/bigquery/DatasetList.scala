package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetList extends StObject {
  
  /**
    * An array of the dataset resources in the project. Each resource contains basic information. For full information about a particular dataset resource, use the Datasets: get method.
    * This property is omitted when there are no datasets in the project.
    */
  var datasets: js.UndefOr[js.Array[typingsSlinky.maximMazurokGapiClientBigquery.anon.DatasetReference]] = js.native
  
  /** A hash value of the results page. You can use this property to determine if the page has changed since the last request. */
  var etag: js.UndefOr[String] = js.native
  
  /** The list type. This property always returns the value "bigquery#datasetList". */
  var kind: js.UndefOr[String] = js.native
  
  /** A token that can be used to request the next results page. This property is omitted on the final results page. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object DatasetList {
  
  @scala.inline
  def apply(): DatasetList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetList]
  }
  
  @scala.inline
  implicit class DatasetListMutableBuilder[Self <: DatasetList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasets(value: js.Array[typingsSlinky.maximMazurokGapiClientBigquery.anon.DatasetReference]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    @scala.inline
    def setDatasetsVarargs(value: typingsSlinky.maximMazurokGapiClientBigquery.anon.DatasetReference*): Self = StObject.set(x, "datasets", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
