package typingsSlinky.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListFooterProps> */
@js.native
trait PartialListFooterProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
}
object PartialListFooterProps {
  
  @scala.inline
  def apply(): PartialListFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListFooterProps]
  }
  
  @scala.inline
  implicit class PartialListFooterPropsMutableBuilder[Self <: PartialListFooterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
