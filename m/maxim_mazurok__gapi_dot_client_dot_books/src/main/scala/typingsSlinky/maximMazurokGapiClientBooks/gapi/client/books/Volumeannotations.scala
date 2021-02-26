package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Volumeannotations extends StObject {
  
  /** A list of volume annotations. */
  var items: js.UndefOr[js.Array[Volumeannotation]] = js.native
  
  /** Resource type */
  var kind: js.UndefOr[String] = js.native
  
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total number of volume annotations found. */
  var totalItems: js.UndefOr[Double] = js.native
  
  /**
    * The version string for all of the volume annotations in this layer (not just the ones in this response). Note: the version string doesn't apply to the annotation data, just the
    * information in this response (e.g. the location of annotations in the book).
    */
  var version: js.UndefOr[String] = js.native
}
object Volumeannotations {
  
  @scala.inline
  def apply(): Volumeannotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volumeannotations]
  }
  
  @scala.inline
  implicit class VolumeannotationsMutableBuilder[Self <: Volumeannotations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Volumeannotation]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Volumeannotation*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
