package typingsSlinky.reactIntl.createFormattedComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatter extends js.Object {
  
  var formatDate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ js.Any = js.native
  
  var formatDisplayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDisplayNameOptions */ js.Any = js.native
  
  var formatList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatListOptions */ js.Any = js.native
  
  var formatNumber: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatNumberOptions */ js.Any = js.native
  
  var formatTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ js.Any = js.native
}
object Formatter {
  
  @scala.inline
  def apply(
    formatDate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ js.Any,
    formatDisplayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDisplayNameOptions */ js.Any,
    formatList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatListOptions */ js.Any,
    formatNumber: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatNumberOptions */ js.Any,
    formatTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ js.Any
  ): Formatter = {
    val __obj = js.Dynamic.literal(formatDate = formatDate.asInstanceOf[js.Any], formatDisplayName = formatDisplayName.asInstanceOf[js.Any], formatList = formatList.asInstanceOf[js.Any], formatNumber = formatNumber.asInstanceOf[js.Any], formatTime = formatTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatter]
  }
  
  @scala.inline
  implicit class FormatterOps[Self <: Formatter] (val x: Self) extends AnyVal {
    
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
    def setFormatDate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ js.Any
    ): Self = this.set("formatDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatDisplayName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDisplayNameOptions */ js.Any
    ): Self = this.set("formatDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatList(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatListOptions */ js.Any
    ): Self = this.set("formatList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNumber(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatNumberOptions */ js.Any
    ): Self = this.set("formatNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatTime(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ js.Any
    ): Self = this.set("formatTime", value.asInstanceOf[js.Any])
  }
}
