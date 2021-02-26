package typingsSlinky.reactIntl.anon

import typingsSlinky.reactIntl.srcTypesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-intl.react-intl/src/components/injectIntl.WrappedComponentProps<'intl'> */
@js.native
trait WrappedComponentPropsintlIntl extends StObject {
  
  var intl: IntlShape = js.native
}
object WrappedComponentPropsintlIntl {
  
  @scala.inline
  def apply(intl: IntlShape): WrappedComponentPropsintlIntl = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentPropsintlIntl]
  }
  
  @scala.inline
  implicit class WrappedComponentPropsintlIntlMutableBuilder[Self <: WrappedComponentPropsintlIntl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
  }
}
