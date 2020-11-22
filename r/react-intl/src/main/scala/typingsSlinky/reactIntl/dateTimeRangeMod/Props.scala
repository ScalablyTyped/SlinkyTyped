package typingsSlinky.reactIntl.dateTimeRangeMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions * / any */ @js.native
trait Props extends js.Object {
  
  var children: js.UndefOr[js.Function1[/* value */ ReactElement, ReactElement | Null]] = js.native
  
  var from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[0] */ js.Any = js.native
  
  var to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[1] */ js.Any = js.native
}
object Props {
  
  @scala.inline
  def apply(
    from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[0] */ js.Any,
    to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[1] */ js.Any
  ): Props = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setFrom(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[0] */ js.Any
    ): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[1] */ js.Any
    ): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: /* value */ ReactElement => ReactElement | Null): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
