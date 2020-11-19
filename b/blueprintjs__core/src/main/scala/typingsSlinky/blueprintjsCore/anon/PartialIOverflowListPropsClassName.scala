package typingsSlinky.blueprintjsCore.anon

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/overflow-list/overflowList.IOverflowListProps<any>> */
@js.native
trait PartialIOverflowListPropsClassName extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var collapseFrom: js.UndefOr[Boundary] = js.native
  
  var items: js.UndefOr[js.Array[_]] = js.native
  
  var minVisibleItems: js.UndefOr[Double] = js.native
  
  var observeParents: js.UndefOr[Boolean] = js.native
  
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[_], Unit]] = js.native
  
  var overflowRenderer: js.UndefOr[js.Function1[/* overflowItems */ js.Array[_], ReactElement]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  
  var visibleItemRenderer: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, ReactChild]] = js.native
}
object PartialIOverflowListPropsClassName {
  
  @scala.inline
  def apply(): PartialIOverflowListPropsClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOverflowListPropsClassName]
  }
  
  @scala.inline
  implicit class PartialIOverflowListPropsClassNameOps[Self <: PartialIOverflowListPropsClassName] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCollapseFrom(value: Boundary): Self = this.set("collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseFrom: Self = this.set("collapseFrom", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMinVisibleItems(value: Double): Self = this.set("minVisibleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVisibleItems: Self = this.set("minVisibleItems", js.undefined)
    
    @scala.inline
    def setObserveParents(value: Boolean): Self = this.set("observeParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObserveParents: Self = this.set("observeParents", js.undefined)
    
    @scala.inline
    def setOnOverflow(value: /* overflowItems */ js.Array[_] => Unit): Self = this.set("onOverflow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOverflow: Self = this.set("onOverflow", js.undefined)
    
    @scala.inline
    def setOverflowRenderer(value: /* overflowItems */ js.Array[_] => ReactElement): Self = this.set("overflowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOverflowRenderer: Self = this.set("overflowRenderer", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    
    @scala.inline
    def setVisibleItemRenderer(value: (/* item */ js.Any, /* index */ Double) => ReactChild): Self = this.set("visibleItemRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteVisibleItemRenderer: Self = this.set("visibleItemRenderer", js.undefined)
  }
}
