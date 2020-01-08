package typingsSlinky.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonProps extends js.Object {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.undefined
  var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
}

object Anon_ButtonProps {
  @scala.inline
  def apply(
    buttonProps: StringDictionary[js.Any] = null,
    className: String = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    onClick: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    ref: Ref[HTMLDivElement] = null
  ): Anon_ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ButtonProps]
  }
}

