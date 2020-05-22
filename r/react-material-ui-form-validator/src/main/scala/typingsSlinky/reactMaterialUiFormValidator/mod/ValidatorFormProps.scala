package typingsSlinky.reactMaterialUiFormValidator.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorFormProps
  extends /* key */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var debounceTime: js.UndefOr[Double] = js.undefined
  var instantValidate: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* errors */ js.Array[_], Unit]] = js.undefined
  def onSubmit(event: SyntheticEvent[EventTarget with Element, Event]): Unit
}

object ValidatorFormProps {
  @scala.inline
  def apply(
    onSubmit: SyntheticEvent[EventTarget with Element, Event] => Unit,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    className: String = null,
    debounceTime: js.UndefOr[Double] = js.undefined,
    instantValidate: js.UndefOr[Boolean] = js.undefined,
    onError: /* errors */ js.Array[_] => Unit = null
  ): ValidatorFormProps = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(debounceTime)) __obj.updateDynamic("debounceTime")(debounceTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(instantValidate)) __obj.updateDynamic("instantValidate")(instantValidate.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[ValidatorFormProps]
  }
}

