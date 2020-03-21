package typingsSlinky.reactOutsideClickHandler.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactOutsideClickHandler.mod.default
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactOutsideClickHandler
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-outside-click-handler", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    onOutsideClick: SyntheticMouseEvent[HTMLElement] => Unit,
    display: block | flex | `inline` | `inline-block` | contents = null,
    useCapture: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1(onOutsideClick))
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(useCapture)) __obj.updateDynamic("useCapture")(useCapture.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactOutsideClickHandler.mod.Props
}

