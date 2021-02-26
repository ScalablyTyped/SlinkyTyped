package typingsSlinky.gatsbyCli.anon

import typingsSlinky.gatsbyCli.errorMapMod.ErrorCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryLevel extends StObject {
  
  var category: ErrorCategory = js.native
  
  var level: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Level = js.native
  
  def text(context: js.Any): String = js.native
  
  var `type`: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Type = js.native
}
object CategoryLevel {
  
  @scala.inline
  def apply(
    category: ErrorCategory,
    level: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Level,
    text: js.Any => String,
    `type`: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Type
  ): CategoryLevel = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryLevel]
  }
  
  @scala.inline
  implicit class CategoryLevelMutableBuilder[Self <: CategoryLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: ErrorCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: typingsSlinky.gatsbyCli.structuredErrorsTypesMod.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
