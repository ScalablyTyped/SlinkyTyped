package typingsSlinky.antdMobile.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd-mobile.antd-mobile/lib/list.ListProps> */
@js.native
trait PartialListProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var renderFooter: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.native
  
  var renderHeader: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object PartialListProps {
  
  @scala.inline
  def apply(): PartialListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListProps]
  }
  
  @scala.inline
  implicit class PartialListPropsMutableBuilder[Self <: PartialListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRenderFooter(value: js.Function0[ReactElement] | ReactElement): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFooterFunction0(value: () => ReactElement): Self = StObject.set(x, "renderFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderFooterReactElement(value: ReactElement): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
    
    @scala.inline
    def setRenderHeader(value: js.Function0[ReactElement] | ReactElement): Self = StObject.set(x, "renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderHeaderFunction0(value: () => ReactElement): Self = StObject.set(x, "renderHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderHeaderReactElement(value: ReactElement): Self = StObject.set(x, "renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
