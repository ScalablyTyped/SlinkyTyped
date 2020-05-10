package typingsSlinky.rcPicker.decadeHeaderMod

import typingsSlinky.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YearHeaderProps[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType] = js.native
  var prefixCls: String = js.native
  var viewDate: DateType = js.native
  def onNextDecades(): Unit = js.native
  def onPrevDecades(): Unit = js.native
}

object YearHeaderProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onNextDecades: () => Unit,
    onPrevDecades: () => Unit,
    prefixCls: String,
    viewDate: DateType
  ): YearHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onNextDecades = js.Any.fromFunction0(onNextDecades), onPrevDecades = js.Any.fromFunction0(onPrevDecades), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearHeaderProps[DateType]]
  }
  @scala.inline
  implicit class YearHeaderPropsOps[Self[datetype] <: YearHeaderProps[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withGenerateConfig(value: GenerateConfig[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnNextDecades(value: () => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextDecades")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPrevDecades(value: () => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevDecades")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewDate(value: DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

