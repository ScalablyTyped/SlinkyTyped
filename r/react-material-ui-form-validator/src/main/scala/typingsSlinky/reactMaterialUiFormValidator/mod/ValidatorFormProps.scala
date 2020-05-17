package typingsSlinky.reactMaterialUiFormValidator.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorFormProps
  extends /* key */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.native
  var debounceTime: js.UndefOr[Double] = js.native
  var instantValidate: js.UndefOr[Boolean] = js.native
  var onError: js.UndefOr[js.Function1[/* errors */ js.Array[_], Unit]] = js.native
  def onSubmit(event: SyntheticEvent[EventTarget with Element, Event]): Unit = js.native
}

object ValidatorFormProps {
  @scala.inline
  def apply(onSubmit: SyntheticEvent[EventTarget with Element, Event] => Unit): ValidatorFormProps = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    __obj.asInstanceOf[ValidatorFormProps]
  }
  @scala.inline
  implicit class ValidatorFormPropsOps[Self <: ValidatorFormProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSubmit(value: SyntheticEvent[EventTarget with Element, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounceTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInstantValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstantValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* errors */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
  }
  
}

