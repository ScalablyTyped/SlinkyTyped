package typingsSlinky.reactIntl.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.native
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallValuesOpts>[0] */ js.Any = js.native
}
object `2` {
  
  @scala.inline
  def apply(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallValuesOpts>[0] */ js.Any
  ): `2` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* val */ String => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallValuesOpts>[0] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
