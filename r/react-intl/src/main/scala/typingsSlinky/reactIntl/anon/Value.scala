package typingsSlinky.reactIntl.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactIntl.reactIntlStrings.formatDate
import typingsSlinky.reactIntl.reactIntlStrings.formatTime
import typingsSlinky.std.Intl.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value[Name /* <: formatDate | formatTime */] extends js.Object {
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/types.IntlShape[Name]>[0] */ js.Any = js.native
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null = js.native
}

object Value {
  @scala.inline
  def apply[Name](
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/types.IntlShape[Name]>[0] */ js.Any
  ): Value[Name] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[Name]]
  }
  @scala.inline
  implicit class ValueOps[Self[name] <: Value[name], Name] (val x: Self[Name]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Name] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Name]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Name] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Name] with Other]
    @scala.inline
    def withChildren(value: js.Array[DateTimeFormatPart] => ReactElement | Null): Self[Name] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/types.IntlShape[Name]>[0] */ js.Any
    ): Self[Name] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

