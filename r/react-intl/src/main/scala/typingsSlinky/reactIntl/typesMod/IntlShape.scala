package typingsSlinky.reactIntl.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlFormatters<React.ReactNode> * / any */ @js.native
trait IntlShape extends IntlConfig {
  
  var formatters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Formatters */ js.Any = js.native
}
object IntlShape {
  
  @scala.inline
  def apply(
    formatters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Formatters */ js.Any
  ): IntlShape = {
    val __obj = js.Dynamic.literal(formatters = formatters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlShape]
  }
  
  @scala.inline
  implicit class IntlShapeOps[Self <: IntlShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormatters(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Formatters */ js.Any
    ): Self = this.set("formatters", value.asInstanceOf[js.Any])
  }
}
