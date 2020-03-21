package typingsSlinky.jupyterlabExtensionmanager.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CollapsibleSection
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.CollapsibleSection] {
  @JSImport("@jupyterlab/extensionmanager", "CollapsibleSection")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    header: String,
    errorMessage: String = null,
    headerElements: TagMod[Any] = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onCollapse: /* isOpen */ Boolean => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.CollapsibleSection] = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (headerElements != null) __obj.updateDynamic("headerElements")(headerElements.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IProperties
}

