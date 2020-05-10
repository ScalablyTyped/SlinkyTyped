package typingsSlinky.reactMathquill.mod

import typingsSlinky.edtrIoMathquill.mod.Config
import typingsSlinky.edtrIoMathquill.mod.MQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.ComponentProps<'span'>, 'onChange'> ]: react.react.ComponentProps<'span'>[P]} */ @js.native
trait Props extends js.Object {
  var config: js.UndefOr[Config] = js.native
  var latex: js.UndefOr[String] = js.native
  var mathquillDidMount: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withLatex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latex")(js.undefined)
        ret
    }
    @scala.inline
    def withMathquillDidMount(value: /* mathField */ MQ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathquillDidMount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMathquillDidMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathquillDidMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* mathField */ MQ => Unit): Self = {
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
  }
  
}

