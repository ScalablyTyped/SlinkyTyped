package typingsSlinky.knockstrap

import typingsSlinky.knockstrap.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutTemplateSources extends StObject {
  
  var stringTemplate: Instantiable = js.native
}
object KnockoutTemplateSources {
  
  @scala.inline
  def apply(stringTemplate: Instantiable): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(stringTemplate = stringTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
  
  @scala.inline
  implicit class KnockoutTemplateSourcesMutableBuilder[Self <: KnockoutTemplateSources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStringTemplate(value: Instantiable): Self = StObject.set(x, "stringTemplate", value.asInstanceOf[js.Any])
  }
}
