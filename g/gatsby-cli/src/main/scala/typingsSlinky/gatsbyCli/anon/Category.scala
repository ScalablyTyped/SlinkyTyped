package typingsSlinky.gatsbyCli.anon

import typingsSlinky.gatsbyCli.errorMapMod.ErrorCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends StObject {
  
  var category: ErrorCategory = js.native
  
  var docsUrl: String = js.native
  
  var level: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Level = js.native
  
  def text(context: js.Any): String = js.native
}
object Category {
  
  @scala.inline
  def apply(
    category: ErrorCategory,
    docsUrl: String,
    level: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Level,
    text: js.Any => String
  ): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], docsUrl = docsUrl.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: ErrorCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
