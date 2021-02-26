package typingsSlinky.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends StObject {
  
  /** The fields to return. If empty, all fields are returned. To only return the name of the document, use `['__name__']`. */
  var fields: js.UndefOr[js.Array[FieldReference]] = js.native
}
object Projection {
  
  @scala.inline
  def apply(): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Projection]
  }
  
  @scala.inline
  implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[FieldReference]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FieldReference*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
