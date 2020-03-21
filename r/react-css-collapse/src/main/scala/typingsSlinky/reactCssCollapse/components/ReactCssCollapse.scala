package typingsSlinky.reactCssCollapse.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactCssCollapse.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCssCollapse
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-css-collapse", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    isOpen: Boolean,
    onRest: () => Unit = null,
    transition: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction0(onRest))
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactCssCollapse.mod.Props
}

