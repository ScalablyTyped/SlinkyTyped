package typingsSlinky.reactBootstrapTypeahead.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrapTypeahead.mod.OverlayProps
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Overlay] {
  @JSImport("react-bootstrap-typeahead", "Overlay")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    container: HTMLElement,
    align: TypeaheadAlign = null,
    dropup: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    onMenuHide: () => Unit = null,
    onMenuShow: () => Unit = null,
    onMenuToggle: /* show */ Boolean => Unit = null,
    referenceElement: HTMLElement = null,
    show: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Overlay] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (onMenuHide != null) __obj.updateDynamic("onMenuHide")(js.Any.fromFunction0(onMenuHide))
    if (onMenuShow != null) __obj.updateDynamic("onMenuShow")(js.Any.fromFunction0(onMenuShow))
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(js.Any.fromFunction1(onMenuToggle))
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = OverlayProps
}

