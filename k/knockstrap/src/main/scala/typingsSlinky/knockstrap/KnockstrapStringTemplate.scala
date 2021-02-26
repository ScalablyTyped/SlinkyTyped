package typingsSlinky.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutTemplateSourcesDomElement * / any */ @js.native
trait KnockstrapStringTemplate extends StObject {
  
  var templateName: String = js.native
}
object KnockstrapStringTemplate {
  
  @scala.inline
  def apply(templateName: String): KnockstrapStringTemplate = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapStringTemplate]
  }
  
  @scala.inline
  implicit class KnockstrapStringTemplateMutableBuilder[Self <: KnockstrapStringTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
