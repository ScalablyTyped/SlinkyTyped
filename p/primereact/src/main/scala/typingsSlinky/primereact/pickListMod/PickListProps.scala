package typingsSlinky.primereact.pickListMod

import slinky.core.facade.ReactElement
import typingsSlinky.primereact.anon.Source
import typingsSlinky.primereact.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickListProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[ReactElement]]] = js.native
  var metaKeySelection: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ Source, Unit]] = js.native
  var onMoveAllToSource: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onMoveAllToTarget: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onMoveToSource: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onMoveToTarget: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onSourceSelect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onTargetSelect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var showSourceControls: js.UndefOr[Boolean] = js.native
  var showTargetControls: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[js.Array[_]] = js.native
  var sourceHeader: js.UndefOr[js.Any] = js.native
  var sourceStyle: js.UndefOr[js.Object] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tabIndex: js.UndefOr[String] = js.native
  var target: js.UndefOr[js.Array[_]] = js.native
  var targetHeader: js.UndefOr[js.Any] = js.native
  var targetStyle: js.UndefOr[js.Object] = js.native
}

object PickListProps {
  @scala.inline
  def apply(): PickListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickListProps]
  }
  @scala.inline
  implicit class PickListPropsOps[Self <: PickListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
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
    def withItemTemplate(value: /* item */ js.Any => js.UndefOr[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaKeySelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKeySelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaKeySelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKeySelection")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* e */ Source => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveAllToSource(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveAllToSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveAllToSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveAllToSource")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveAllToTarget(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveAllToTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveAllToTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveAllToTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveToSource(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveToSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveToSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveToSource")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveToTarget(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveToTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveToTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveToTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSourceSelect(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSourceSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSourceSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSourceSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTargetSelect(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTargetSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTargetSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTargetSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSourceControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSourceControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSourceControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSourceControls")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTargetControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTargetControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTargetControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTargetControls")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetStyle")(js.undefined)
        ret
    }
  }
  
}

