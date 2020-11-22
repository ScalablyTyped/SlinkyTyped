package typingsSlinky.reactIntl.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactIntl.reactIntlStrings.formatDate
import typingsSlinky.reactIntl.reactIntlStrings.formatTime
import typingsSlinky.std.Intl.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2`[Name /* <: formatDate | formatTime */] extends js.Object {
  
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null = js.native
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape[Name]>[0] */ js.Any = js.native
}
object `2` {
  
  @scala.inline
  def apply[Name /* <: formatDate | formatTime */](
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape[Name]>[0] */ js.Any
  ): `2`[Name] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`[Name]]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`[_], Name /* <: formatDate | formatTime */] (val x: Self with `2`[Name]) extends AnyVal {
    
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
    def setChildren(value: js.Array[DateTimeFormatPart] => ReactElement | Null): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape[Name]>[0] */ js.Any
    ): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
