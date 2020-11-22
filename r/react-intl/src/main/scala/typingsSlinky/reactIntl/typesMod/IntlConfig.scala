package typingsSlinky.reactIntl.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreIntlConfig<React.ReactNode> * / any */ @js.native
trait IntlConfig extends js.Object {
  
  var textComponent: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.native
  
  var wrapRichTextChunksInFragment: js.UndefOr[Boolean] = js.native
}
object IntlConfig {
  
  @scala.inline
  def apply(): IntlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntlConfig]
  }
  
  @scala.inline
  implicit class IntlConfigOps[Self <: IntlConfig] (val x: Self) extends AnyVal {
    
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
    def setTextComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = this.set("textComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextComponent: Self = this.set("textComponent", js.undefined)
    
    @scala.inline
    def setWrapRichTextChunksInFragment(value: Boolean): Self = this.set("wrapRichTextChunksInFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapRichTextChunksInFragment: Self = this.set("wrapRichTextChunksInFragment", js.undefined)
  }
}
