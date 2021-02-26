package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleapis.anon.ArtUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOffers extends StObject {
  
  /**
    * A list of offers.
    */
  var items: js.UndefOr[js.Array[ArtUrl]] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaOffers {
  
  @scala.inline
  def apply(): SchemaOffers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOffers]
  }
  
  @scala.inline
  implicit class SchemaOffersMutableBuilder[Self <: SchemaOffers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ArtUrl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ArtUrl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
