package typingsSlinky.egjsAxes.inputTypeMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputType extends js.Object {
  var axes: js.Array[String] = js.native
  var disable: js.UndefOr[js.Function0[_]] = js.native
  var element: HTMLElement = js.native
  var enable: js.UndefOr[js.Function0[_]] = js.native
  var hammer: js.UndefOr[js.Any] = js.native
  var isEnable: js.UndefOr[js.Function0[Boolean]] = js.native
  def connect(observer: IInputTypeObserver): IInputType = js.native
  def destroy(): js.Any = js.native
  def disconnect(): js.Any = js.native
  def mapAxes(axes: js.Array[String]): js.Any = js.native
}

object IInputType {
  @scala.inline
  def apply(
    axes: js.Array[String],
    connect: IInputTypeObserver => IInputType,
    destroy: () => js.Any,
    disconnect: () => js.Any,
    element: HTMLElement,
    mapAxes: js.Array[String] => js.Any
  ): IInputType = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], connect = js.Any.fromFunction1(connect), destroy = js.Any.fromFunction0(destroy), disconnect = js.Any.fromFunction0(disconnect), element = element.asInstanceOf[js.Any], mapAxes = js.Any.fromFunction1(mapAxes))
    __obj.asInstanceOf[IInputType]
  }
  @scala.inline
  implicit class IInputTypeOps[Self <: IInputType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect(value: IInputTypeObserver => IInputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisconnect(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapAxes(value: js.Array[String] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapAxes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisable(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withHammer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hammer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHammer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hammer")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnable")(js.undefined)
        ret
    }
  }
  
}

