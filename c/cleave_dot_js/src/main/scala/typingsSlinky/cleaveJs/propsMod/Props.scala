package typingsSlinky.cleaveJs.propsMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.cleaveJs.optionsMod.CleaveOptions
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends InputHTMLAttributes[HTMLInputElement] {
  var htmlRef: js.UndefOr[js.Function1[/* i */ js.Any, Unit]] = js.native
  @JSName("onChange")
  var onChange_Props: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  var onInit: js.UndefOr[InitHandler] = js.native
  var options: CleaveOptions = js.native
}

object Props {
  @scala.inline
  def apply(options: CleaveOptions): Props = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: CleaveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlRef(value: /* i */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHtmlRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlRef")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = {
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
    def withOnInit(value: /* owner */ ReactInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
  }
  
}

