package typingsSlinky.reactVirtualizedSelect.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactVirtualizedSelect.anon.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalVirtualizedSelectProps[TValue] extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.native
  var optionHeight: js.UndefOr[Double | (js.Function1[/* options */ Option[TValue], Double])] = js.native
  var optionRenderer: js.UndefOr[js.Function1[/* options */ VirtualizedOptionRenderOptions[TValue], ReactElement]] = js.native
  var selectComponent: js.UndefOr[ReactComponentClass[_]] = js.native
}

object AdditionalVirtualizedSelectProps {
  @scala.inline
  def apply[TValue](): AdditionalVirtualizedSelectProps[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalVirtualizedSelectProps[TValue]]
  }
  @scala.inline
  implicit class AdditionalVirtualizedSelectPropsOps[Self[tvalue] <: AdditionalVirtualizedSelectProps[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def withMaxHeight(value: Double): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionHeightFunction1(value: /* options */ Option[TValue] => Double): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptionHeight(value: Double | (js.Function1[/* options */ Option[TValue], Double])): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionHeight: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionRenderer(value: /* options */ VirtualizedOptionRenderOptions[TValue] => ReactElement): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOptionRenderer: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectComponentFunctionComponent(value: ReactComponentClass[_]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectComponentComponentClass(value: ReactComponentClass[_]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectComponent(value: ReactComponentClass[_]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectComponent: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponent")(js.undefined)
        ret
    }
  }
  
}

