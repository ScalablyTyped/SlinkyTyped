package typingsSlinky.antd.countdownMod

import typingsSlinky.antd.statisticStatisticMod.StatisticProps
import typingsSlinky.antd.statisticUtilsMod.countdownValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountdownProps extends StatisticProps {
  var format: js.UndefOr[String] = js.native
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.native
  @JSName("value")
  var value_CountdownProps: js.UndefOr[countdownValueType] = js.native
}

object CountdownProps {
  @scala.inline
  def apply(): CountdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountdownProps]
  }
  @scala.inline
  implicit class CountdownPropsOps[Self <: CountdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinish(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: countdownValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

