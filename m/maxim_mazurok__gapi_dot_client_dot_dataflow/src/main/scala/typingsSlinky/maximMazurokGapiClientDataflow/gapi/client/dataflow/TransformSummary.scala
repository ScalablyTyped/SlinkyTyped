package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformSummary extends StObject {
  
  /** Transform-specific display data. */
  var displayData: js.UndefOr[js.Array[DisplayData]] = js.native
  
  /** SDK generated id of this transform instance. */
  var id: js.UndefOr[String] = js.native
  
  /** User names for all collection inputs to this transform. */
  var inputCollectionName: js.UndefOr[js.Array[String]] = js.native
  
  /** Type of transform. */
  var kind: js.UndefOr[String] = js.native
  
  /** User provided name for this transform instance. */
  var name: js.UndefOr[String] = js.native
  
  /** User names for all collection outputs to this transform. */
  var outputCollectionName: js.UndefOr[js.Array[String]] = js.native
}
object TransformSummary {
  
  @scala.inline
  def apply(): TransformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformSummary]
  }
  
  @scala.inline
  implicit class TransformSummaryMutableBuilder[Self <: TransformSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayData(value: js.Array[DisplayData]): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    @scala.inline
    def setDisplayDataVarargs(value: DisplayData*): Self = StObject.set(x, "displayData", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputCollectionName(value: js.Array[String]): Self = StObject.set(x, "inputCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputCollectionNameUndefined: Self = StObject.set(x, "inputCollectionName", js.undefined)
    
    @scala.inline
    def setInputCollectionNameVarargs(value: String*): Self = StObject.set(x, "inputCollectionName", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputCollectionName(value: js.Array[String]): Self = StObject.set(x, "outputCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputCollectionNameUndefined: Self = StObject.set(x, "outputCollectionName", js.undefined)
    
    @scala.inline
    def setOutputCollectionNameVarargs(value: String*): Self = StObject.set(x, "outputCollectionName", js.Array(value :_*))
  }
}
