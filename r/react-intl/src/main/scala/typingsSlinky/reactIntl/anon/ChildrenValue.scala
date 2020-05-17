package typingsSlinky.reactIntl.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenValue extends js.Object {
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.native
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any = js.native
}

object ChildrenValue {
  @scala.inline
  def apply(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): ChildrenValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenValue]
  }
  @scala.inline
  implicit class ChildrenValueOps[Self <: ChildrenValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: /* val */ String => ReactElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

