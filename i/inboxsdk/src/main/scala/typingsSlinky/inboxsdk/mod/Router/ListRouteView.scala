package typingsSlinky.inboxsdk.mod.Router

import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRouteView extends RouteView {
  
  def addCollapsibleSection(options: SectionDescriptor): CollapsibleSectionView = js.native
  
  // addCollapsibleSection(options: Stream<SectionDescriptor>): CollapsibleSectionView;
  def addSection(options: SectionDescriptor): SectionView = js.native
  
  // addSection(options: Stream<SectionDescriptor>): SectionView;
  def refresh(): Unit = js.native
}
object ListRouteView {
  
  @scala.inline
  def apply(
    addCollapsibleSection: SectionDescriptor => CollapsibleSectionView,
    addSection: SectionDescriptor => SectionView,
    destroyed: Boolean,
    getParams: () => RouteParams,
    getRouteID: () => String,
    getRouteType: () => RouteTypes,
    on: (destroy, js.Function0[Unit]) => Unit,
    refresh: () => Unit
  ): ListRouteView = {
    val __obj = js.Dynamic.literal(addCollapsibleSection = js.Any.fromFunction1(addCollapsibleSection), addSection = js.Any.fromFunction1(addSection), destroyed = destroyed.asInstanceOf[js.Any], getParams = js.Any.fromFunction0(getParams), getRouteID = js.Any.fromFunction0(getRouteID), getRouteType = js.Any.fromFunction0(getRouteType), on = js.Any.fromFunction2(on), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[ListRouteView]
  }
  
  @scala.inline
  implicit class ListRouteViewMutableBuilder[Self <: ListRouteView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCollapsibleSection(value: SectionDescriptor => CollapsibleSectionView): Self = StObject.set(x, "addCollapsibleSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSection(value: SectionDescriptor => SectionView): Self = StObject.set(x, "addSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
