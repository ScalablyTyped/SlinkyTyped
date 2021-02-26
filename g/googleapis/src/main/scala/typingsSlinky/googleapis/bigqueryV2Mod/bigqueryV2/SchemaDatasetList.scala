package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import typingsSlinky.googleapis.anon.DatasetReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDatasetList extends StObject {
  
  /**
    * An array of the dataset resources in the project. Each resource contains
    * basic information. For full information about a particular dataset
    * resource, use the Datasets: get method. This property is omitted when
    * there are no datasets in the project.
    */
  var datasets: js.UndefOr[js.Array[DatasetReference]] = js.native
  
  /**
    * A hash value of the results page. You can use this property to determine
    * if the page has changed since the last request.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The list type. This property always returns the value
    * &quot;bigquery#datasetList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A token that can be used to request the next results page. This property
    * is omitted on the final results page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaDatasetList {
  
  @scala.inline
  def apply(): SchemaDatasetList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatasetList]
  }
  
  @scala.inline
  implicit class SchemaDatasetListMutableBuilder[Self <: SchemaDatasetList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasets(value: js.Array[DatasetReference]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    @scala.inline
    def setDatasetsVarargs(value: DatasetReference*): Self = StObject.set(x, "datasets", js.Array(value :_*))
    
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
