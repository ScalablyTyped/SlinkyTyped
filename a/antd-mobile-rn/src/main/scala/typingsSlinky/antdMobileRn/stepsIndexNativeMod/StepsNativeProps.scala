package typingsSlinky.antdMobileRn.stepsIndexNativeMod

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobileRn.stepsStyleIndexNativeMod.IStepsStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepsNativeProps extends StepsProps {
  @JSName("styles")
  var styles_StepsNativeProps: js.UndefOr[IStepsStyle] = js.native
}

object StepsNativeProps {
  @scala.inline
  def apply(children: js.Array[ReactElement]): StepsNativeProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsNativeProps]
  }
  @scala.inline
  implicit class StepsNativePropsOps[Self <: StepsNativeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyles(value: IStepsStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

