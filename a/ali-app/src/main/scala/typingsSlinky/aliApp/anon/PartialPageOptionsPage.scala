package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.my.Component
import typingsSlinky.aliApp.my.ComponentRelation
import typingsSlinky.aliApp.my.CreateIntersectionObserverOption
import typingsSlinky.aliApp.my.IntersectionObserver
import typingsSlinky.aliApp.my.Options
import typingsSlinky.aliApp.my.Page
import typingsSlinky.aliApp.my.PageScrollToOptions
import typingsSlinky.aliApp.my.SelectorQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.PageOptions & ali-app.my.Page> */
@js.native
trait PartialPageOptionsPage extends js.Object {
  var createIntersectionObserver: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[CreateIntersectionObserverOption], IntersectionObserver]
  ] = js.native
  var createSelectorQuery: js.UndefOr[js.Function0[SelectorQuery]] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dataset: js.UndefOr[String] = js.native
  var forceUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  var getRelationNodes: js.UndefOr[js.Function1[/* relationKey */ String, js.Array[ComponentRelation]]] = js.native
  var hasBehavior: js.UndefOr[js.Function1[/* behavior */ js.Any, Boolean]] = js.native
  var id: js.UndefOr[String] = js.native
  var is: js.UndefOr[String] = js.native
  var onError: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  var onLaunch: js.UndefOr[js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]] = js.native
  var onPullDownRefresh: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]] = js.native
  var pageScrollTo: js.UndefOr[js.Function1[/* option */ js.UndefOr[PageScrollToOptions], Unit]] = js.native
  var properties: js.UndefOr[js.Any] = js.native
  var route: js.UndefOr[js.Function0[Unit]] = js.native
  var selectAllComponents: js.UndefOr[js.Function1[/* selector */ String, js.Array[Component]]] = js.native
  var selectComponent: js.UndefOr[js.Function1[/* selector */ String, Component]] = js.native
  var setData: js.UndefOr[
    js.Function2[/* data */ js.Any, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
  ] = js.native
  var triggerEvent: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* details */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[Partialbubblesbooleancomp], 
      Unit
    ]
  ] = js.native
  var update: js.UndefOr[js.Function0[Unit]] = js.native
}

object PartialPageOptionsPage {
  @scala.inline
  def apply(): PartialPageOptionsPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageOptionsPage]
  }
  @scala.inline
  implicit class PartialPageOptionsPageOps[Self <: PartialPageOptionsPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateIntersectionObserver(value: /* options */ js.UndefOr[CreateIntersectionObserverOption] => IntersectionObserver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createIntersectionObserver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateIntersectionObserver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createIntersectionObserver")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSelectorQuery(value: () => SelectorQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSelectorQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreateSelectorQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSelectorQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withForceUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutForceUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRelationNodes(value: /* relationKey */ String => js.Array[ComponentRelation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRelationNodes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRelationNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRelationNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBehavior(value: /* behavior */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBehavior")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: js.ThisFunction0[/* this */ Page, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: js.ThisFunction0[/* this */ Page, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLaunch(value: js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPullDownRefresh(value: js.ThisFunction0[/* this */ Page, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPullDownRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPageScrollTo(value: /* option */ js.UndefOr[PageScrollToOptions] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageScrollTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageScrollTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageScrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllComponents(value: /* selector */ String => js.Array[Component]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllComponents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectAllComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectComponent(value: /* selector */ String => Component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: (/* data */ js.Any, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerEvent(
      value: (/* name */ String, /* details */ js.UndefOr[js.Any], /* options */ js.UndefOr[Partialbubblesbooleancomp]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTriggerEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

