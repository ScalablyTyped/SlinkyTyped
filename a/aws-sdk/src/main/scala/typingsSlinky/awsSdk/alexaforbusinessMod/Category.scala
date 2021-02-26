package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends StObject {
  
  /**
    * The ID of the skill store category.
    */
  var CategoryId: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.CategoryId] = js.native
  
  /**
    * The name of the skill store category.
    */
  var CategoryName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.CategoryName] = js.native
}
object Category {
  
  @scala.inline
  def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryId(value: CategoryId): Self = StObject.set(x, "CategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryIdUndefined: Self = StObject.set(x, "CategoryId", js.undefined)
    
    @scala.inline
    def setCategoryName(value: CategoryName): Self = StObject.set(x, "CategoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryNameUndefined: Self = StObject.set(x, "CategoryName", js.undefined)
  }
}
