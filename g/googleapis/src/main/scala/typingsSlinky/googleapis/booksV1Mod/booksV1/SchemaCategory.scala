package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleapis.anon.BadgeUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCategory extends StObject {
  
  /**
    * A list of onboarding categories.
    */
  var items: js.UndefOr[js.Array[BadgeUrl]] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaCategory {
  
  @scala.inline
  def apply(): SchemaCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategory]
  }
  
  @scala.inline
  implicit class SchemaCategoryMutableBuilder[Self <: SchemaCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[BadgeUrl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: BadgeUrl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
