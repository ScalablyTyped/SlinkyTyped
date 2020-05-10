package typingsSlinky.inboxsdk.mod.Router

import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ListRouteViewOps[Self <: ListRouteView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCollapsibleSection(value: SectionDescriptor => CollapsibleSectionView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCollapsibleSection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddSection(value: SectionDescriptor => SectionView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

