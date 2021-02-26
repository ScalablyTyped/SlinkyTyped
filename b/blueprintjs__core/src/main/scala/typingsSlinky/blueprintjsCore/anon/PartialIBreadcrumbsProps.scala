package typingsSlinky.blueprintjsCore.anon

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typingsSlinky.blueprintjsCore.popoverMod.IPopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumbs.IBreadcrumbsProps> */
@js.native
trait PartialIBreadcrumbsProps extends StObject {
  
  var breadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, ReactElement]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collapseFrom: js.UndefOr[Boundary] = js.native
  
  var currentBreadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, ReactElement]] = js.native
  
  var items: js.UndefOr[js.Array[IBreadcrumbProps]] = js.native
  
  var minVisibleItems: js.UndefOr[Double] = js.native
  
  var overflowListProps: js.UndefOr[PartialIOverflowListProps] = js.native
  
  var popoverProps: js.UndefOr[IPopoverProps] = js.native
}
object PartialIBreadcrumbsProps {
  
  @scala.inline
  def apply(): PartialIBreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIBreadcrumbsProps]
  }
  
  @scala.inline
  implicit class PartialIBreadcrumbsPropsMutableBuilder[Self <: PartialIBreadcrumbsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => ReactElement): Self = StObject.set(x, "breadcrumbRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBreadcrumbRendererUndefined: Self = StObject.set(x, "breadcrumbRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
    
    @scala.inline
    def setCurrentBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => ReactElement): Self = StObject.set(x, "currentBreadcrumbRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentBreadcrumbRendererUndefined: Self = StObject.set(x, "currentBreadcrumbRenderer", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[IBreadcrumbProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: IBreadcrumbProps*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMinVisibleItems(value: Double): Self = StObject.set(x, "minVisibleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVisibleItemsUndefined: Self = StObject.set(x, "minVisibleItems", js.undefined)
    
    @scala.inline
    def setOverflowListProps(value: PartialIOverflowListProps): Self = StObject.set(x, "overflowListProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowListPropsUndefined: Self = StObject.set(x, "overflowListProps", js.undefined)
    
    @scala.inline
    def setPopoverProps(value: IPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
  }
}
