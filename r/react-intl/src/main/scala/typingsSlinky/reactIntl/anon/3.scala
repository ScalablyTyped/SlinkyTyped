package typingsSlinky.reactIntl.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends js.Object {
  
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.native
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape['formatDate']>[0] */ js.Any = js.native
}
object `3` {
  
  @scala.inline
  def apply(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape['formatDate']>[0] */ js.Any
  ): `3` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3Ops`[Self <: `3`] (val x: Self) extends AnyVal {
    
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
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape['formatDate']>[0] */ js.Any
    ): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: /* val */ String => ReactElement | Null): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
