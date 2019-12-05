package typingsSlinky.reactDashTextDashTruncate.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTextDashTruncate.reactDashTextDashTruncateMod.TextTruncateProps
import typingsSlinky.reactDashTextDashTruncate.reactDashTextDashTruncateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashTextDashTruncate
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-text-truncate", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    containerClassName: String = null,
    element: String = null,
    line: Double | Boolean = null,
    maxCalculateTimes: Int | Double = null,
    onCalculated: () => Unit = null,
    onToggled: /* truncated */ Boolean => Unit = null,
    onTruncated: () => Unit = null,
    text: String = null,
    textElement: TagMod[Any] = null,
    textTruncateChild: TagMod[Any] = null,
    truncateText: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (maxCalculateTimes != null) __obj.updateDynamic("maxCalculateTimes")(maxCalculateTimes.asInstanceOf[js.Any])
    if (onCalculated != null) __obj.updateDynamic("onCalculated")(js.Any.fromFunction0(onCalculated))
    if (onToggled != null) __obj.updateDynamic("onToggled")(js.Any.fromFunction1(onToggled))
    if (onTruncated != null) __obj.updateDynamic("onTruncated")(js.Any.fromFunction0(onTruncated))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textElement != null) __obj.updateDynamic("textElement")(textElement.asInstanceOf[js.Any])
    if (textTruncateChild != null) __obj.updateDynamic("textTruncateChild")(textTruncateChild.asInstanceOf[js.Any])
    if (truncateText != null) __obj.updateDynamic("truncateText")(truncateText.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TextTruncateProps
}

