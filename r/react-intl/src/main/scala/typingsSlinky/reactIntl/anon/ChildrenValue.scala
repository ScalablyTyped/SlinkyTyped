package typingsSlinky.reactIntl.anon

import slinky.core.facade.ReactElement
import typingsSlinky.std.Intl.NumberFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenValue extends js.Object {
  
  def children(`val`: js.Array[NumberFormatPart]): ReactElement | Null = js.native
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape['formatNumber']>[0] */ js.Any = js.native
}
object ChildrenValue {
  
  @scala.inline
  def apply(
    children: js.Array[NumberFormatPart] => ReactElement | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape['formatNumber']>[0] */ js.Any
  ): ChildrenValue = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenValue]
  }
  
  @scala.inline
  implicit class ChildrenValueOps[Self <: ChildrenValue] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: js.Array[NumberFormatPart] => ReactElement | Null): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape['formatNumber']>[0] */ js.Any
    ): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
