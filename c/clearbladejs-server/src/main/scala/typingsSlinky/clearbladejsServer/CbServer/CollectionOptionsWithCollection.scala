package typingsSlinky.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionOptionsWithCollection extends StObject {
  
  var collection: String = js.native
}
object CollectionOptionsWithCollection {
  
  @scala.inline
  def apply(collection: String): CollectionOptionsWithCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptionsWithCollection]
  }
  
  @scala.inline
  implicit class CollectionOptionsWithCollectionMutableBuilder[Self <: CollectionOptionsWithCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
  }
}
