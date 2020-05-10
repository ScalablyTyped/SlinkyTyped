package typingsSlinky.reactTextareaAutosize.mod

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextareaAutosizeProps
  extends AllHTMLAttributes[HTMLTextAreaElement]
     with ClassAttributes[HTMLTextAreaElement] {
  /**
    * Allows an owner to retrieve the DOM node.
    */
  var inputRef: js.UndefOr[
    (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | ReactRef[HTMLTextAreaElement]
  ] = js.native
  /**
    * Maximum number of rows to show.
    */
  var maxRows: js.UndefOr[Double] = js.native
  /**
    * Alias for `rows`.
    */
  var minRows: js.UndefOr[Double] = js.native
  /**
    * Callback on value change
    * @param event
    */
  @JSName("onChange")
  var onChange_TextareaAutosizeProps: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]] = js.native
  /**
    * Callback on height change
    * @param height
    */
  var onHeightChange: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.native
  /**
    * Try to cache DOM measurements performed by component so that we don't
    * touch DOM when it's not needed.
    *
    * This optimization doesn't work if we dynamically style `<textarea />`
    * component.
    * @default false
    */
  var useCacheForDOMMeasurements: js.UndefOr[Boolean] = js.native
  /**
    * Current textarea value
    */
  @JSName("value")
  var value_TextareaAutosizeProps: js.UndefOr[String] = js.native
}

object TextareaAutosizeProps {
  @scala.inline
  def apply(): TextareaAutosizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaAutosizeProps]
  }
  @scala.inline
  implicit class TextareaAutosizePropsOps[Self <: TextareaAutosizeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputRefRefObject(value: ReactRef[HTMLTextAreaElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputRefFunction1(value: /* node */ HTMLTextAreaElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInputRef(value: (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | ReactRef[HTMLTextAreaElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* event */ ChangeEvent[HTMLTextAreaElement] => Unit): Self = {
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
    def withOnHeightChange(value: /* height */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeightChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHeightChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeightChange")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCacheForDOMMeasurements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCacheForDOMMeasurements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCacheForDOMMeasurements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCacheForDOMMeasurements")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
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

