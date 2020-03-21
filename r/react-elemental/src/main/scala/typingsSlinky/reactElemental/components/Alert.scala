package typingsSlinky.reactElemental.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactElemental.mod.AlertProps
import typingsSlinky.reactElemental.mod.AlertSize
import typingsSlinky.reactElemental.mod.AlertType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Alert
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactElemental.mod.Alert] {
  @JSImport("react-elemental", "Alert")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    message: String | ReactElement,
    title: String,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    onDismiss: () => Unit = null,
    size: AlertSize = null,
    `type`: AlertType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactElemental.mod.Alert] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AlertProps
}

