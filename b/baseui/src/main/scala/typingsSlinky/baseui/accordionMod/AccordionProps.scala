package typingsSlinky.baseui.accordionMod

import slinky.core.TagMod
import typingsSlinky.baseui.anon.Expanded
import typingsSlinky.baseui.anon.SharedPropsexpandednever
import typingsSlinky.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionProps extends js.Object {
  var accordion: js.UndefOr[Boolean] = js.native
  var children: TagMod[Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var initialState: js.UndefOr[AccordionState] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ Expanded, _]] = js.native
  var overrides: js.UndefOr[AccordionOverrides[SharedPropsexpandednever]] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var renderPanelContent: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer[AccordionState]] = js.native
}

object AccordionProps {
  @scala.inline
  def apply(): AccordionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionProps]
  }
  @scala.inline
  implicit class AccordionPropsOps[Self <: AccordionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccordion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccordion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withInitialState(value: AccordionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* args */ Expanded => _): Self = {
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
    def withOverrides(value: AccordionOverrides[SharedPropsexpandednever]): Self = {
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
    def withRenderAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPanelContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPanelContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderPanelContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPanelContent")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReducer(value: (expand, AccordionState, AccordionState) => AccordionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStateReducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.undefined)
        ret
    }
  }
  
}

