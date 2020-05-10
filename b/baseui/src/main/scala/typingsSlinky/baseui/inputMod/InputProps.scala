package typingsSlinky.baseui.inputMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProps extends BaseInputProps[HTMLInputElement] {
  var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any]] = js.native
  @JSName("overrides")
  var overrides_InputProps: js.UndefOr[InputOverrides] = js.native
  var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any]] = js.native
}

object InputProps {
  @scala.inline
  def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  @scala.inline
  implicit class InputPropsOps[Self <: InputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndEnhancerReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndEnhancerFunction1(value: /* args */ SharedProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndEnhancer(value: (js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: InputOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withStartEnhancerReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEnhancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartEnhancerFunction1(value: /* args */ SharedProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartEnhancer(value: (js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEnhancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEnhancer")(js.undefined)
        ret
    }
  }
  
}

