package typingsSlinky.rmcAlign.alignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAlignProps extends js.Object {
  var childrenProps: js.UndefOr[js.Object] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var monitorBufferTime: js.UndefOr[Double] = js.native
  var monitorWindowResize: js.UndefOr[Boolean] = js.native
  var onAlign: js.UndefOr[js.Function2[/* source */ js.Any, /* align */ js.Any, Unit]] = js.native
  def target(): Unit = js.native
}

object IAlignProps {
  @scala.inline
  def apply(target: () => Unit): IAlignProps = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
    __obj.asInstanceOf[IAlignProps]
  }
  @scala.inline
  implicit class IAlignPropsOps[Self <: IAlignProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChildrenProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitorBufferTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorBufferTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitorBufferTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorBufferTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitorWindowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorWindowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitorWindowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorWindowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAlign(value: (/* source */ js.Any, /* align */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlign")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlign")(js.undefined)
        ret
    }
  }
  
}

